package com.project.permission.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.Result;
import com.project.core.utilities.results.SuccessDataResult;
import com.project.core.utilities.results.SuccessResult;
import com.project.permission.business.abstracts.PermissionFormService;
import com.project.permission.dataAccess.abstracts.PermissionFormDao;
import com.project.permission.entities.PermissionForm;

@Service
public class PermissionFormManager implements PermissionFormService {

	private PermissionFormDao permissionFormDao;
	@Autowired
	public PermissionFormManager(PermissionFormDao permissionFormDao) {
		super();
		this.permissionFormDao = permissionFormDao;
	}
	@Override
	public DataResult<List<PermissionForm>> getAll() {
		return new SuccessDataResult<List<PermissionForm>>(this.permissionFormDao.findAll()); 
	}
	@Override
	public Result add(@RequestBody PermissionForm permissionForm) {
		this.permissionFormDao.save(permissionForm);
		return new SuccessResult("izin talebi başarılı");
	}

}
