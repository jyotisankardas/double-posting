package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.EmployeeEntity;

public interface EmployeeDao extends CrudRepository<EmployeeEntity, Integer>{

}
