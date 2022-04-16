package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Resume {

    @Id
    private long resumeId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String about;

    @OneToMany
    private List<ResumeSection> resumeSection;

    @Column
    private boolean display = true;


}
