package cn.xsy.service.impl;

import cn.xsy.dao.IY2DAO;
import cn.xsy.entity.News;
import cn.xsy.service.Y2DAOService;

import cn.xsy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
public class IY2DAOServiceImpl implements Y2DAOService {

    IY2DAO dao;
    public IY2DAOServiceImpl(){
        SqlSession session = MyBatisUtil.getSession();
        dao= session.getMapper(IY2DAO.class);
    }

    public int getPageRcals() {

        return dao.getPageRcals();
    }

    public List<News> getPageSelect(int pageIndex, int pageRcods) {

        return dao.getPageSelect(pageIndex,pageRcods);
    }
}
