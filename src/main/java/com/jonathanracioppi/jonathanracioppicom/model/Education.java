package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serial;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Education extends ResumeSection {

    @Serial
    private static final long serialVersionUID = 5084714131728266452L;
    @Column
    private double gpa;
    @Column
    private String degree;

    @Column
    private Date degreeDate;

}
