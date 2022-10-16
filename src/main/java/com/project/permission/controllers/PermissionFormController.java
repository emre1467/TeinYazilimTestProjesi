package com.project.permission.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.Result;
import com.project.core.utilities.results.SuccessResult;
import com.project.permission.business.abstracts.PermissionFormService;
import com.project.permission.entities.PermissionForm;



@RestController
@RequestMapping("/api/permissionForm")
@CrossOrigin
public class PermissionFormController {
private PermissionFormService permissionFormService;
@Autowired
public PermissionFormController(PermissionFormService permissionFormService) {
	super();
	this.permissionFormService = permissionFormService;
}
	@GetMapping("getall")
	public DataResult<List<PermissionForm>> getAll(){
		return this.permissionFormService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody PermissionForm permissionForm) {
		return this.permissionFormService.add(permissionForm);
	}

}
