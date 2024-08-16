package com.haomory.CumparEu.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 32, insertable = false, updatable = false, nullable = false)
    String role_name;
}
