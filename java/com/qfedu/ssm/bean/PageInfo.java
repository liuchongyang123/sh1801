package com.qfedu.ssm.bean;

import java.util.List;

public class PageInfo<T> {
    private int pageNo;
    private long pageCount;
    private int pageSize;
    private List<T> itms;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public long getPageCount() {
        return pageCount;
    }

    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getItms() {
        return itms;
    }

    public void setItms(List<T> itms) {
        this.itms = itms;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "pageNo=" + pageNo +
                ", pageCount=" + pageCount +
                ", pageSize=" + pageSize +
                ", itms=" + itms +
                '}';
    }

    public void setItems(List<T> items) {
    }
}
