package com.xworkz.tv_remote.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class RemoteBean implements Serializable {
	@Value(value = "2")
	private int id;
	@Value(value = "2")
	private int range;
	
	public RemoteBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "RemoteBean [id=" + id + ", range (in m)=" + range + "]";
	}
	
	
	

}
