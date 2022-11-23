package com.example.college_app.ui;

public class LinearPojoHol {
    private String holdate;
    private String holday;
    private String holevent;

    public LinearPojoHol(String holdate, String holday, String holevent) {
        this.holdate = holdate;
        this.holday = holday;
        this.holevent = holevent;
    }

    public String getHoldate() {
        return holdate;
    }

    public String getHolday() {
        return holday;
    }

    public String getHolevent() {
        return holevent;
    }
}
