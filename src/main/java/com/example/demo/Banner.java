package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Banner {
    @JsonIgnore
    private final long id;
    private final String src;
    @JsonFormat(pattern = "YY-MM-DD")
    private final Date updateDate;

    public Banner(long id, String src, Date updateDate) {
        this.id = id;
        this.src = src;
        this.updateDate = updateDate;
    }
    public Banner(long id, String src) {
        this.id = id;
        this.src = src;
        this.updateDate = new Date();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public long getId() {
        return id;
    }

    public String getSrc() {
        return src;
    }
}
