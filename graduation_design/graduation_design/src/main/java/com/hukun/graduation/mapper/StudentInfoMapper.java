package com.hukun.graduation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.model.StudentInfoModel;

@Mapper
public interface StudentInfoMapper {
	
	// 批量查询
	List<StudentInfoModel> getList(JSONObject paramsObject);
	
	// 根据专业查询
	List<StudentInfoModel> getListByProfession(JSONObject paramsObject);
	
	// 查询单条记录
	StudentInfoModel getStudentInfo(JSONObject paramsObject);
	
	// 新增
	Long insertStudentInfo(JSONObject paramsObject);
	
	// 删除
	Long deleteStudentInfo(JSONObject paramsObject);
	
	// 修改
	Long updateStudentInfo(JSONObject paramsObject);
}
