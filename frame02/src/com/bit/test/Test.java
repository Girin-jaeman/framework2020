/*package com.bit.test;  되는지 확인용 파일!

import java.sql.SQLException;
import java.util.ArrayList;

import com.bit.model.EmpDao;
import com.bit.model.entity.EmpVo;

public class Test {
	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		try {
			ArrayList<EmpVo> list=dao.selectAll();
			System.out.println(list!=null);
			for(EmpVo bean:list) {
				System.out.println(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
*/