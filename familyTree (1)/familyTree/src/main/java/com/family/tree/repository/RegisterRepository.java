package com.family.tree.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.family.tree.model.Register;

public interface RegisterRepository extends JpaRepository<Register, String> {

	@Query("select r from Register r where r.emailId=:emailId")
	Optional<Register> findByEmailId(@Param("emailId") String emailId);

	@Query("select r from Register r where r.emailId=:emailId and r.password=:password")
	Optional<Register> findByUserNameAndPassword(@Param("emailId") String emailId, @Param("password") String password);
}
