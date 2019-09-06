package cn.tianyu20.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.tianyu20.SpringAoptset02")
@EnableAspectJAutoProxy(proxyTargetClass = false) //ʹ����Spring��Cjlable  ���ؼ̳е������
public class Config {
	
}
