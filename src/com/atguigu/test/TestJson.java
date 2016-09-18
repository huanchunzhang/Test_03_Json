package com.atguigu.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.junit.Test;


public class TestJson {
	
	//将数组或list转换为json数据
	@Test
	public void test01() {
		
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
		
		String[] arr = new String[]{"aa","bb","cc"};
		JSONArray jsonArray2 = JSONArray.fromObject(arr);
		System.out.println(jsonArray2);
	}
	
	//将map或javaBean转为json数据
	@Test
	public void test02() {
		
		Map<String, String> map = new HashMap<>();
		map.put("001", "aa");
		map.put("002", "bb");
		map.put("003", "cc");
		
		//数据配置
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"userId"});
		
		JSONObject jsonMap = JSONObject.fromObject(map);
		System.out.println(jsonMap);
		
		List<User> list = new ArrayList<>();
		list.add(new User(1, "AA"));
		list.add(new User(2, "bb"));
		list.add(new User(3, "CC"));
		
		JSONArray jsonList = JSONArray.fromObject(list, jc);
		System.out.println(jsonList);
		
	}
	
	//测试
	public void test03() {
		
		System.out.println("测试提交git远程服务器");
		System.out.println("测试下载到本地");
		
	}
	
}
