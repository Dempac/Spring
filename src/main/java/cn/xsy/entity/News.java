package cn.xsy.entity;

/**
 * Created by Administrator on 2017/9/26.
 */
public class News {

     private Integer  newsid;      //咨讯
     private String newstitle ;    //咨讯标题
     private String newsContene;  //咨讯内容
     private Integer clickCount;  //访问量

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsContene() {
        return newsContene;
    }

    public void setNewsContene(String newsContene) {
        this.newsContene = newsContene;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}
