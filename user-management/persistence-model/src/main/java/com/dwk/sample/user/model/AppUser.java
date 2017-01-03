package com.dwk.sample.user.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the APP_USER database table.
 *
 */
@Entity
@Table(name="APP_USER")
@NamedQuery(name="AppUser.findAll", query="SELECT a FROM AppUser a")
public class AppUser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    // @Gener
    @Column(name="APP_USER_ID", unique=true, nullable=false)
    private UUID appUserId;

    @Column(length=256)
    private String email;

    @Column(name="FIRST_NAME", length=32)
    private String firstName;

    @Column(name="LAST_LOGIN_DT")
    private Timestamp lastLoginDt;

    @Column(name="LAST_NAME", length=32)
    private String lastName;

    @Column(name="LOGIN_ID", length=32)
    private String loginId;

    @Column(length=32)
    private String pswd;

    @Column(name="PSWD_LAST_CHNG_DT")
    private Timestamp pswdLastChngDt;

    public AppUser() {
    }

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