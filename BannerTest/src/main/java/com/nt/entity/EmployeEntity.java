package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp")
public class EmployeEntity {
	
	@Id
	@Column(name = "sl_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int slno;
	@Column(name = "name")
	private String name;
	@Column(name = "Loc")
	private String loc;
	

}
