package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Institute;

@Repository
/**
 * 学院专业接口
 * @author Administrator
 *
 */
public interface ProfessionDao {
	
	/**
	 * 添加学院专业
	 * 
	 * @param institute
	 */
	void addProfession(Institute institute);
	
	/**
	 * 修改学院专业
	 * @param institute
	 */
	void updateProfession(Institute institute);
	
	/**
	 * 删除学院专业
	 * @param instituteNo
	 */
	void deleteProfession(String instituteNo);
	
	/**
	 * 模糊查询专业
	 * @param key
	 * @return
	 */
	List<Institute> selectProfession(String key);

}