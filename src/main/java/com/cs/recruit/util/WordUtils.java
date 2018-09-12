package com.cs.recruit.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import freemarker.template.utility.DateUtil;

import java.io.*;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;


/**
 * Created by asus on 2018/8/22.
 */
public class WordUtils {
    //配置信息
    private static Configuration configuration = null;
    //这里注意是利用WordUtils的类加载动态获得模板文件的位置
//    private static final String templateFolder = WordUtils.class.getClassLoader().getResource("../../").getPath() + "WEB-INF/templates/";
    private static final String templateFolder = "E:/IDEA/recruit/src/main/webapp/WEB-INF/templetes";
    static {
        configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");
        try {
            configuration.setDirectoryForTemplateLoading(new File(templateFolder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private WordUtils(){
        throw new AssertionError();
    }
    public static void exportMillCertificateWord(HttpServletResponse response, Map map,String title,String ftlFile) throws IOException{
        Template freemarkerTemplate = configuration.getTemplate(ftlFile);
        File file = null;
        InputStream fin = null;
        ServletOutputStream out = null;
       try {
           //调用工具类的createDoc方法生成word文档
           file = createDoc(map,freemarkerTemplate);
           fin = new FileInputStream(file);
           response.setCharacterEncoding("utf-8");
           response.setContentType("application/msword");
           //设置浏览器以下载的方式处理该文件名
           String fileName = title+ new Date() + ".doc";
           response.setHeader("Content-Disposition", "attachment;filename=".concat(String.valueOf(URLEncoder.encode(fileName, "UTF-8"))));
           out = response.getOutputStream();
           byte[] buffer = new byte[512]; //缓冲区
           int bytesToRead = -1;
           //通过循环讲读入的word文件的内容输出到浏览器中
           while ((bytesToRead = fin.read(buffer)) != -1){
               out.write(buffer,0,bytesToRead);
           }
       }finally {
           if (fin != null){
               fin.close();
           }
           if (out != null){
               out.close();
           }
           if (file != null){
               file.delete();//删除临时文件
           }
       }
    }

    private static File createDoc(Map<?,?> dataMap, Template template) {
        String name = "sellPlan.doc";
        File f = new File(name);
        Template t = template;
        try {
            //这个地方不能使用FileWriter，因为需要指定编码类型否则生成word文档因为会有无法识别的编码而无法打开
            Writer w = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
            t.process(dataMap,w);
            w.close();
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return f;
    }
}
