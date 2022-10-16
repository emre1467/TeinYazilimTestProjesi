package com.project.permission.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="personel")
@AllArgsConstructor
@NoArgsConstructor
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="personel_id")
	private int personelId;
	@Column(name="nick_name")
	private String nickName;
	@Column(name="password")
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "personel")
	private List<PermissionForm> permissionForms;
}
