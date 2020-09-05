package com.eliteams.quick4j.web.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zcfg {
    private Integer id;

    private String name;

    private Date generateDate;

    private String type;

    private Date publishDate;

    private Integer downNumber;

    private String title;

    private Integer isDel;
    
    private String content;

    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate() {
    	Date date = new Date();
        this.generateDate = date;
    }
    public void setGenerateDate(String str) throws ParseException{
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
    	this.generateDate = sdf.parse(str);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String str) throws ParseException {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        this.publishDate = sdf.parse(str);
    }

    public Integer getDownNumber() {
        return downNumber;
    }

    public void setDownNumber(Integer downNumber) {
        this.downNumber = downNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
    public String getGenerateDateString(){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
    	String str = sdf.format(this.getGenerateDate());
    	return str;
    }
    public String getPublishDateString(){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
        String str = sdf.format(this.getPublishDate());
    	return str;
    }
}