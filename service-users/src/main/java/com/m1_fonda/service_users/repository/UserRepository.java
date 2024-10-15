package com.m1_fonda.service_users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.m1_fonda.service_users.model.UserBank;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<UserBank, Integer>{

}
