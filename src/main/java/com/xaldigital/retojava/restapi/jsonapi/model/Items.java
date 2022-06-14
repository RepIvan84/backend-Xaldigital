package com.xaldigital.retojava.restapi.jsonapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.google.gson.annotations.JsonAdapter;
import com.xaldigital.retojava.restapi.jsonapi.utils.UnixTimestampAdapter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@SuppressWarnings("deprecation")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class Items {

    @JsonProperty("tags")
    private ArrayList<String> tags = new ArrayList<String>();

    private Owner owner;

    private boolean is_answered;

    private Long view_count;

    @JsonAdapter(UnixTimestampAdapter.class)
    private Date closed_date;

    private Long accepted_answer_id;

    private Integer answer_count;

    private Integer score;
    @JsonAdapter(UnixTimestampAdapter.class)
    private Date last_activity_date;

    @JsonAdapter(UnixTimestampAdapter.class)
    private Date creation_date;

    @JsonAdapter(UnixTimestampAdapter.class)
    private Date last_edit_date;

    private Long question_id;

    private String content_license;

    private String link;

    private String closed_reason;

    private String title;

    public Date getClosed_date() {
        return closed_date;
    }

    public void setClosed_date(Date closed_date) {
        this.closed_date = closed_date;
    }

    public String getClosed_reason() {
        return closed_reason;
    }

    public void setClosed_reason(String closed_reason) {
        this.closed_reason = closed_reason;
    }

    public void setLast_activity_date(Date last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isIs_answered() {
        return is_answered;
    }

    public void setIs_answered(boolean is_answered) {
        this.is_answered = is_answered;
    }

    public Long getView_count() {
        return view_count;
    }

    public void setView_count(Long view_count) {
        this.view_count = view_count;
    }

    public Long getAccepted_answer_id() {
        return accepted_answer_id;
    }

    public void setAccepted_answer_id(Long accepted_answer_id) {
        this.accepted_answer_id = accepted_answer_id;
    }

    public Integer getAnswer_count() {
        return answer_count;
    }

    public void setAnswer_count(Integer answer_count) {
        this.answer_count = answer_count;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getLast_activity_date() {
        return last_activity_date;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getLast_edit_date() {
        return last_edit_date;
    }

    public void setLast_edit_date(Date last_edit_date) {
        this.last_edit_date = last_edit_date;
    }

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

    public String getContent_license() {
        return content_license;
    }

    public void setContent_license(String content_license) {
        this.content_license = content_license;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Items [tags=" + tags + ", owner=" + owner + ", is_answered=" + is_answered + ", view_count="
                + view_count + ", closed_date=" + closed_date + ", accepted_answer_id=" + accepted_answer_id
                + ", answer_count=" + answer_count + ", score=" + score + ", last_activity_date=" + last_activity_date
                + ", creation_date=" + creation_date + ", last_edit_date=" + last_edit_date + ", question_id="
                + question_id + ", content_license=" + content_license + ", link=" + link + ", closed_reason="
                + closed_reason + ", title=" + title + "]";
    }
}
