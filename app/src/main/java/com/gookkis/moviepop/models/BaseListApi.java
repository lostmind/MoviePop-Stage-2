package com.gookkis.moviepop.models;

import java.util.ArrayList;

public class BaseListApi<T> {
    private int page;
    private int total_pages;
    private long total_results;
    private ArrayList<T> results;
    private String status_code;
    private String status_message;

    public String getStatus_code() {
        return status_code;
    }

    public String getStatus_message() {
        return status_message;
    }

    public ArrayList<T> getResults() {
        return results;
    }

    public long getTotal_results() {
        return total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public int getPage() {
        return page;
    }

}