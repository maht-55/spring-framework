package com.maht.controller;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

public class Cglib implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("方法执行前代理对象增强行为");
		Object obj= methodProxy.invokeSuper(o, objects);
		System.out.println("方法执行后代理对象增强行为");
		return obj;
	}

}
