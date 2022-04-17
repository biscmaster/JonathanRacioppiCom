package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Auth implements GrantedAuthority, Serializable {

    @Serial
    private static final long serialVersionUID = -2679216509129196640L;

    @Id
    private Long authId;

    @Column
    private String authority;


}
