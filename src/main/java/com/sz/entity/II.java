package com.sz.entity;

public class II {
    private int id;
    private int uid;

    @Override
    public String toString() {
        return "II{" +
                "id=" + id +
                ", uid=" + uid +
                '}';
    }

    public II() {
    }

    public II(int id, int uid) {
        this.id = id;
        this.uid = uid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
