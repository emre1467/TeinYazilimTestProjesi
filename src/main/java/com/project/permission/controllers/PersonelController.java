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
import com.project.permission.business.abstracts.PersonelService;
import com.project.permission.entities.Personel;

@RestController
@RequestMapping("/api/personel")
@CrossOrigin
public class PersonelController {

	private PersonelService personelService;
	@Autowired
	public PersonelController(PersonelService personelService) {
		super();
		this.personelService = personelService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Personel>> getAll(){
		return this.personelService.getAll();
	}
	@PostMapping("/add")
	public Result add( @RequestBody Personel personel) {
		return this.personelService.add(personel);
	}
	@GetMapping("/getByNickNameandPaswword")
	public DataResult<List<Personel>> getByNickNameandPaswword(String nickName,String password){
		return this.personelService.getByNickNameandPassword(nickName,password);
	}
}
