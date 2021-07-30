package com.xworkz.passport_app.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class PassportLoginDTO implements Serializable{
	
	private String loginId;
	private String password;

}
