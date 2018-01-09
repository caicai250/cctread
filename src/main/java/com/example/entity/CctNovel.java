package com.example.entity;

import java.util.Date;

public class CctNovel {
    private Integer novelid;

    private String title;

    private String noveltype;

    private String author;

    private String novelstate;

    private Date startdate;

    private Date updatedate;

    private String ischarge;

    private byte[] nocalcover;

    public Integer getNovelid() {
        return novelid;
    }

    public void setNovelid(Integer novelid) {
        this.novelid = novelid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNoveltype() {
        return noveltype;
    }

    public void setNoveltype(String noveltype) {
        this.noveltype = noveltype == null ? null : noveltype.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getNovelstate() {
        return novelstate;
    }

    public void setNovelstate(String novelstate) {
        this.novelstate = novelstate == null ? null : novelstate.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getIscharge() {
        return ischarge;
    }

    public void setIscharge(String ischarge) {
        this.ischarge = ischarge == null ? null : ischarge.trim();
    }

    public byte[] getNocalcover() {
        return nocalcover;
    }

    public void setNocalcover(byte[] nocalcover) {
        this.nocalcover = nocalcover;
    }
}