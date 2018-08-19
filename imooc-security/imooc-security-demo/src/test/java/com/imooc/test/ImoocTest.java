package com.imooc.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImoocTest {
	
	//spring 容器
	@Autowired
	private WebApplicationContext wac;
	
	//伪造mvc;
	private MockMvc mockmvc;
	
	@Before
	public void setUp() {
		mockmvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testQureySuccess() throws Exception{
		mockmvc.perform(MockMvcRequestBuilders.get("/user").contentType(MediaType.APPLICATION_JSON_UTF8))
		.andExpect(MockMvcResultMatchers.status().isOk()) //response 状态码
		.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3)) //验证条件
		.andReturn().getResponse().getContentAsString(); //返回值
	}
	
	@Test
	public void testQureyParamSuccess() throws Exception{
		mockmvc.perform(MockMvcRequestBuilders.get("/user/param")
				.param("userName", "baby")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
	}
	
	@Test
	public void testCreateSuccess() throws Exception{
		
		String content = "";
		mockmvc.perform(MockMvcRequestBuilders.post("/user")
				.content(content) // 要插入的json数组
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1));
	}
	
	
	@Test
	public void testUpLoadSuccess() throws Exception{
		
		String result = mockmvc.perform(fileUpload("/file/upload")
				//1.参数名，文件名，表单格式，文件格式
				.file(new MockMultipartFile("file","test.txt","multipart/form-data","hello upload".getBytes("UTF-8"))))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		System.out.println("result: "+result);
	}
	
	
}
