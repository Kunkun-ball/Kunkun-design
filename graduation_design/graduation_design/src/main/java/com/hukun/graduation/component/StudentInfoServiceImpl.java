package com.hukun.graduation.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.mapper.StudentInfoMapper;
import com.hukun.graduation.model.StudentInfoModel;
import com.hukun.graduation.service.StudentInfoService;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	private StudentInfoMapper studentInfoMapper;
	
	@Override
	public JSONObject getList(JSONObject paramsObject) {
		List<StudentInfoModel> studentInfoArray = studentInfoMapper.getList(paramsObject);
		
		JSONObject result = new JSONObject();
		result.put("studentInfo", studentInfoArray);
		return result;
	}
	
	@Override
	public JSONObject getListByProfession(JSONObject paramsObject) {
		List<StudentInfoModel> studentInfoArray = studentInfoMapper.getListByProfession(paramsObject);
		
		JSONObject result = new JSONObject();
		result.put("studentInfo", studentInfoArray);
		return result;
	}
	
	@Override
	public JSONObject get(JSONObject paramsObject) {
		StudentInfoModel studentInfo = studentInfoMapper.getStudentInfo(paramsObject);
		
		JSONObject result = new JSONObject();
		result.put("studentInfo", studentInfo);
		return result;
	}

	@Override
	public JSONObject insert(JSONObject paramsObject) {
		JSONArray studentInfoArrya = paramsObject.getJSONArray("studentInfo");
		List<Long> siidArray= new ArrayList<Long>();
		for (int i = 0; i < studentInfoArrya.size(); i ++) {
			JSONObject studentInfo = studentInfoArrya.getJSONObject(i);
			studentInfoMapper.insertStudentInfo(studentInfo);
			Long siid = studentInfo.getLong("siid");
			siidArray.add(siid);
		}
		
		JSONObject result = new JSONObject();
		result.put("siidArray", siidArray);
		return result;
	}

	@Override
	public JSONObject delete(JSONObject paramsObject) {
		studentInfoMapper.deleteStudentInfo(paramsObject);
		
		return paramsObject;
	}

	@Override
	public JSONObject update(JSONObject paramsObject) {
		studentInfoMapper.updateStudentInfo(paramsObject);
		
		JSONObject result = new JSONObject();
		Long siid = paramsObject.getLong("siid");
		result.put("siid", siid);
		return result;
	}

	

	

	
}
