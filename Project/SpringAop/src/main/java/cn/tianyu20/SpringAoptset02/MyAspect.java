package cn.tianyu20.SpringAoptset02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;

@Repository
@Aspect
public class MyAspect {
	
	
	
	@Pointcut("* execution(cn.tianyu20.SpringAoptset02.*.*(..))")
	public void around(ProceedingJoinPoint pjp) {
		System.out.println(pjp);
	}
	
}
