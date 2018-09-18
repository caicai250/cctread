package com.example.cctread.vo;

/**
 * 分页模板类
 * @Auther: caic
 * @Date: 2018/8/22 17:29
 * @Description:
 * @Version: 1.0
 */
public class Paging {

    //当前的页码
    private int pageNo;

    //总页数
    private int totalPage;

    //显示的页码个数
    private int showPages;

    //回调方法名（需在js中自己定义）
    private String callFunName;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getShowPages() {
        return showPages;
    }

    public void setShowPages(int showPages) {
        this.showPages = showPages;
    }

    public String getCallFunName() {
        return callFunName;
    }

    public void setCallFunName(String callFunName) {
        this.callFunName = callFunName;
    }
}
