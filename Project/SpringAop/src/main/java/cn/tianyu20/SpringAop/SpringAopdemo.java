package cn.tianyu20.SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;
//切片类
@Repository
@Aspect
public class SpringAopdemo {
	
	//切入点 是 连接点的集合
	@Pointcut("execution(* cn.tianyu20.SpringAop.*.*(..))")
	public void pointCut() {
		
	}
	
	//通知方法
	@Before("pointCut()")//给所有连接点
	public void before() {
		System.out.println("before");
	}
}
