package com.nt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.EmployeEntity;

@Repository
public interface EmployeDao extends JpaRepository<EmployeEntity, Integer>{

}
