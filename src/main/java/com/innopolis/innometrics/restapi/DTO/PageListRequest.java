package com.innopolis.innometrics.restapi.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageListRequest implements Serializable {
    List<PageRequest> pageList;

    public PageListRequest() {
        pageList = new ArrayList<>();
    }

    public PageListRequest(List<PageRequest> pageList) {
        this.pageList = pageList;
    }

    public List<PageRequest> getPageList() {
        return pageList;
    }

    public void setPageList(List<PageRequest> pageList) {
        this.pageList = pageList;
    }

    public void addPageRequest(PageRequest pageRequest){
        this.pageList.add(pageRequest);
    }
}
