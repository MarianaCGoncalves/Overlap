package com.example.overlapandroidstudio;

public class Tag {
     private int tagId;
     private String tagName;
     private boolean isselec;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public int getTagId() {
        return tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public boolean isIsselec() {
        return isselec;
    }
    public void setIsselec(boolean isselec){
        this.isselec= isselec;
    }
}
