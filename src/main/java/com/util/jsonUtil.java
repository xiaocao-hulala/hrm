package com.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class jsonUtil {
	public static String ObjectToJson(Object obj) {
		// Gson是通过反射的方式获取类的属性
		// Gson不会序列化空值

	/*	Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd hh:mm:ss").create();
		String json = gson.toJson(obj);*/
		Gson gson = new GsonBuilder().setDateFormat("yyyy-mm-dd").create();
		String json = gson.toJson(obj);
		return json;
	}

	public static void responseWriteJson(HttpServletResponse resp, Object obj) throws IOException {
		resp.setContentType("application/json;charset=utf-8");
		resp.getWriter().print(ObjectToJson(obj));
	}


	//不用创建类，单独的一种方法把数据转化成对应格式
	public static void layuiJson(HttpServletResponse resp, List obj) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "查询成功");
		map.put("count", obj.size());
		map.put("data", obj);
		responseWriteJson(resp, map);
	}
}
