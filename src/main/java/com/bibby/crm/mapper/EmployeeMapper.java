package com.bibby.crm.mapper;

import java.util.List;

import com.bibby.crm.domain.Employee;
import com.bibby.crm.query.QueryObject;

public interface EmployeeMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Employee record);

	Employee selectByPrimaryKey(Long id);

	List<Employee> selectAll();

	int updateByPrimaryKey(Employee record);

	Long queryByConditionCount(QueryObject go);

	List<Employee> queryByCondition(QueryObject go);

}