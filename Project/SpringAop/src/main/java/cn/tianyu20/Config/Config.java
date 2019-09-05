package cn.tianyu20.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.tianyu20.SpringAop")
@EnableAspectJAutoProxy(proxyTargetClass = true) //ʹ����Spring��Cjlable
public class Config {
	
}
