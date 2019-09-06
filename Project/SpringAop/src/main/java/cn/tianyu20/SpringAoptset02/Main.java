package cn.tianyu20.SpringAoptset02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.tianyu20.Config.Config;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		IndexService indexService = annotationConfigApplicationContext.getBean(IndexService.class);
		indexService.select();
	}
}
