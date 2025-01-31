package com.hukun.graduation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hukun.graduation.mapper.AdminLoginMapper;
import com.hukun.graduation.model.AdminLoginModel;
import com.hukun.graduation.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{

	@Autowired
	private AdminLoginMapper adminLoginMapper;
	
	@Override
	public JSONObject login(JSONObject paramsObject) {
		
		Long root = paramsObject.getLong("root");
		String psd= paramsObject.getString("password");
		JSONObject params = new JSONObject();
		params.put("alid",root);
		AdminLoginModel adminInfo = adminLoginMapper.getAdminInfo(params);
		
		if (adminInfo == null) {
			throw new RuntimeException("用户名不存在");
		}
		
		Long alid = adminInfo.getAlid();
		String password = adminInfo.getPassword();
		
		// 判断
		if (root.equals(alid) && psd.equals(password)) {
			return params;
		}else {
			throw new RuntimeException("用户名或密码错误");
		}
	}
	
	
}
