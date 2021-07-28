package com.userAPI.dao;

import org.springframework.data.repository.CrudRepository;

import com.userAPI.entites.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
