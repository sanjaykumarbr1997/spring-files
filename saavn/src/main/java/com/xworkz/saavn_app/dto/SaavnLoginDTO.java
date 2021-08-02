package com.xworkz.saavn_app.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SaavnLoginDTO {
	
	private String loginId;
	private String password;

}
