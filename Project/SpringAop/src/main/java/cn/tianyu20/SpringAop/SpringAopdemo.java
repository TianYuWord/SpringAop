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
	
	//通过参数类型扫描连接点
	@Pointcut("args(java.lang.Integer,java.lang.String)")
	public void pointCut1() {
		
	}
	
	//通过方法的类型进行匹配
	@Pointcut("within(cn.tianyu20.SpringAop.*)")
	public void pointCut2() {
		
	}
	
	//通过自定义注解
	@Pointcut("@annotation(cn.tianyu20.SpringAop.TianyuAnno)")
	public void pointCut3() {
		
	}
	
	//使用this和getBean类型对比是否继承，当然要开启继承模式的@EnableAspectJAutoProxy true
	@Pointcut("this(cn.tianyu20.SpringAop.IndexService)")
	public void pointCut4() {
		
	}
	
	//Target
	
	//通过注解的方式加载
	@Before("pointCut4()")//给所有连接点
	public void before() {
		System.out.println("before");
	}
	
	
}
