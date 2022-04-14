package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public abstract class ResumeSection {

    @Id
    private long sectionId;

    @Column
    private String title;

    @Column
    private String body;

    @OneToMany
    List<ResumeSection> subSection;


}
