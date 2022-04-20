package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "RESUMES")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long resumeId;

    @Column
    private String namePerson;

    @Column
    private String emailPerson;

    @Column
    private String phoneNumber;

    @Column
    private String aboutPerson;

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ResumeSection> resumeSection;

    @Column
    private boolean display = true;


}
