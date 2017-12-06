package com.appsticit.sqldatabase;

import android.content.Context;

/**
 * Created by Bj on 13-11-17.
 */

public class DataTemp {

    private int id ;
    private String name;
    private String phone;
    private Context c;

    public DataTemp(String name, String phone){

        this.name=name;
        this.phone=phone;
    }
    public DataTemp(){


    }
    public DataTemp(String phone){
        this.phone=phone;
    }
    public DataTemp(Context c){

        this.c = c;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
