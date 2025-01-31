package com.hukun.graduation.service;

import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.model.StudentInfoModel;

public interface StudentInfoService {
	/**
	 * 查询多条记录
	 */
	JSONObject getList(JSONObject paramsObject);
	
	/**
	 * 根据专业查询多条记录
	 * @param paramsObject
	 * @return
	 */
	JSONObject getListByProfession(JSONObject paramsObject);
	
	/**
	  * 查询单条记录
	 */
	JSONObject get(JSONObject paramsObject);
	
	/**
	 * 新增
	 */
	
	JSONObject insert(JSONObject paramsObject);
	
	/*
	 * 删除
	 */
	JSONObject delete(JSONObject paramsObject);
	
	/**
	 * 修改
	 */
	JSONObject update(JSONObject paramsObject);
}
