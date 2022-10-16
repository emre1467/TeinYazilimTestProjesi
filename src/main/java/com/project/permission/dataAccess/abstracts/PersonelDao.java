package com.project.permission.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.permission.entities.Personel;

public interface PersonelDao extends JpaRepository<Personel,Integer> {

}
