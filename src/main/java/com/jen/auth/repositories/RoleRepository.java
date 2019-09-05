package com.jen.auth.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jen.auth.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	@Override
	List<Role> findAll();

	List<Role> findByName(String name);
}
