package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@Entity
public class Education extends ResumeSection{

    @Column
    private double gpa;
    @Column
    private String degree;

    @Column
    private Date degreeDate;

}
