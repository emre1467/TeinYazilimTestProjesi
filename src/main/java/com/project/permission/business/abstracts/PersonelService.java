package com.project.permission.business.abstracts;

import java.util.List;


import com.project.core.utilities.results.DataResult;
import com.project.core.utilities.results.Result;
import com.project.permission.entities.Personel;

public interface PersonelService {

	DataResult<List<Personel>> getAll();
	Result add(Personel personel);
}
