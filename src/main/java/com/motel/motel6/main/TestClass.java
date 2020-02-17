package com.motel.motel6.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.motel.motel6.pojos.MotelRockyMt;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-detail.xml");
		MotelRockyMt mr = (MotelRockyMt) ctx.getBean("motel61");
		System.out.println(mr.toString());

	}

}
