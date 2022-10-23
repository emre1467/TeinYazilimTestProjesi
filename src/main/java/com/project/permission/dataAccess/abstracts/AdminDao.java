package com.project.permission.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.permission.entities.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

	@Query("From Admin where adminId=:id")
	List<Admin> getByAdminId(int id);
	
	@Query("From Admin where nickName=:nickName and password=:password")
	List<Admin> getByNickNameandPassword(String nickName,String password);
}
