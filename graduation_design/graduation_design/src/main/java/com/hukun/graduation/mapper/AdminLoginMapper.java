package com.hukun.graduation.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.model.AdminLoginModel;

@Mapper
public interface AdminLoginMapper {
	
	AdminLoginModel getAdminInfo(JSONObject paramsObject);
}
