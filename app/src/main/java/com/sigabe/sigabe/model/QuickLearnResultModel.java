package com.sigabe.sigabe.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuickLearnResultModel {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("next")
    @Expose
    private Object next;
    @SerializedName("previous")
    @Expose
    private Object previous;
    @SerializedName("results")
    @Expose
    private List<QuickLearnModel> results = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<QuickLearnModel> getResults() {
        return results;
    }

    public void setResults(List<QuickLearnModel> results) {
        this.results = results;
    }
}
