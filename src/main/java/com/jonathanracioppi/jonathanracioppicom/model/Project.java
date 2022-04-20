package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serial;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends ResumeSection {

    @Serial
    private static final long serialVersionUID = -7787184882427973961L;
    @Column
    private String takeAway;

}
