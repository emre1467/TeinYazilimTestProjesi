package com.project.permission.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.permission.entities.PermissionForm;

public interface PermissionFormDao extends JpaRepository<PermissionForm,Integer> {

}
