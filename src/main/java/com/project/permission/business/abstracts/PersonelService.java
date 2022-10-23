package com.project.permission.business.abstracts;

import java.util.List;


import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.Result;
import com.project.permission.entities.Personel;

import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public interface PersonelService {

	DataResult<List<Personel>> getAll();
	Result add(Personel personel);
	DataResult<List<Personel>> getByNickNameandPassword(String nickName,String password);
}
