package com.haomory.CumparEu.repository;

import com.haomory.CumparEu.entity.UserRole;
import com.haomory.CumparEu.id.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleUserRepository extends JpaRepository<UserRole, UserRoleId> {
}
