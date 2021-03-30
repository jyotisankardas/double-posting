package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmployeeDao;
import com.nt.domain.EmployeeDomain;
import com.nt.entity.EmployeeEntity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao edao;

	public boolean saveData(EmployeeDomain domain) throws Exception {
		EmployeeEntity entity = new EmployeeEntity();
		BeanUtils.copyProperties(domain, entity);
		EmployeeEntity save = edao.save(entity);
		if (save != null)
			return true;
		else
			return false;

	}

}
