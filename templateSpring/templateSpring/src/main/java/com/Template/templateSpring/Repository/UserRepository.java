package com.Template.templateSpring.Repository;

import com.Template.templateSpring.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
