package cn.xsy.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/9/26.
 */
public class Talk {
    private Integer Tid ;//评论编号 自增
    private String Content ;//评论内容
    private Date Talktime;// 评论时间
    private Integer nid;

    public Integer getTid() {
        return Tid;
    }

    public void setTid(Integer tid) {
        Tid = tid;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getTalktime() {
        return Talktime;
    }

    public void setTalktime(Date talktime) {
        Talktime = talktime;
    }

    public Integer getNid() {
        return Nid;
    }

    public void setNid(Integer nid) {
        Nid = nid;
    }

    private Integer Nid ;//  咨讯外键

}
