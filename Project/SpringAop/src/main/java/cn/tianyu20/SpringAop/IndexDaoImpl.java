package cn.tianyu20.SpringAop;

import org.springframework.stereotype.Repository;

@Repository
public class IndexDaoImpl implements IndexDao{

	public void get() {
		System.out.println("get");
	}

	public void insert() {
		System.out.println("insert");
	}
	
}
