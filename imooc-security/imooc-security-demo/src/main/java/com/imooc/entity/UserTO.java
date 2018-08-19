package com.imooc.entity;

import com.fasterxml.jackson.annotation.JsonView;

import io.swagger.annotations.ApiModelProperty;

public class UserTO {
	
	//use JsonView 根据不同视图显示不同内容 1.用接口显示不同视图
	//2.在get方法上指定视图
	public interface UserSimpleView{};
	public interface UserDetailView extends UserSimpleView{};
	
	@ApiModelProperty(value="用户名")
	private String userName;
	private String password;
	public UserTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@JsonView(UserSimpleView.class)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@JsonView(UserDetailView.class)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
