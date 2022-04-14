package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
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


}
