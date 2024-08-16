package com.haomory.CumparEu.entity;

import com.haomory.CumparEu.id.UserRoleId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@IdClass(UserRoleId.class)
@Table(name = "user_role")
@Getter @Setter
public class UserRole {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "role_id")
    private Long roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", insertable = false, updatable = false)
    private Role role;
}
