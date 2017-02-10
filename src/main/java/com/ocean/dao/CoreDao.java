package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Core;

@Repository
public interface CoreDao {
	
	/**
	 * add a core
	 * @param core
	 */
	void addCore(Core core);
	
	/**
	 * 查询某课程的全部学生的成绩
	 * @return
	 */
	List<Core> selectCore();
}
