package com.innopolis.innometrics.restapi.DTO;

import java.io.Serializable;

public class PageRequest implements Serializable {
    private String page;

    private String icon;

    public PageRequest(){}

    public PageRequest(String page, String icon) {
        this.page = page;
        this.icon = icon;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
