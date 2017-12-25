package com.jinglin.zy.ztree.dao;

import java.util.List;

public interface IDaoZtree<T> {
   int additem(T t);
   int updateitem(T t);
   int delitem(Object id);
   T getmodel(Object id);
   List<T> getlist();
   List<T> getlistbyparam(T t);
}
