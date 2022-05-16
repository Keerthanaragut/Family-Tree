package com.SpringClasses.FTM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringClasses.FTM.Model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
