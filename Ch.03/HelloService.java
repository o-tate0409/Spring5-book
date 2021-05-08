package com.example.hello;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	private HelloRepository repository;
	
	/** 従業員 を 1 人 取得 する */
	public Employee getEmployee(String id) {
		// 検索
		Map <String, Object> map = repository.findById(id);

		// Map から 値 を 取得
		String employeeId = (String)map.get("id");
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		
		// Employee クラス に 値 を セット
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(name);
		employee.setEmployeeAge(age);
		
		return employee;
	}
}

