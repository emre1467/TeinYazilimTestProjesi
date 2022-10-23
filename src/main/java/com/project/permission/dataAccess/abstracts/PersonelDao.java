package com.project.permission.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.permission.entities.Personel;

public interface PersonelDao extends JpaRepository<Personel,Integer> {

	@Query("From Personel where nickName=:nickName and password=:password")
	List<Personel> getByNickNameandPassword(String nickName,String password);
}
