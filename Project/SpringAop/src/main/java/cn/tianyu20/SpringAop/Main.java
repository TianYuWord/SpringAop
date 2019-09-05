package cn.tianyu20.SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.tianyu20.Config.Config;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		IndexServiceImpl indexservice =  annotationConfigApplicationContext.getBean(IndexServiceImpl.class);
		System.out.println(indexservice instanceof IndexService);
		indexservice.select();
	}
}
