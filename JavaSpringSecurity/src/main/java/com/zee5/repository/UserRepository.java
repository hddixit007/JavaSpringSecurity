package com.zee5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zee5.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional
	
}
