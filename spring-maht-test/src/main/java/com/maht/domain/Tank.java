package com.maht.domain;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.Method;

@ComponentScan
public class Tank {
	private String name;
	private String size;

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Tank(){
		System.out.println("创建tank对象");
	}


}
