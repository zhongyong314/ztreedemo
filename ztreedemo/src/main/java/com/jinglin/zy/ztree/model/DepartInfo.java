package com.jinglin.zy.ztree.model;

import java.io.Serializable;

public class DepartInfo implements Serializable {
	private String departid;

	public String getDepartid() {
		return departid;
	}

	public void setDepartid(String departid) {
		this.departid = departid;
	}

	public String getDepartname() {
		return departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	public String getParentdepid() {
		return parentdepid;
	}

	public void setParentdepid(String parentdepid) {
		this.parentdepid = parentdepid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	private String departname;
	private String parentdepid;
	private String remark;
}
