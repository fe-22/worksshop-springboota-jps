package com.fernandoalexthec.spfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandoalexthec.spfirst.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
