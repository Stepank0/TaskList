package com.example.tasklist.domain.user;


import com.example.tasklist.domain.tack.Tack;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConformation;
    private Set<Role> roles;
    private List<Tack> tacks;

}
