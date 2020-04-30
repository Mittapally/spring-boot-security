package com.akhil.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.security.model.User;

@Repository
public interface MySqlRepository extends JpaRepository<User, Integer> {
	
	User findByName(String name);

}
