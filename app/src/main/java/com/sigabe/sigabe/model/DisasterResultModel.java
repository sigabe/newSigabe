package com.sigabe.sigabe.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DisasterResultModel {

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("next")
    @Expose
    private String next;

    @SerializedName("previous")
    @Expose
    private String previous;

    @SerializedName("results")
    @Expose
    private List<DisasterModel> results;

    public DisasterResultModel(Integer count, String next, String previous, List<DisasterModel> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public DisasterResultModel() {
    }

    public Integer getCount() {

        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {

        return next;
    }

    public void setNext(String next) {

        this.next = next;
    }

    public String getPrevious() {

        return previous;
    }

    public void setPrevious(String previous) {

        this.previous = previous;
    }

    public List<DisasterModel> getResults() {

        return results;
    }

    public void setResults(List<DisasterModel> results) {
        this.results = results;
    }
}
