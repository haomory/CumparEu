package com.haomory.CumparEu.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "user")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String last_name;


    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Date birth_date;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private Date last_login;

    @Column(nullable = false)
    private Boolean is_active;

    @Column(nullable = false, updatable = false)
    private Date created_at;

    @Column(nullable = false)
    private Date updated_at;


}
