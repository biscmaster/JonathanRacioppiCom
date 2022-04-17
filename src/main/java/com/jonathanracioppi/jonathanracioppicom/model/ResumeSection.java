package com.jonathanracioppi.jonathanracioppicom.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "RESUME_SECTIONS")
@Getter
@Setter
public abstract class ResumeSection {

    @Id
    private Long rsId;

    @Column
    private String nameSection;

    @Column
    private String descriptionSection;

    @ManyToOne
    private Resume resume;

}
