package com.xworkz.cake_app.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor

public class CreamBean implements Serializable{
	@Value(value = "4")
	private int id;
	@Value(value = "vanilla")
	private String flavour;

}
