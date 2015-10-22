package com.example.guillermo.reminders;

/**
 * Created by Guillermo on 21/10/2015.
 */
public class Reminder {
    private int mId;
    private String mContent;
    private int mImportant;

    public Reminder(int id, String content, int important){
        mId = id;
        mContent = content;
        mImportant = important;
    }

    public int getId(){
        return mId;
    }

    public void setId(int pId){
        mId = pId;
    }

    public String getContent(){
        return mContent;
    }

    public void setContent(String pContent){
        mContent = pContent;
    }

    public int getImportant(){
        return mImportant;
    }

    public void setImportant(int pImportant){
        mImportant = pImportant;
    }
}
