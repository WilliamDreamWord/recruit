package com.cs.recruit.dto;

import com.cs.recruit.entity.Personality_EI;
import com.cs.recruit.entity.Personality_JP;
import com.cs.recruit.entity.Personality_SN;
import com.cs.recruit.entity.Personality_TF;

import java.util.List;

/**
 * Created by asus on 2018/8/14.
 */
public class CWDto {
      private String id;
      private String num;
      private String name;
      private String a;
      private String b;
      public String toString(){
          return "[" + id + " " + num + " " + name + " " + a + " " + b + "]";
      }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

}
