package com.pcits.assetsmanager.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pcs")
public class userDetails {
    private int useid;
    private String username;
    private String emailId;
    private long mobileNumber;

    public userDetails(int useid, java.lang.String username, java.lang.String emailId, long mobileNumber) {
        this.useid = useid;
        this.username = username;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
    }

    public int getUseid() {
        return useid;
    }

    public void setUseid(int useid) {
        this.useid = useid;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getEmailId() {
        return emailId;
    }

    public void setEmailId(java.lang.String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
