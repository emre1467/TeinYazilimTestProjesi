package com.project.permission.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.permission.entities.PermissionForm;

public interface PermissionFormDao extends JpaRepository<PermissionForm,Integer> {

	@Query("From PermissionForm where personel.personelId=:id")
	List<PermissionForm> getByPersonelId(int id);
	
	@Query("From PermissionForm where id=:id")
	List<PermissionForm> getByPermissiionId(int id);
	
}
