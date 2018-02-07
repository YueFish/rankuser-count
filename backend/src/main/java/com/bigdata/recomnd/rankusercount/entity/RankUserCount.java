package com.bigdata.recomnd.rankusercount.entity;


import org.springframework.data.annotation.Id;

public class RankUserCount {
    @Id
    private String id;
    private String pid;
    private int count;

    public RankUserCount(String id, String pid, int count) {
        this.id = id;
        this.pid = pid;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        return "RankUserCount{" +
                "id='" + id + '\'' +
                ", pid='" + pid + '\'' +
                ", count=" + count +
                '}';
    }

}
