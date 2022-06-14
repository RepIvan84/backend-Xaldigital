package com.xaldigital.retojava.restapi.jsonapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ConsumerDTO {
    @JsonProperty("link")
    private String itemsLink;

    @JsonProperty("title")
    private String itemsTitle;
    @JsonProperty("is_answered")
    boolean itemsIs_answered;
    @JsonProperty("view_count")
    private Long itemsView_count;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @JsonProperty("creation_date")
    Date itemsCreation_date;

    public String getItemsLink() {
        return itemsLink;
    }

    public void setItemsLink(String itemsLink) {
        this.itemsLink = itemsLink;
    }

    public String getItemsTitle() {
        return itemsTitle;
    }

    public void setItemsTitle(String itemsTitle) {
        this.itemsTitle = itemsTitle;
    }

    public boolean isItemsIs_answered() {
        return itemsIs_answered;
    }

    public void setItemsIs_answered(boolean itemsIs_answered) {
        this.itemsIs_answered = itemsIs_answered;
    }

    public Long getItemsView_count() {
        return itemsView_count;
    }

    public void setItemsView_count(Long itemsView_count) {
        this.itemsView_count = itemsView_count;
    }

    public Date getItemsCreation_date() {
        return itemsCreation_date;
    }

    public void setItemsCreation_date(Date itemsCreation_date) {
        this.itemsCreation_date = itemsCreation_date;
    }
}
