package com.jinglin.zy.ztree.model.vo;

import java.io.Serializable;

/**
 * @author DELL
 * ���ǽ����ϵ�������ʾ
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
		if(pId.equals("0")) { //������ܵĸ����ڵ㣬��ôĬ�ϴ�
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
