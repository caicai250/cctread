package com.example.cctread.domain;

/**
 * @Auther: caic
 * @Date: 2018/6/12 18:47
 * @Description: 系统代码
 * @Version: 1.0
 */
public class Code {
    private int id;
    private String codeType;
    private String codeProice;
    private String codeName;
    private String isValid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeProice() {
        return codeProice;
    }

    public void setCodeProice(String codeProice) {
        this.codeProice = codeProice;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
