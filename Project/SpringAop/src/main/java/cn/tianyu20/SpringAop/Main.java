package cn.tianyu20.SpringAop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.tianyu20.Config.Config;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		IndexDao indexdao = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println(indexdao);
		indexdao.get();
	}
}
