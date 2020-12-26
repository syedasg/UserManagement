package com.api.usermanagement.usermanagement.entities;


import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Entity
@Table(name="GENDER_DETAILS")
public class GenderDetails {


    @Id
    @Column(name = "GENDER_ID")
    private Integer genderId;

    @Column(name = "GENDER_TXT")
    private String genderTxt;


    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGenderTxt() {
        return genderTxt;
    }

    public void setGenderTxt(String genderTxt) {
        this.genderTxt = genderTxt;
    }
}
