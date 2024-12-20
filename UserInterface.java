package com.klu.promotehandlooms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.promotehandlooms.model.User;

@Repository
public interface UserInterface extends JpaRepository<User,Long>{
	 User findByEmail(String email);
}
