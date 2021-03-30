package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "zensardata")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private int Id;
	@Column(name = "name",length = 9)
	private String emp_name;
	@Column(name = "adds",length = 20)
	private String emp_adds;
	@Column(name = "mob",length = 12)
	private long mob;
	@Column(name = "email",length = 30)
	private String email;
	@Column(name = "gen",length = 3)
	private char gender;

}
