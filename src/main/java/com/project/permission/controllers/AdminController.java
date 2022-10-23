package com.project.permission.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.client.util.Data;
import com.project.core.utilities.results.DataResult;
import com.project.permission.business.abstracts.AdminService;
import com.project.permission.entities.Admin;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

	private AdminService adminService;
	@Autowired
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	};
	@GetMapping("/getall")
	public DataResult<List<Admin>> getAll(){
		return this.adminService.getAll();
	}
	@GetMapping("/getByNickNameandPaswword")
	public DataResult<List<Admin>> getByNickNameandPaswword(String nickName,String password){
		return this.adminService.getByNickNameandPassword(nickName, password);
	}
}
