package com.xaldigital.retojava.restapi.jsonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class Consumer {

    @JsonProperty("items")
    private ArrayList<Items> items = new ArrayList<Items>();

    private boolean has_more;

    private Integer quota_max;

    private Integer quota_remaining;

    public Consumer() {
    }


    public Consumer(ArrayList<Items> items, boolean has_more, Integer quota_max, Integer quota_remaining) {
        this.items = items;
        this.has_more = has_more;
        this.quota_max = quota_max;
        this.quota_remaining = quota_remaining;
    }


    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public Integer getQuota_max() {
        return quota_max;
    }

    public void setQuota_max(Integer quota_max) {
        this.quota_max = quota_max;
    }

    public Integer getQuota_remaining() {
        return quota_remaining;
    }

    public void setQuota_remaining(Integer quota_remaining) {
        this.quota_remaining = quota_remaining;
    }

    @Override
    public String toString() {
        return "Consumer [items=" + items + ", has_more=" + has_more + ", quota_max=" + quota_max + ", quota_remaining="
                + quota_remaining + "]";
    }
}
