package com.project.permission.business.concretes;

import java.util.List;

import javax.transaction.Transactional;

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
	@Override
	public DataResult<List<PermissionForm>> getByPersonelId(int id) {
		
		return new SuccessDataResult<List<PermissionForm>>(this.permissionFormDao.getByPersonelId(id));
	}
	@Override
	public DataResult<List<PermissionForm>> getByPermissionId(int id) {
		return new SuccessDataResult<List<PermissionForm>>(this.permissionFormDao.getByPermissiionId(id));
	}
	@Override
	@Transactional
	public Result update(int id, String confirm) {
		List<PermissionForm> permission=this.permissionFormDao.getByPermissiionId(id);
		PermissionForm permsissionForm=new PermissionForm();
		for(PermissionForm p:permission) {
			permsissionForm=p;
		}
		permsissionForm.setConfirm(confirm);
		return new SuccessResult("Güncellendi");
	}

}
