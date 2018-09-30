/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50037
Source Host           : localhost:3306
Source Database       : recruit

Target Server Type    : MYSQL
Target Server Version : 50037
File Encoding         : 65001

Date: 2018-09-08 17:59:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apply_form
-- ----------------------------
DROP TABLE IF EXISTS `apply_form`;
CREATE TABLE `apply_form` (
  `apply_id` varchar(50) NOT NULL,
  `post` varchar(10) default NULL,
  `money` varchar(10) default NULL,
  `formdate` varchar(10) default NULL,
  `comedate` varchar(10) default NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`apply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apply_form
-- ----------------------------
INSERT INTO `apply_form` VALUES ('001aa489-4052-4d44-b6ef-a43c7c72bc1f', '应用软件开发部', '5000', '2018-09-07', '2018-09-07', '7f317809-c6fd-41da-be55-a59863553a65');

-- ----------------------------
-- Table structure for assistent_answer
-- ----------------------------
DROP TABLE IF EXISTS `assistent_answer`;
CREATE TABLE `assistent_answer` (
  `assans_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `first_ans` text,
  `second_ans` text,
  `third_ans` text,
  PRIMARY KEY  (`assans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of assistent_answer
-- ----------------------------
# INSERT INTO `assistent_answer` VALUES ('6a3ba4d5-addd-449d-a9f6-466ae69e0b56', '7f317809-c6fd-41da-be55-a59863553a65', 'other-第一题答案', 'other-第一题答案', null);
INSERT INTO `assistent_answer` VALUES ('c7afef5d-91bf-4e07-85b2-493b06462d1d', '7f317809-c6fd-41da-be55-a59863553a65', '第一题答案', '第二题答案', '第二题答案');
# INSERT INTO `assistent_answer` VALUES ('f6d2b9a7-3f56-421d-8225-b82d7f51f32d', '7f317809-c6fd-41da-be55-a59863553a65', '第一题答案', '第二题答案', '第二题答案');

-- ----------------------------
-- Table structure for assistent_subject
-- ----------------------------
DROP TABLE IF EXISTS `assistent_subject`;
CREATE TABLE `assistent_subject` (
  `asssub_id` varchar(50) NOT NULL,
  `first` text NOT NULL,
  `second` text NOT NULL,
  `third` text NOT NULL,
  PRIMARY KEY  (`asssub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of assistent_subject
-- ----------------------------
INSERT INTO `assistent_subject` VALUES ('1', '1,请写出你的三个优点和三个缺点。', '  2,您认为优质的客户服务应当包括哪些内容？', ' 3,案例分析：\r\n   您收到湖北黄冈客户A公司的订单，要求订单中的货品在3天内要送到指定地点，但按以往的货运经验，重庆到黄冈一般要4天才可以送到，如果您是湖北的客服人员，您准备怎么来处理此事呢？\r\n');

-- ----------------------------
-- Table structure for employ
-- ----------------------------
DROP TABLE IF EXISTS `employ`;
CREATE TABLE `employ` (
  `employ_id` varchar(50) NOT NULL,
  `evaluate_id` varchar(50) default NULL,
  `colligate_text` text,
  `colligate` varchar(10) default NULL,
  `manager_text` text,
  `manager` varchar(10) default NULL,
  PRIMARY KEY  (`employ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employ
-- ----------------------------
# INSERT INTO `employ` VALUES ('f59700ee-5ef2-4e4c-b3ed-08d7e08658e8', 'db24f4b0-175a-4800-9e57-bbe6c63800aa', '11', '11', '11', '11');

-- ----------------------------
-- Table structure for face
-- ----------------------------
DROP TABLE IF EXISTS `face`;
CREATE TABLE `face` (
  `face_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `eori` varchar(50),
  `sorn` varchar(50),
  `torf` varchar(50),
  `jorp` varchar(50),
  `f_sum` varchar(50),
  `f_result` varchar(50),
  PRIMARY KEY  (`face_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of face
-- ----------------------------

-- ----------------------------
-- Table structure for family
-- ----------------------------
DROP TABLE IF EXISTS `family`;
CREATE TABLE `family` (
  `family_id` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `relay` varchar(10) default NULL,
  `name` varchar(10) default NULL,
  `f_address` varchar(100) default NULL,
  `f_post` varchar(20) default NULL,
  `f_phone` varchar(20) default NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`family_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of family
-- ----------------------------
INSERT INTO `family` VALUES ('8ef4becf-0a27-4348-80db-ba54c4d63b86', '未婚未育', 'efwfw', 'freere', 'refegtr', 'grtgrt', 'gegegre', '7f317809-c6fd-41da-be55-a59863553a65');

-- ----------------------------
-- Table structure for first_try
-- ----------------------------
DROP TABLE IF EXISTS `first_try`;
CREATE TABLE `first_try` (
  `firsttry_id` varchar(50) NOT NULL default '',
  `evaluate_id` varchar(50) default NULL,
  `first_colligate_text` text,
  `first_colligate` varchar(10) default NULL,
  PRIMARY KEY (`firsttry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of first_try
-- ----------------------------
# INSERT INTO `first_try` VALUES ('68cc821d-b817-4498-a08f-8b904e86c31d', 'db24f4b0-175a-4800-9e57-bbe6c63800aa', '11', '11');

-- ----------------------------
-- Table structure for other_answer
-- ----------------------------
DROP TABLE IF EXISTS `other_answer`;
CREATE TABLE `other_answer` (
  `othans_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `first_ans` text,
  `second_ans` text,
  PRIMARY KEY  (`othans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of other_answer
-- ----------------------------
INSERT INTO `other_answer` VALUES ('8ac8719f-7aba-47bf-b5ae-d346d52e72ec', '7f317809-c6fd-41da-be55-a59863553a65', 'other-第一题答案', 'other-第一题答案');

-- ----------------------------
-- Table structure for other_subject
-- ----------------------------
DROP TABLE IF EXISTS `other_subject`;
CREATE TABLE `other_subject` (
  `othsub_id` varchar(50) NOT NULL,
  `first` varchar(255) NOT NULL,
  `second` varchar(255) NOT NULL,
  PRIMARY KEY  (`othsub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of other_subject
-- ----------------------------
INSERT INTO `other_subject` VALUES ('1', '1、请写出你的三个优点和三个缺点。', '2、请写出你对所应聘职位及公司的了解。');

-- ----------------------------
-- Table structure for personality_ei
-- ----------------------------
DROP TABLE IF EXISTS `personality_ei`;
CREATE TABLE `personality_ei` (
  `EI_id` varchar(50) NOT NULL,
  `EI_num` varchar(50) default NULL,
  `EI_name` varchar(255) default NULL,
  `EI_a` varchar(255) NOT NULL,
  `EI_b` varchar(255) NOT NULL,
  PRIMARY KEY  (`EI_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_ei
-- ----------------------------
INSERT INTO `personality_ei` VALUES ('1', '1', '当你遇到新朋友时，你', '说话的时间与聆听的时间相当。', '聆听的时间会比说话的时间多。');
INSERT INTO `personality_ei` VALUES ('10', '37', '下列哪个说法最能贴切形容你对自己的看法？', '爽朗。', '沉稳。');
INSERT INTO `personality_ei` VALUES ('11', '41', '下列哪个说法最能贴切形容你对自己的看法？', '率直。', '内敛。');
INSERT INTO `personality_ei` VALUES ('12', '45', '你会倾向', '自己的工作被欣赏，即使你自己并不满意。', '创造一些有长远价值的东西，但不一定需在别人知道是你做的。');
INSERT INTO `personality_ei` VALUES ('2', '5', '你参与社交聚会时', '总是能认识新朋友。', '只跟几个亲密挚友呆在一起。');
INSERT INTO `personality_ei` VALUES ('3', '9', '下列哪一种说法较适合你？', '当我与友人尽兴后，我会感到精力充沛，并会继续追求这种欢娱。', '当我与友人尽兴后，我会感到疲累，觉得需要一些空间。');
INSERT INTO `personality_ei` VALUES ('4', '13', '下列哪一种说法较适合你？', '我经常边说话，边思考。', '我在说话前，通常会思考要说的话。');
INSERT INTO `personality_ei` VALUES ('5', '17', '下列哪一种说法较适合你？', '认识我的人，一般都知道什么对我来说是重要的。', '除了我感觉亲近的人，我不会对人说出什么对我来说是重要的。');
INSERT INTO `personality_ei` VALUES ('6', '21', '下列哪一种说法较适合你？', '我独处太久，便会感到不安。', '若没有足够的自处时间，我便会感到烦躁不安。');
INSERT INTO `personality_ei` VALUES ('7', '25', '当你放假时，你多数会', '花多些时间与别人共度。', '花多些时间自己阅读、散步或者发白日梦。');
INSERT INTO `personality_ei` VALUES ('8', '29', '当你放假时，你多数会', '参观著名景点。', '花时间逛博物馆和一些较为幽静的地方。');
INSERT INTO `personality_ei` VALUES ('9', '33', '下列哪个说法最能贴切形容你对自己的看法？', '坦率。', '深沉。');

-- ----------------------------
-- Table structure for personality_ei_ans
-- ----------------------------
DROP TABLE IF EXISTS `personality_ei_ans`;
CREATE TABLE `personality_ei_ans` (
  `EI_ans_id` varchar(50) NOT NULL,
  `EI_id` varchar(50) default NULL,
  `EI_num` varchar(50) default NULL,
  `EI_a_ans` varchar(50) NOT NULL,
  `EI_b_ans` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`EI_ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_ei_ans
-- ----------------------------

-- ----------------------------
-- Table structure for personality_jp
-- ----------------------------
DROP TABLE IF EXISTS `personality_jp`;
CREATE TABLE `personality_jp` (
  `JP_id` varchar(50) NOT NULL,
  `JP_num` varchar(50) default NULL,
  `JP_name` varchar(255) default NULL,
  `JP_a` varchar(255) NOT NULL,
  `JP_b` varchar(255) NOT NULL,
  PRIMARY KEY  (`JP_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_jp
-- ----------------------------
INSERT INTO `personality_jp` VALUES ('', null, null, '', '');
INSERT INTO `personality_jp` VALUES ('1', '4', '你擅长', '在有需要时间时同时协调进行多项工作。', '专注在某一项工作上，直至把它完成为止。');
INSERT INTO `personality_jp` VALUES ('10', '40', '下列哪个说法最能贴切形容你对自己的看法？', '不断接受新意见。', '着眼达成目标。');
INSERT INTO `personality_jp` VALUES ('11', '44', '你会倾向', '暂时放下不愉快的事情，直至有心情时才处理。', '及时处理不愉快的事情，务求把它们抛诸脑后。');
INSERT INTO `personality_jp` VALUES ('12', '48', '哪一句较能表达你的看法？', '犹豫不决必失败。', '三思而后行。');
INSERT INTO `personality_jp` VALUES ('2', '8', '你较喜欢下列哪个工作？', '能让你迅速和即时做出反应。', '能让你定出目标，然后逐步达成目标的工作。');
INSERT INTO `personality_jp` VALUES ('3', '12', '下列哪一种说法较适合你？', '我会突然尝试做某些事，看看会有什么事情发生。', '我尝试做任何事前，都想事先知道可能有什么事情发生。');
INSERT INTO `personality_jp` VALUES ('4', '16', '下列哪一种说法较适合你？', '即使已出计划，我也喜欢探讨其他新的方案。', '一旦定出计划，我便希望能依计行事。');
INSERT INTO `personality_jp` VALUES ('5', '20', '下列哪一种说法较适合你？', '当我专注做某件事情时，需要不时停下来休息。', '当我专注做某件事情时，不希望受到任何干扰。');
INSERT INTO `personality_jp` VALUES ('6', '24', '当你放假时，你多数会', '随遇而安，做当时想做的事。', '为想做的事情订出时间表。');
INSERT INTO `personality_jp` VALUES ('7', '28', '当你放假时，你多数会', '忘记平时发生的事情，专心享乐。', '想着假期过后要准备的事情。');
INSERT INTO `personality_jp` VALUES ('8', '32', '下列哪个说法最能贴切形容你对自己的看法？', '随机应变。', '按照计划行事。');
INSERT INTO `personality_jp` VALUES ('9', '36', '下列哪个说法最能贴切形容你对自己的看法？', '容易适应转变。', '处事井井有条。');

-- ----------------------------
-- Table structure for personality_jp_ans
-- ----------------------------
DROP TABLE IF EXISTS `personality_jp_ans`;
CREATE TABLE `personality_jp_ans` (
  `JP_ans_id` varchar(50) NOT NULL,
  `JP_id` varchar(50) default NULL,
  `JP_num` varchar(50) default NULL,
  `JP_a_ans` varchar(50) NOT NULL,
  `JP_b_ans` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`JP_ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_jp_ans
-- ----------------------------

-- ----------------------------
-- Table structure for personality_result
-- ----------------------------
DROP TABLE IF EXISTS `personality_result`;
CREATE TABLE `personality_result` (
  `assessment_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `e_sum` int(11) NOT NULL,
  `i_sum` int(11) NOT NULL,
  `s_sum` int(11) NOT NULL,
  `n_sum` int(11) NOT NULL,
  `t_sum` int(11) NOT NULL,
  `f_sum` int(11) NOT NULL,
  `j_sum` int(11) NOT NULL,
  `p_sum` int(11) NOT NULL,
  PRIMARY KEY  (`assessment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_result
-- ----------------------------

-- ----------------------------
-- Table structure for personality_sn
-- ----------------------------
DROP TABLE IF EXISTS `personality_sn`;
CREATE TABLE `personality_sn` (
  `SN_id` varchar(50) NOT NULL,
  `SN_num` varchar(50) default NULL,
  `SN_name` varchar(255) default NULL,
  `SN_a` varchar(255) NOT NULL,
  `SN_b` varchar(255) NOT NULL,
  PRIMARY KEY  (`SN_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_sn
-- ----------------------------
INSERT INTO `personality_sn` VALUES ('1', '2', '下列哪一种是你的一般生活取向？', '只管做吧。', '找出多种不同选择。');
INSERT INTO `personality_sn` VALUES ('10', '38', '下列哪个说法最能贴切形容你对自己的看法？', '实事求是。', '富想象力。');
INSERT INTO `personality_sn` VALUES ('11', '42', '下列哪个说法最能贴切形容你对自己的看法？', '实事求是。', '具远大目光。');
INSERT INTO `personality_sn` VALUES ('12', '46', '你会倾向', '在自己有兴趣的范畴，积累丰富的经验。', '有各式各样不同的经验。');
INSERT INTO `personality_sn` VALUES ('2', '6', '当你尝试了解某些事情时，一般你会', '先要了解细节。', '先了解整体情况，细节容后再谈。');
INSERT INTO `personality_sn` VALUES ('3', '10', '下列哪一种说法较适合你？', '我较有兴趣知道别人的经历，例如他们做过什么？认识什么人？', '我较有兴趣知道别人的计划和梦想，例如他们会往哪里去？憧憬什么？');
INSERT INTO `personality_sn` VALUES ('4', '14', '下列哪一种说法较适合你？', '四周的实际环境对我很重要，而且会影响我的感受。', '如果我喜欢所做的事情，气氛对我而言并不是那么重要。');
INSERT INTO `personality_sn` VALUES ('5', '18', '下列哪一种说法较适合你？', '如果我喜欢某种活动，我会经常进行这种活动。', '我一旦熟悉某种活动后，便希望转而尝试其它新的活动。');
INSERT INTO `personality_sn` VALUES ('6', '22', '下列哪一种说法较适合你？', '我对一些没有实际用途的意念不感兴趣。', '我喜欢意念本身，并享受想象意念的过程。');
INSERT INTO `personality_sn` VALUES ('7', '26', '当你放假时，你多数会', '返回你喜欢的地方度假。', '选择前往一些你从未到达的地方。');
INSERT INTO `personality_sn` VALUES ('8', '30', '当你放假时，你多数会', '在喜欢的餐厅用膳。', '尝试新的菜式。');
INSERT INTO `personality_sn` VALUES ('9', '34', '下列哪个说法最能贴切形容你对自己的看法？', '留意事实。', '注重事实。');

-- ----------------------------
-- Table structure for personality_sn_ans
-- ----------------------------
DROP TABLE IF EXISTS `personality_sn_ans`;
CREATE TABLE `personality_sn_ans` (
  `SN_ans_id` varchar(50) NOT NULL,
  `SN_id` varchar(50) default NULL,
  `SN_num` varchar(50) default NULL,
  `SN_a_ans` varchar(50) NOT NULL,
  `SN_b_ans` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`SN_ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_sn_ans
-- ----------------------------

-- ----------------------------
-- Table structure for personality_tf
-- ----------------------------
DROP TABLE IF EXISTS `personality_tf`;
CREATE TABLE `personality_tf` (
  `TF_id` varchar(50) NOT NULL,
  `TF_num` varchar(50) default NULL,
  `TF_name` varchar(255) default NULL,
  `TF_a` varchar(255) NOT NULL,
  `TF_b` varchar(255) NOT NULL,
  PRIMARY KEY  (`TF_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_tf
-- ----------------------------
INSERT INTO `personality_tf` VALUES ('1', '3', '你喜欢自己的哪种性格？', '冷静而理性。', '热情而体谅。');
INSERT INTO `personality_tf` VALUES ('10', '39', '下列哪个说法最能贴切形容你对自己的看法？', '喜欢询问实情。', '喜欢探索感受。');
INSERT INTO `personality_tf` VALUES ('11', '43', '下列哪个说法最能贴切形容你对自己的看法？', '公正。', '宽容。');
INSERT INTO `personality_tf` VALUES ('12', '47', '哪一句较能表达你的看法？', '感情用事的人较容易犯错。', '逻辑思维会令人自以为是，因而容易犯错。');
INSERT INTO `personality_tf` VALUES ('2', '7', '你对下列哪方面较感兴趣？', '知道别人的想法。', '知道别人的感受。');
INSERT INTO `personality_tf` VALUES ('3', '11', '下列哪一种说法较适合你？', '我擅长订出一些可行的计划。', '我擅长促成别人同意一些计划，并衷力合作。');
INSERT INTO `personality_tf` VALUES ('4', '15', '下列哪一种说法较适合你？', '我喜欢分析，心思缜密。', '我对人感兴趣，关心他们所发生的事。');
INSERT INTO `personality_tf` VALUES ('5', '19', '下列哪一种说法较适合你？', '当我作决定的时候，我更多地考虑正反两面的观点，并且会推理与质证。', '当我作决定的时候，我会更多地了解其他人的想法，并希望能够达成共识。');
INSERT INTO `personality_tf` VALUES ('6', '23', '下列哪一种说法较适合你？', '当进行谈判时，我依靠自己的知识和技巧。', '当进行谈判时，我会拉拢其他人至同一阵线。');
INSERT INTO `personality_tf` VALUES ('7', '27', '当你放假时，你多数会', '带着一些与工作或学校有关的事情。', '处理一些对你重要的人际关系。');
INSERT INTO `personality_tf` VALUES ('8', '31', '下列哪个说法最能贴切形容你对自己的看法？', '别人认为我会公正处事，并且尊重他人。', '别人相信在他们有需要时，我会在他们身边。');
INSERT INTO `personality_tf` VALUES ('9', '35', '下列哪个说法最能贴切形容你对自己的看法？', '知识广博。', '善解人意。');

-- ----------------------------
-- Table structure for personality_tf_ans
-- ----------------------------
DROP TABLE IF EXISTS `personality_tf_ans`;
CREATE TABLE `personality_tf_ans` (
  `TF_ans_id` varchar(50) NOT NULL,
  `TF_id` varchar(50) default NULL,
  `TF_num` varchar(50) default NULL,
  `TF_a_ans` varchar(50) NOT NULL,
  `TF_b_ans` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`TF_ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personality_tf_ans
-- ----------------------------

-- ----------------------------
-- Table structure for recruit_base
-- ----------------------------
DROP TABLE IF EXISTS `recruit_base`;
CREATE TABLE `recruit_base` (
  `base_id` varchar(50) NOT NULL,
  `rale_name` varchar(10) default NULL,
  `sex` varchar(10) default NULL,
  `birthday` varchar(20) default NULL,
  `haw` varchar(20) default NULL,
  `nation` varchar(20) default NULL,
  `phone` varchar(20) default NULL,
  `email` varchar(50) default NULL,
  `language` varchar(20) default NULL,
  `job` varchar(10) default NULL,
  `idcard` varchar(20) default NULL,
  `certificate` varchar(50) default NULL,
  `address` varchar(100) default NULL,
  `friend` varchar(10) default NULL,
  `hobby` varchar(100) default NULL,
  `contact_name` varchar(10) default NULL,
  `contact_phone` varchar(20) default NULL,
  `user_id` varchar(50) default NULL,
  `dept_id` varchar(50) default NULL,
  PRIMARY KEY  (`base_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruit_base
-- ----------------------------
INSERT INTO `recruit_base` VALUES ('986b061e-f977-467e-8a49-7c6814e01e97', '廖秋露', '女性', '2000-12-31', '167cm & 56kg', '汉族&重庆', '15683689525', 'liaoqiulu0828@163.com', '四级', '在职', null, '无', '重庆', '王思聪', '睡觉', '王思聪', '1257878764661', '7f317809-c6fd-41da-be55-a59863553a65', '15');

-- ----------------------------
-- Table structure for recruit_dept
-- ----------------------------
DROP TABLE IF EXISTS `recruit_dept`;
CREATE TABLE `recruit_dept` (
  `dept_id` varchar(50) NOT NULL,
  `dept_name` varchar(50) NOT NULL,
  PRIMARY KEY  (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruit_dept
-- ----------------------------
INSERT INTO `recruit_dept` VALUES ('1', '人力资源部');
INSERT INTO `recruit_dept` VALUES ('2', '行政部');
INSERT INTO `recruit_dept` VALUES ('3', '财政部');
INSERT INTO `recruit_dept` VALUES ('4', 'IT信息部');
INSERT INTO `recruit_dept` VALUES ('5', '综合服务部');
INSERT INTO `recruit_dept` VALUES ('6', '集团服务部');
INSERT INTO `recruit_dept` VALUES ('7', '运营商事业部');
INSERT INTO `recruit_dept` VALUES ('8', '电力事业部');
INSERT INTO `recruit_dept` VALUES ('9', '交通事业部');
INSERT INTO `recruit_dept` VALUES ('10', '金融事业部');
INSERT INTO `recruit_dept` VALUES ('11', '医疗事业部');
INSERT INTO `recruit_dept` VALUES ('12', '市场部');
INSERT INTO `recruit_dept` VALUES ('13', '结构部');
INSERT INTO `recruit_dept` VALUES ('14', '硬件部');
INSERT INTO `recruit_dept` VALUES ('15', '应用软件开发部');
INSERT INTO `recruit_dept` VALUES ('16', '耗材研发部');

-- ----------------------------
-- Table structure for recruit_evaluate
-- ----------------------------
DROP TABLE IF EXISTS `recruit_evaluate`;
CREATE TABLE `recruit_evaluate` (
  `evaluate_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `rale_name` varchar(10) default NULL,
  `dept_id` varchar(50) default NULL,
  `post` varchar(10) default NULL,
  PRIMARY KEY  (`evaluate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruit_evaluate
-- ----------------------------
# INSERT INTO `recruit_evaluate` VALUES ('db24f4b0-175a-4800-9e57-bbe6c63800aa', '7f317809-c6fd-41da-be55-a59863553a65', null, '应用软件开发部', '软件开发工程师');

-- ----------------------------
-- Table structure for recruit_job
-- ----------------------------
DROP TABLE IF EXISTS `recruit_job`;
CREATE TABLE `recruit_job` (
  `job_id` varchar(50) NOT NULL,
  `job_user` varchar(10) NOT NULL,
  `job_password` varchar(20) NOT NULL,
  `job_descript` varchar(10) NOT NULL,
  `dept_id` varchar(50) default NULL,
  PRIMARY KEY  (`job_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruit_job
-- ----------------------------
INSERT INTO `recruit_job` VALUES ('1', 'RLZY', '123', '人力资源部', '1');
INSERT INTO `recruit_job` VALUES ('2', 'XZ', '123', '行政部', '2');
INSERT INTO `recruit_job` VALUES ('3', 'CW', '123', '财务部', '3');
INSERT INTO `recruit_job` VALUES ('4', 'ITXX', '123', 'IT信息部', '4');
INSERT INTO `recruit_job` VALUES ('5', 'ZHFW', '123', '综合服务部', '5');
INSERT INTO `recruit_job` VALUES ('6', 'JTFW', '123', '集团服务部', '6');
INSERT INTO `recruit_job` VALUES ('7', 'YYSSY', '123', '运营商事业部', '7');
INSERT INTO `recruit_job` VALUES ('8', 'DLSY', '123', '电力事业部', '8');
INSERT INTO `recruit_job` VALUES ('9', 'JTSY', '123', '交通事业部', '9');
INSERT INTO `recruit_job` VALUES ('10', 'JRSY', '123', '金融事业部', '10');
INSERT INTO `recruit_job` VALUES ('11', 'YLSY', '123', '医疗事业部', '11');
INSERT INTO `recruit_job` VALUES ('12', 'SC', '123', '市场部', '12');
INSERT INTO `recruit_job` VALUES ('13', 'JG', '123', '结构部', '13');
INSERT INTO `recruit_job` VALUES ('14', 'YJ', '123', '硬件部', '14');
INSERT INTO `recruit_job` VALUES ('15', 'YYRJKF', '123', '应用软件开发部', '15');
INSERT INTO `recruit_job` VALUES ('16', 'HCYF', '123', '耗材研发部', '16');

-- ----------------------------
-- Table structure for recruit_result
-- ----------------------------
DROP TABLE IF EXISTS `recruit_result`;
CREATE TABLE `recruit_result` (
  `result_id` varchar(50) NOT NULL,
  `e_sum` varchar(50) default NULL,
  `i_sum` varchar(50) default NULL,
  `s_sum` varchar(50) default NULL,
  `n_sum` varchar(50) default NULL,
  `j_sum` varchar(50) default NULL,
  `p_sum` varchar(50) default NULL,
  `t_sum` varchar(50) default NULL,
  `f_sum` varchar(50) default NULL,
  `result_type` varchar(50) default NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`result_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of recruit_result
-- ----------------------------
INSERT INTO `recruit_result` VALUES ('c00008a8-2067-4e2f-8ac1-94289ee315e0', '25', '35', '25', '35', '25', '35', '15', '45', 'INFP', '7f317809-c6fd-41da-be55-a59863553a65');

-- ----------------------------
-- Table structure for recruit_user
-- ----------------------------
DROP TABLE IF EXISTS `recruit_user`;
CREATE TABLE `recruit_user` (
  `user_id` varchar(50) NOT NULL,
  `user_name` varchar(10) NOT NULL,
  `user_card` varchar(30) NOT NULL,
  `user_status` varchar(10) default '0',
  `recruit_status` varchar(10) default '0',
  PRIMARY KEY  (`user_id`),
  UNIQUE KEY `card_key` USING HASH (`user_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruit_user
-- ----------------------------
# INSERT INTO `recruit_user` VALUES ('57bb2af9-72be-4dc2-89c4-ff2ab96f2576', '陈帅', 'L2323994483', '0');
INSERT INTO `recruit_user` VALUES ('7f317809-c6fd-41da-be55-a59863553a65', 'lql', '0', '0', '1');

-- ----------------------------
-- Table structure for sale_answer
-- ----------------------------
DROP TABLE IF EXISTS `sale_answer`;
CREATE TABLE `sale_answer` (
  `saleans_id` varchar(50) NOT NULL,
  `user_id` varchar(50) default NULL,
  `first_ans` text,
  `second_ans` text,
  `third_ans` text,
  `fourth_ans` text,
  PRIMARY KEY  (`saleans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale_answer
-- ----------------------------

-- ----------------------------
-- Table structure for sale_subject
-- ----------------------------
DROP TABLE IF EXISTS `sale_subject`;
CREATE TABLE `sale_subject` (
  `salesub_id` varchar(50) NOT NULL,
  `first` text NOT NULL,
  `second` text NOT NULL,
  `third` text NOT NULL,
  `fourth` text NOT NULL,
  PRIMARY KEY  (`salesub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale_subject
-- ----------------------------
INSERT INTO `sale_subject` VALUES ('1', '1、请写出你的三个优点及三个缺点。', '2、你认为一个好的销售人员应该具备哪四方面的素质？', '3、打电话和上门拜访前，应提前做好哪些准备工作？', '4、某单位某物资使用者为员工A，购买者为主管B，而决策者为经理C。采购流程为：主管B提供推荐 \r\n购买物品种类及品牌，由经理C签字决定。销售人员小李多次携带礼物拜访主管B，B礼物照收，饭局照赴，态度也好，交流顺畅，但就是不推荐使用。\r\n    请问，如果你是小李，遇到这种情况，你会怎么处理？你的想法是？\r\n');

-- ----------------------------
-- Table structure for second_try
-- ----------------------------
DROP TABLE IF EXISTS `second_try`;
CREATE TABLE `second_try` (
  `secondtry_id` varchar(50) NOT NULL,
  `evaluate_id` varchar(50) default NULL,
  `second_colligate_text` text,
  `second_colligate` varchar(10) default NULL,
  PRIMARY KEY  (`secondtry_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of second_try
-- ----------------------------
# INSERT INTO `second_try` VALUES ('1', '1', '1', '1');

-- ----------------------------
-- Table structure for teach
-- ----------------------------
DROP TABLE IF EXISTS `teach`;
CREATE TABLE `teach` (
  `teach_id` varchar(50) NOT NULL,
  `begandend` varchar(50) default NULL,
  `schoole` varchar(100) default NULL,
  `major` varchar(100) default NULL,
  `record` varchar(100) default NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`teach_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teach
-- ----------------------------
INSERT INTO `teach` VALUES ('885c92f2-45a6-4377-b3bc-514b9df36412', '2018-09-06 至 2018-09-06', 'dsada', 'dasdsa', 'fffwfw', '7f317809-c6fd-41da-be55-a59863553a65');

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `work_id` varchar(50) NOT NULL,
  `begandend` varchar(50) default NULL,
  `comname` varchar(100) default NULL,
  `peoplenum` varchar(10) default NULL,
  `w_post` varchar(50) default NULL,
  `w_money` varchar(10) default NULL,
  `why` varchar(100) default NULL,
  `witness` varchar(100) default NULL,
  `user_id` varchar(50) default NULL,
  PRIMARY KEY  (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------
INSERT INTO `work` VALUES ('11521a86-4bdd-41fe-a967-78a8df7754ee', '2018-09-06 至 2018-09-06', 'vgbfg', 'hgreg', 'dfger', 'rewr', 'fdfd', 'df & gdfdgdf', '7f317809-c6fd-41da-be55-a59863553a65');
