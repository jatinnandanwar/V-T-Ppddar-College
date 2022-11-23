package com.example.college_app.ui.faculty;

public class LinearPojo {
    private int img;
    private String name;
    private String age;
    private String des;
    private String det;

    public LinearPojo(int img, String name, String des, String age, String det ){
        this.img = img;
        this.name = name;
        this.age = age;
        this.des = des;
        this.det = det;
    }

    public String getDet() {
        return det;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDes() {
        return des;
    }
}
