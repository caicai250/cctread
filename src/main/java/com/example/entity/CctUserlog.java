package com.example.entity;

public class CctUserlog {
    private Integer userlogid;

    private String userid;

    private Integer novelid;

    private String bookmark;

    private String remarks;

    public Integer getUserlogid() {
        return userlogid;
    }

    public void setUserlogid(Integer userlogid) {
        this.userlogid = userlogid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getNovelid() {
        return novelid;
    }

    public void setNovelid(Integer novelid) {
        this.novelid = novelid;
    }

    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark == null ? null : bookmark.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}