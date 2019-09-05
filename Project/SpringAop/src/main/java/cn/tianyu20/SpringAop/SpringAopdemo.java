package cn.tianyu20.SpringAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;
//��Ƭ��
@Repository
@Aspect
public class SpringAopdemo {
	
	//����� �� ���ӵ�ļ���
	@Pointcut("execution(* cn.tianyu20.SpringAop.*.*(..))")
	public void pointCut() {
		
	}
	
	//֪ͨ����
	@Before("pointCut()")//���������ӵ�
	public void before() {
		System.out.println("before");
	}
}
