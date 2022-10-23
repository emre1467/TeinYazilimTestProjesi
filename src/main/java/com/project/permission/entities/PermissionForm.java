package com.project.permission.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="permissionForm")
@AllArgsConstructor
@NoArgsConstructor
public class PermissionForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="permission_day")
	private int permissionDay;
	
	@Column(name="confirm")
	private String confirm;
	
	@ManyToOne
	@JoinColumn(name = "personel_id")
	private Personel personel;
}
