package com.smoothstack.lms.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.lms.auth.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findOneByUsername(String username);

}
