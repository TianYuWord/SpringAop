package cn.tianyu20.SpringAoptset02;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
	
	
	public void get() {
		System.out.println("get");
	}
	
	
	public void select() {
		System.out.println("select");
	}

}
