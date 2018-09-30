package com.cs.recruit.dto;

import com.cs.recruit.entity.Assistent_answer;
import com.cs.recruit.entity.Assistent_subject;

/**
 * Created by asus on 2018/8/10.
 */
public class AssistentWriteDto {

    private Assistent_subject assistent_subject;
    private Assistent_answer assistent_answer;

    public Assistent_subject getAssistent_subject() {
        return assistent_subject;
    }

    public void setAssistent_subject(Assistent_subject assistent_subject) {
        this.assistent_subject = assistent_subject;
    }

    public Assistent_answer getAssistent_answer() {
        return assistent_answer;
    }

    public void setAssistent_answer(Assistent_answer assistent_answer) {
        this.assistent_answer = assistent_answer;
    }


}
