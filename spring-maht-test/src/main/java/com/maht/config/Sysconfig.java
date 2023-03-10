package com.maht.config;

import com.maht.domain.Car;
import com.maht.domain.Tank;
import net.sf.cglib.proxy.Enhancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class Sysconfig {

	@Bean
	public void getA(){
		Car car = new Car();
	}

	@Bean
	public void getB(){
		getA();
	}
}
