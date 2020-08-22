package com.sz.admin;

public class Da {
    private int id;
    private int epaperid;
    private String name;
    private int score;
    private String value;


    public Da(int id, int epaperid, String name, int score, String value) {
        this.id = id;
        this.epaperid = epaperid;
        this.name = name;
        this.score = score;
        this.value = value;
    }

    public Da() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEpaperid() {
        return epaperid;
    }

    public void setEpaperid(int epaperid) {
        this.epaperid = epaperid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Da{" +
                "id=" + id +
                ", epaperid=" + epaperid +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", value='" + value + '\'' +
                '}';
    }
}
