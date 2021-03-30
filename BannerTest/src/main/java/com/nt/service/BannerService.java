package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.Dao.EmployeDao;
import com.nt.entity.EmployeEntity;

@Service
public class BannerService {
	
	@Autowired
	private EmployeDao dao;
	
	public BannerService() {

	System.out.println("BannerService.BannerService()");
 dao.findAll();
	}

}
