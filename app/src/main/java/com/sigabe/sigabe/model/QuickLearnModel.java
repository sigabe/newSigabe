package com.sigabe.sigabe.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuickLearnModel {
    @SerializedName("disaster")
    @Expose
    private String disaster;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("audio")
    @Expose
    private String audio;

    public String getDisaster() {
        return disaster;
    }

    public void setDisaster(String disaster) {
        this.disaster = disaster;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
