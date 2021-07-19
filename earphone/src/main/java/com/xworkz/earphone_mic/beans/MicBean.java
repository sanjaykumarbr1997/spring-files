package com.xworkz.earphone_mic.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@ToString
@NoArgsConstructor

public class MicBean implements Serializable {
	@Value(value = "3")
	private int id;
	@Value(value = "v4.0")
	private String version;
	

}
