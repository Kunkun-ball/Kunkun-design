package com.hukun.graduation.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

public interface AdminLoginService {
	
	JSONObject login(JSONObject paramsObject);
}
