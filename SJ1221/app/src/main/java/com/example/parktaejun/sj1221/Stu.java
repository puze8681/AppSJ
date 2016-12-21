package com.example.parktaejun.sj1221;

/**
 * Created by parktaejun on 2016. 12. 21..
 */

public class Stu {
    private String name;
    private long id;

    public Stu(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
