package com.project.permission.business.abstracts;

import java.util.List;

import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.Result;
import com.project.permission.entities.PermissionForm;



public interface PermissionFormService {

	DataResult<List<PermissionForm>> getAll();
	Result add(PermissionForm permissionForm);
	DataResult<List<PermissionForm>> getByPersonelId(int id);
	DataResult<List<PermissionForm>> getByPermissionId(int id);
	Result update(int id,String confirm);
}
