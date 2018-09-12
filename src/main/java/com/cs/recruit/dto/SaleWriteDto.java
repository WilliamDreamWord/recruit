package com.cs.recruit.dto;

import com.cs.recruit.entity.Sale_answer;
import com.cs.recruit.entity.Sale_subject;

/**
 * Created by asus on 2018/8/10.
 */
public class SaleWriteDto {
    public Sale_answer getSale_answer() {
        return sale_answer;
    }

    public void setSale_answer(Sale_answer sale_answer) {
        this.sale_answer = sale_answer;
    }

    private Sale_answer sale_answer;

    public Sale_subject getSale_subject() {
        return sale_subject;
    }

    public void setSale_subject(Sale_subject sale_subject) {
        this.sale_subject = sale_subject;
    }

    private Sale_subject sale_subject;
}
