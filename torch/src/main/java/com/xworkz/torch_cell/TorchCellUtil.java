package com.xworkz.torch_cell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.torch_cell.beans.CellBean;
import com.xworkz.torch_cell.beans.TorchBean;

public class TorchCellUtil {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		TorchBean tBean = applicationContext.getBean(TorchBean.class);
		System.out.println(tBean);
		System.out.println(tBean.getCell().getCellId());
		System.out.println(tBean.getCell().getName());
		
		CellBean cBean = applicationContext.getBean(CellBean.class);
		System.out.println(cBean);
		
		

	}

}
