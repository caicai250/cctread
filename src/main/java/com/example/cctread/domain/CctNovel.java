package com.example.cctread.domain;

import java.sql.Blob;
import java.util.Date;

/**
 * @Auther: caic
 * @Date: 2018/6/21 11:38
 * @Description: 书籍实体类
 * @Version: 1.0
 */
public class CctNovel {
    private int novelId;
    private String novelTitle;
    private String novelType;
    private String author;
    private String novelState;
    private Date startDate;
    private Date updateDate;
    private byte[] novelCover;
    private String isCharge;
    private int bookLike;
    private String intro;

    public int getNovelId() {
        return novelId;
    }

    public void setNovelId(int novelId) {
        this.novelId = novelId;
    }

    public String getNovelTitle() {
        return novelTitle;
    }

    public void setNovelTitle(String novelTitle) {
        this.novelTitle = novelTitle;
    }

    public String getNovelType() {
        return novelType;
    }

    public void setNovelType(String novelType) {
        this.novelType = novelType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNovelState() {
        return novelState;
    }

    public void setNovelState(String novelState) {
        this.novelState = novelState;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public byte[] getNovelCover() {
        return novelCover;
    }

    public void setNovelCover(byte[] novelCover) {
        this.novelCover = novelCover;
    }

    public String getIsCharge() {
        return isCharge;
    }

    public void setIsCharge(String isCharge) {
        this.isCharge = isCharge;
    }

    public int getBookLike() {
        return bookLike;
    }

    public void setBookLike(int bookLike) {
        this.bookLike = bookLike;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "CctNovel{" +
                "novelId=" + novelId +
                ", novelTitle='" + novelTitle + '\'' +
                ", novelType='" + novelType + '\'' +
                ", author='" + author + '\'' +
                ", novelState='" + novelState + '\'' +
                ", startDate=" + startDate +
                ", updateDate=" + updateDate +
                ", novelCover=" + novelCover +
                ", isCharge='" + isCharge + '\'' +
                ", bookLike=" + bookLike +
                ", intro='" + intro + '\'' +
                '}';
    }
}
