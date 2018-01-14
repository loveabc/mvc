package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.web.servlet.ModelAndView;

public class MyAspect {

	public void testBefore(){
		System.out.println("befroe");
	}
	public void testAfter(){
		System.out.println("after");
	}
	public void testReturn(){
		System.out.println("return");
	}
	public void testThroweException(){
		System.out.println("Throwe2Ex1ception");
	}
	public ModelAndView testAround(ProceedingJoinPoint pjp){
		ModelAndView mad=null;
		System.out.println("testAround start..");
		try {
			mad=(ModelAndView) pjp.proceed();
			System.out.println("testAround end..");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mad;
	}
	public String testAroundWithArgs(ProceedingJoinPoint pjp,String name,int age){
		System.out.println(name+"  1 "+age);
		String mad=null;
		System.out.println("testAround start..");
		try {
			mad=(String) pjp.proceed();
			System.out.println("testAround end..");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mad;
	}
}
