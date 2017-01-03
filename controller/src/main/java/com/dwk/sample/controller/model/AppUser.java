package com.dwk.sample.controller.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

public class AppUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private UUID appUserId;

    private String email;

    private String firstName;

    private Timestamp lastLoginDt;

    private String lastName;

    private String loginId;

    private String pswd;

    private Timestamp pswdLastChngDt;

    public UUID getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(final UUID appUserId) {
        this.appUserId = appUserId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public Timestamp getLastLoginDt() {
        return lastLoginDt;
    }

    public void setLastLoginDt(final Timestamp lastLoginDt) {
        this.lastLoginDt = lastLoginDt;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(final String loginId) {
        this.loginId = loginId;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(final String pswd) {
        this.pswd = pswd;
    }

    public Timestamp getPswdLastChngDt() {
        return pswdLastChngDt;
    }

    public void setPswdLastChngDt(final Timestamp pswdLastChngDt) {
        this.pswdLastChngDt = pswdLastChngDt;
    }

}
