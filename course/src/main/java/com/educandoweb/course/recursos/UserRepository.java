package com.educandoweb.course.recursos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
