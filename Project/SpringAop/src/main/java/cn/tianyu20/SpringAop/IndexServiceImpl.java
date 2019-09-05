package cn.tianyu20.SpringAop;

import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

	@TianyuAnno
	public void select() {
		System.out.println("select");
	}

	public void get() {
		System.out.println("get");
	}

}
