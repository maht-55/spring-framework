package com.maht.controller;

import com.maht.domain.Cat;
import net.sf.cglib.proxy.Enhancer;

public class ProxyTest {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Cat.class);
		enhancer.setCallback(new Cglib());
		Object o = enhancer.create();
		Cat o1 = (Cat) o;
		o1.sayHello("ok");

	}


}
