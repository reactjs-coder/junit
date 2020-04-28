package com.sarvesh.junit1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sarvesh.junit1.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "select * from users_table where id = :userId", nativeQuery = true)
	User findByUserId(@Param("userId") long id);

}

