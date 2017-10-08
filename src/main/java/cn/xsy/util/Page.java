package cn.xsy.util;

import cn.xsy.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2017/9/23.
 */
public class Page {

    private Integer pageIndex;  //当前页数

    private Integer pageRocals; //总页数

    private Integer pageRcods; //每页显示的数据

    private Integer pageCoals; //总数据数

    private Integer pageindexs;

    public Integer getPageindexs() {
        return pageindexs;
    }

    public void setPageindexs(Integer pageindexs) {
        this.pageindexs = pageindexs;
    }

    private List<News> info; //返回list集合

    public Page() {
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageRocals() {
        return pageRocals;
    }

    public void setPageRocals(Integer pageRocals) {
        this.pageRocals = pageRocals;
    }

    public Integer getPageRcods() {
        return pageRcods;
    }

    public void setPageRcods(Integer pageRcods) {
        this.pageRcods = pageRcods;
    }

    public Integer getPageCoals() {
        return pageCoals;
    }

    public void setPageCoals(Integer pageCoals) {
        this.pageCoals = pageCoals;
    }

    public List<News> getPage() {
        return info;
    }

    public void setPage(List<News> page) {
        this.info = page;
    }
}
