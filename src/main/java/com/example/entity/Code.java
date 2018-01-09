package com.example.entity;

public class Code {
    private Integer codeid;

    private String codetype;

    private String codeproice;

    private String codename;

    private String isvalid;

    public Integer getCodeid() {
        return codeid;
    }

    public void setCodeid(Integer codeid) {
        this.codeid = codeid;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype == null ? null : codetype.trim();
    }

    public String getCodeproice() {
        return codeproice;
    }

    public void setCodeproice(String codeproice) {
        this.codeproice = codeproice == null ? null : codeproice.trim();
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename == null ? null : codename.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }
}