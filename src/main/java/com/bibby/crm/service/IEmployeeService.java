package com.bibby.crm.service;

import java.util.List;

import com.bibby.crm.domain.Employee;
import com.bibby.crm.page.PageResult;
import com.bibby.crm.query.QueryObject;

public interface IEmployeeService {
	int save(Employee emp);

	int update(Employee emp);

	int delete(Long id);

	Employee get(long id);

	List<Employee> selectAll();

	PageResult selectByCondition(QueryObject go);
}
