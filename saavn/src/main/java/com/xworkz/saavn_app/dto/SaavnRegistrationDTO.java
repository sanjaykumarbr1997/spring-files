package com.xworkz.saavn_app.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NamedQueries(value = {
		@NamedQuery(name = "fetchDetails", query = "select dto from SaavnRegistrationDTO dto where dto.loginId=:lid and dto.confirmPassword=:pass") })
@Table(name="saavn_app_user_details")
@Getter
@Setter
@NoArgsConstructor

public class SaavnRegistrationDTO implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="sur_name")
	private String surName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="email_id")
	private String emailId;
	@Column(name="login_id")
	private String loginId;
	@Column(name="password")
	private String password;
	@Column(name="confirm_password")
	private String confirmPassword;
	 
	

}
