package com.example.cctread.domain;

import java.util.Date;

/**
 * @Auther: caic
 * @Date: 2018/6/21 11:56
 * @Description: 章节实体类
 * @Version: 1.0
 */
public class CctChapter {
    private int chapterId;
    private int novelId;
    private String chapterName;
    private String synopsis;
    private Date updateDate;
    private int startRow;
    private int endRow;
    private String chapterPath;

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getNovelId() {
        return novelId;
    }

    public void setNovelId(int novelId) {
        this.novelId = novelId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public String getChapterPath() {
        return chapterPath;
    }

    public void setChapterPath(String chapterPath) {
        this.chapterPath = chapterPath;
    }
}
