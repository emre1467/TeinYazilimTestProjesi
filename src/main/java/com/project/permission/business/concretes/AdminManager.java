package com.project.permission.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.SuccessDataResult;
import com.project.permission.business.abstracts.AdminService;
import com.project.permission.dataAccess.abstracts.AdminDao;
import com.project.permission.entities.Admin;

@Service
public class AdminManager implements AdminService {

	private AdminDao adminDao;
	@Autowired
	public AdminManager(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}

	@Override
	public DataResult<List<Admin>> getAll() {
		return new SuccessDataResult<List<Admin>>(this.adminDao.findAll());
	}

	@Override
	public DataResult<List<Admin>> getByNickNameandPassword(String nickName, String password) {
		return new SuccessDataResult<List<Admin>>(this.adminDao.getByNickNameandPassword(nickName, password));
	}

}
