package com.jonathanracioppi.jonathanracioppicom.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity(name = "RESUME_SECTIONS")
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "className")
public abstract class ResumeSection implements Serializable {

    @Serial
    private static final long serialVersionUID = 8325855695342527244L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rsId;

    @Column
    private String nameSection;

    @Column(length = 10000)
    private String descriptionSection;

    @ManyToOne
    @JsonIgnore
    private Resume resume;

    @Column
    private boolean display;

}
