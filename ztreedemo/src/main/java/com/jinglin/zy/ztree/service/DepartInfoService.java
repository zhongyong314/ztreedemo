package com.jinglin.zy.ztree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinglin.zy.ztree.dao.imp.DepartInfoImp;
import com.jinglin.zy.ztree.model.DepartInfo;

/**
 * @author DELL
 * 
 */
@Service
public class DepartInfoService {
   @Autowired
   private DepartInfoImp departInfoImp;
   
   public List<DepartInfo> getalldeparts(){
	   return departInfoImp.getlist();
   }
}
