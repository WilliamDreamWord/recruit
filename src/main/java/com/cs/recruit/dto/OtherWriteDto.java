package com.cs.recruit.dto;

import com.cs.recruit.entity.Other_answer;
import com.cs.recruit.entity.Other_subject;
import com.cs.recruit.entity.Sale_answer;
import com.cs.recruit.entity.Sale_subject;

/**
 * Created by asus on 2018/8/10.
 */
public class OtherWriteDto {
    private Other_answer other_answer;

    public Other_answer getOther_answer() {
        return other_answer;
    }

    public void setOther_answer(Other_answer other_answer) {
        this.other_answer = other_answer;
    }

    public Other_subject getOther_subject() {
        return other_subject;
    }

    public void setOther_subject(Other_subject other_subject) {
        this.other_subject = other_subject;
    }

    private Other_subject other_subject;
}
