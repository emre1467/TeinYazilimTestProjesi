package com.project.permission.business.abstracts;

import java.util.List;

import com.project.core.utilities.results.DataResult;
import com.project.permission.entities.Admin;

public interface AdminService {

	DataResult<List<Admin>> getAll();
	DataResult<List<Admin>> getByNickNameandPassword(String nickName,String password);
}
