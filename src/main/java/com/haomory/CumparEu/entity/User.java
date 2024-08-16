package com.haomory.CumparEu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("first_name")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @JsonProperty("last_name")
    @Column(name = "last_name", nullable = false)
    private String lastName;


    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @JsonProperty("phone_number")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @Column(name = "last_login", nullable = false)
    private LocalDate lastLogin;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdAt;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedAt;


}
