package com.xworkz.earphone_mic.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Component
@ToString
@NoArgsConstructor
public class EarphoneBean  implements Serializable{
	@Value(value = "1")
	private int id;
	@Value(value = "RelaMe")
	private String name;
	private MicBean mic;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MicBean getMic() {
		return mic;
	}
	
	@Autowired
	public void setMic(MicBean mic) {
		this.mic = mic;
	}
	
	
	
	
	
	
}
