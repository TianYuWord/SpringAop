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
	
	//ͨ����������ɨ�����ӵ�
	@Pointcut("args(java.lang.Integer,java.lang.String)")
	public void pointCut1() {
		
	}
	
	//ͨ�����������ͽ���ƥ��
	@Pointcut("within(cn.tianyu20.SpringAop.*)")
	public void pointCut2() {
		
	}
	
	//ͨ���Զ���ע��
	@Pointcut("@annotation(cn.tianyu20.SpringAop.TianyuAnno)")
	public void pointCut3() {
		
	}
	
	//ʹ��this��getBean���ͶԱ��Ƿ�̳У���ȻҪ�����̳�ģʽ��@EnableAspectJAutoProxy true
	@Pointcut("this(cn.tianyu20.SpringAop.IndexService)")
	public void pointCut4() {
		
	}
	
	//Target
	
	//ͨ��ע��ķ�ʽ����
	@Before("pointCut4()")//���������ӵ�
	public void before() {
		System.out.println("before");
	}
	
	
}
