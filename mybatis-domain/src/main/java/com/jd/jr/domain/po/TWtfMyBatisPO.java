package com.jd.jr.domain.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by wangtengfei3 on 2018/5/21.
 */
public class TWtfMyBatisPO {

    private long id;
    private String name;
    private String note;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date  updateTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

 /*   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")*/
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /*@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")*/
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public TWtfMyBatisPO() {
    }

    public TWtfMyBatisPO(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public TWtfMyBatisPO(long id, String name, String note, Date updateTime, Date createTime) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TWtfMyBatisPO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }
}
