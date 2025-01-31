package com.hukun.graduation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.component.AdminLoginServiceImpl;
import com.hukun.graduation.component.StudentInfoServiceImpl;
import com.hukun.graduation.mapper.StudentInfoMapper;
import com.hukun.graduation.model.StudentInfoModel;

@RestController
public class DataController {
	
	@Autowired
	private StudentInfoServiceImpl studentInfoServiceImpl;
	
	@Autowired
	private AdminLoginServiceImpl adminLoginServiceImpl;
	
	@RequestMapping("/getList")
	public JSONObject getList(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.getList(paramsObject);
	}
	
	@RequestMapping("/getListByProfession")
	public JSONObject getListByProfession(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.getListByProfession(paramsObject);
	}
	
	@RequestMapping("/get")
	public JSONObject get(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.get(paramsObject);
		
	}
	
	@RequestMapping("/insert")
	public JSONObject insert(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.insert(paramsObject);
	}
	
	@RequestMapping("/delete")
	public JSONObject delete(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.delete(paramsObject);
	}
	
	@RequestMapping("/update")
	public JSONObject update(@RequestBody JSONObject paramsObject) {
		return studentInfoServiceImpl.update(paramsObject);
	}
	
	@RequestMapping("/adminLogin")
	public JSONObject adminLogin(@RequestBody JSONObject paramsObject) {
		return adminLoginServiceImpl.login(paramsObject);
	}
}
