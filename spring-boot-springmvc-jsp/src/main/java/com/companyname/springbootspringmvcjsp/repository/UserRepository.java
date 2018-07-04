package com.companyname.springbootspringmvcjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyname.springbootspringmvcjsp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
