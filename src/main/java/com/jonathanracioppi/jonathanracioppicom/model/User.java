package com.jonathanracioppi.jonathanracioppicom.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serial;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements UserDetails {


    @Serial
    private static final long serialVersionUID = 7012922464686583610L;

    @Id
    private Long userId;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private boolean accountNonExpired;

    @Column
    private boolean accountNonLocked;

    @Column
    private boolean credentialsNonExpired;

    @Column
    private boolean enabled;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Auth> authorities;




}
