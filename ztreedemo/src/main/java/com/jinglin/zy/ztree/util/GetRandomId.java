package com.jinglin.zy.ztree.util;

import java.util.UUID;

import org.junit.Test;

/**
 * @author DELL
 *
 */
public class GetRandomId {
	
  /**
 * @return ·µ»Ø32Î»µÄuuid×Ö·û´®
 */
public static String getuuid32() {
	return   UUID.randomUUID().toString().replace("-","");
  }
 
}
