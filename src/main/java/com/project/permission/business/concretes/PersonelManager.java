package com.project.permission.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.SuccessDataResult;
import com.project.core.utilities.results.SuccessResult;
import com.project.permission.business.abstracts.PersonelService;
import com.project.permission.dataAccess.abstracts.PersonelDao;
import com.project.permission.entities.Personel;

@Service
public class PersonelManager implements PersonelService{

	private PersonelDao personelDao;
	@Autowired
	public PersonelManager(PersonelDao personelDao) {
		super();
		this.personelDao = personelDao;
	}
	@Override
	public DataResult<List<Personel>> getAll() {
		return new SuccessDataResult<List<Personel>>(this.personelDao.findAll());
	}
	@Override
	public com.project.core.utilities.results.Result add(Personel personel) {
		this.personelDao.save(personel);
		return new SuccessResult("Başarılı");
	}
	

}
