package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
public class PersonJob extends ResumeSection{

    @Column
    private Date fromDate;
    @Column
    private Date toDate;

}
