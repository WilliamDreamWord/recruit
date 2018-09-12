package com.cs.recruit.dto;

import com.cs.recruit.entity.*;

import java.util.List;

/**
 * Created by asus on 2018/8/13.
 */
public class CharacterWriteDto {
    private String user_id;
    private List<Personality_EI_ans> personality_ei_ans;
    private List<Personality_JP_ans> personality_jp_ans;
    private List<Personality_SN_ans> personality_sn_ans;
    private List<Personality_TF_ans> personality_tf_ans;


    public List<Personality_EI_ans> getPersonality_ei_ans() {
        return personality_ei_ans;
    }

    public void setPersonality_ei_ans(List<Personality_EI_ans> personality_ei_ans) {
        this.personality_ei_ans = personality_ei_ans;
    }


    public List<Personality_JP_ans> getPersonality_jp_ans() {
        return personality_jp_ans;
    }

    public void setPersonality_jp_ans(List<Personality_JP_ans> personality_jp_ans) {
        this.personality_jp_ans = personality_jp_ans;
    }




    public List<Personality_SN_ans> getPersonality_sn_ans() {
        return personality_sn_ans;
    }

    public void setPersonality_sn_ans(List<Personality_SN_ans> personality_sn_ans) {
        this.personality_sn_ans = personality_sn_ans;
    }


    public List<Personality_TF_ans> getPersonality_tf_ans() {
        return personality_tf_ans;
    }

    public void setPersonality_tf_ans(List<Personality_TF_ans> personality_tf_ans) {
        this.personality_tf_ans = personality_tf_ans;
    }
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
