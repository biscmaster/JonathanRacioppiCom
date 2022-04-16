package com.jonathanracioppi.jonathanracioppicom.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public abstract class ResumeSection {

    @Id
    private Long rsId;

    @Column
    private String name;

    @Column
    private String description;

    @ManyToOne
    private Resume resume;

}
