package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serial;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonJob extends ResumeSection{

    @Serial
    private static final long serialVersionUID = -2609159113671893514L;
    @Column
    private String company;

    @Column
    private Date fromDate;
    @Column
    private Date toDate;

}
