package com.example.entity;

import java.util.Date;

public class CctCollection {
    private Integer collectionid;

    private String userid;

    private Integer novalid;

    private Date conllectiondate;

    public Integer getCollectionid() {
        return collectionid;
    }

    public void setCollectionid(Integer collectionid) {
        this.collectionid = collectionid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getNovalid() {
        return novalid;
    }

    public void setNovalid(Integer novalid) {
        this.novalid = novalid;
    }

    public Date getConllectiondate() {
        return conllectiondate;
    }

    public void setConllectiondate(Date conllectiondate) {
        this.conllectiondate = conllectiondate;
    }
}