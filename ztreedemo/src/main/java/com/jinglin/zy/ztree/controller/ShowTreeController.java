package com.jinglin.zy.ztree.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinglin.zy.ztree.model.DepartInfo;
import com.jinglin.zy.ztree.model.UserInfo;
import com.jinglin.zy.ztree.model.vo.TreeNodeModel;
import com.jinglin.zy.ztree.service.DepartInfoService;
import com.jinglin.zy.ztree.service.UserInfoService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class ShowTreeController {

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private DepartInfoService departInfoService;
	@RequestMapping(value="/showtreedata.action")
	public void showtreedata(HttpServletResponse resp) {
		List<UserInfo> listusers = userInfoService.getallusers();
		List<DepartInfo> listdeparts = departInfoService.getalldeparts();
		//转换成界面中所需的实体对象数据
		List<TreeNodeModel> listnodes = new ArrayList<TreeNodeModel>();
		TreeNodeModel treeNodeModel=null;
		for(UserInfo u:listusers) {
			treeNodeModel=new TreeNodeModel();
			treeNodeModel.setId(u.getUserid());
			treeNodeModel.setName(u.getUsername());
			treeNodeModel.setpId(u.getDepartid());
			listnodes.add(treeNodeModel);
		}
		for(DepartInfo d:listdeparts) {
			treeNodeModel=new TreeNodeModel();
			treeNodeModel.setId(d.getDepartid());
			treeNodeModel.setName(d.getDepartname());
			treeNodeModel.setpId(d.getParentdepid());
			listnodes.add(treeNodeModel);
		}
	    String jsonresult =	JSONArray.fromObject(listnodes).toString();
	    resp.setCharacterEncoding("utf-8");
	    try {
			resp.getWriter().print(jsonresult);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
