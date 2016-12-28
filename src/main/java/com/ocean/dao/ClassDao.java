package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Clazz;

@Repository 
/**
 * 班级
 * @author Ocean
 *
 */
public interface ClassDao {
	
	/**
	 * add a new class
	 * @param clazz
	 */
	void addClass(Clazz clazz);
	
	/**
	 * update the class
	 * @param clazz
	 */
	void updateClass(Clazz clazz);
	
	/**
	 * delete the class
	 * @param classNo
	 */
	void deleteClass(String classNo);

	/**
	 * select the class you want
	 * @param key
	 * @return
	 */
	List<Clazz> selectClass(String key);
}
