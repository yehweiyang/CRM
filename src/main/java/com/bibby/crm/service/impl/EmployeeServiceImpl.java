package com.bibby.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibby.crm.domain.Employee;
import com.bibby.crm.mapper.EmployeeMapper;
import com.bibby.crm.page.PageResult;
import com.bibby.crm.query.QueryObject;
import com.bibby.crm.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeMapper dao;
	
	@Override
	public int save(Employee emp) {
		return dao.insert(emp);
	}

	@Override
	public int update(Employee emp) {
		return dao.updateByPrimaryKey(emp);
	}

	@Override
	public int delete(Long id) {
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public Employee get(long id) {
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public List<Employee> selectAll() {
		return dao.selectAll();
	}

	@Override
	public PageResult selectByCondition(QueryObject go) {
		Long count = dao.queryByConditionCount(go);
		if(count>0) {
			List<Employee> result =  dao.queryByCondition(go);
			return new PageResult(count, result);
		}else {
			return PageResult.EMPTY;
		}
	}


}
