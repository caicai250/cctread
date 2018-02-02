package com.example.entity.vo;

/**
 * 书籍vo对象
 *
 * @author caiteng
 * @version 1.0 创建时间：2018-02-02 10:21
 */
public class Book {

    /**
     * 书名
     */
    private String bookName;
    /**
     * 章节名
     */
    private String chapterName;
    /**
     * 内容
     */
    private String content;
    /**
     * 上一章节名称
     */
    private String prevChapterName;
    /**
     * 上一章节url
     */
    private String prevChapterUrl;
    /**
     * 下一章节名称
     */
    private String nextChapterName;
    /**
     * 下一章节url
     */
    private String nextChapterUrl;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrevChapterName() {
        return prevChapterName;
    }

    public void setPrevChapterName(String prevChapterName) {
        this.prevChapterName = prevChapterName;
    }

    public String getPrevChapterUrl() {
        return prevChapterUrl;
    }

    public void setPrevChapterUrl(String prevChapterUrl) {
        this.prevChapterUrl = prevChapterUrl;
    }

    public String getNextChapterName() {
        return nextChapterName;
    }

    public void setNextChapterName(String nextChapterName) {
        this.nextChapterName = nextChapterName;
    }

    public String getNextChapterUrl() {
        return nextChapterUrl;
    }

    public void setNextChapterUrl(String nextChapterUrl) {
        this.nextChapterUrl = nextChapterUrl;
    }
}
