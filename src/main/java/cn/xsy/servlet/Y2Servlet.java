package cn.xsy.servlet;

import cn.xsy.entity.News;
import cn.xsy.service.Y2DAOService;
import cn.xsy.service.impl.IY2DAOServiceImpl;
import cn.xsy.util.Page;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 */
public class Y2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.解决乱码
        request.setCharacterEncoding("utf-8");
        //2.调度service
        Y2DAOService service = new IY2DAOServiceImpl();
        //设置action
        String action = request.getParameter("action");
        System.out.println(action);

        if ("page".equals(action)&&action!="page") {


            Page page = new Page();  //分页的实体类

            int pageRcods = 0; //初始化每页显示的信息为0

            int totalCount = 0;  //初始化数据的数为0

            pageRcods = 1;
            totalCount = service.getPageRcals();


            page.setPageCoals(totalCount);  //总共有几条信息
            System.out.println("总共有几条信息" + "=====" + totalCount);

            page.setPageRcods(pageRcods); //每页显示的数据
            System.out.println("每页显示的信息" + "=====" + pageRcods);

            int totalPages = totalCount % pageRcods == 0 ? totalCount / pageRcods : totalCount / pageRcods + 1;
            page.setPageRocals(totalPages); //总页数
            System.out.println("总的页数" + "=====" + totalPages);

            int pageIndex = 1;  //当前页数
            if (request.getParameter("pageIndex") != null
                    && request.getParameter("pageIndex") != "") {
                try {
                    pageIndex = Integer.parseInt(request
                            .getParameter("pageIndex"));
                } catch (Exception ex) {
                    pageIndex = 1;
                }
            }

            if (pageIndex >= totalPages) {
                pageIndex = totalPages;
            }
            if (pageIndex <= 0) {
                pageIndex = 1;
            }

            page.setPageIndex(pageIndex);
            System.out.println("当前页数" + "======" + pageIndex);

            List<News> newsinfo = null;
            page.setPageindexs((pageIndex - 1) * pageRcods);
            newsinfo = service.getPageSelect((pageIndex - 1) * pageRcods, pageRcods);
            for (News item : newsinfo) {

            }
            page.setPage(newsinfo);

            request.setAttribute("page", page);

            request.setAttribute("newsinfo", newsinfo);

            request.getRequestDispatcher("/index.jsp").forward(request, response);

        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);

    }
}
