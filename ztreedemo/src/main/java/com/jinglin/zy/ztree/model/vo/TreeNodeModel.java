package com.jinglin.zy.ztree.model.vo;

import java.io.Serializable;

/**
 * @author DELL
 * 这是界面上的数据显示
 */
public class TreeNodeModel implements Serializable {
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
		if(pId.equals("0")) { //如果是总的父级节点，那么默认打开
			this.open=true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setOpen(boolean open) {
		this.open = open;
	}

	private String id;
	private String pId;
	private String name;
	private boolean open=false;
	public boolean getOpen() {
		return open;
	}
   
}
