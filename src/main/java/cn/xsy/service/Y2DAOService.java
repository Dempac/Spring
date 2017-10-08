package cn.xsy.service;

import cn.xsy.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
public interface Y2DAOService {
    //查询数据库的数据总数的方法
    public int getPageRcals();

    //分页查询的方法
    public List<News> getPageSelect(int pageIndex, int pageRcods);
}
