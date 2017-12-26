package com.jinglin.zy.ztree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinglin.zy.ztree.dao.imp.UserInfoImp;
import com.jinglin.zy.ztree.model.UserInfo;

@Service
public class UserInfoService {

	@Autowired
	private UserInfoImp userInfoImp;
	public List<UserInfo> getallusers(){
		return userInfoImp.getlist();
	}
}
