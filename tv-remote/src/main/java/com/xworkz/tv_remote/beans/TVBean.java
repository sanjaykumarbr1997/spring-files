package com.xworkz.tv_remote.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TVBean implements Serializable {
	@Value(value = "4") 
	private int id;
	@Value(value = "LG") 
	private String name;
	@Value(value = "43") 
	private int size;
	@Autowired
	private RemoteBean remote;
	
	public TVBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public RemoteBean getRemote() {
		return remote;
	}

	public void setRemote(RemoteBean remote) {
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "TVBean [id=" + id + ", name=" + name + ", size=" + size + ", remote=" + remote + "]";
	}
	
	

}
