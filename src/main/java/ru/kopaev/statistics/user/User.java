package ru.kopaev.statistics.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    @Enumerated(EnumType.STRING)
    private Role role;
}
