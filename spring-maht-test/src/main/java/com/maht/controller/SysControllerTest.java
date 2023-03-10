package com.maht.controller;

import com.maht.config.Sysconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.LinkedHashMap;


public class SysControllerTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(Sysconfig.class);
		System.out.println(ac.getBean(Sysconfig.class));


	}


}
