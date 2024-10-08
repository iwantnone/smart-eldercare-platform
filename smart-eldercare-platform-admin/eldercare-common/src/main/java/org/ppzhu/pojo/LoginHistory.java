package com.sample;


public class LoginHistory {

  private long historyId;
  private long userId;
  private java.sql.Timestamp loginTime;
  private String loginIpAddress;
  private String loginDevice;
  private long createdBy;
  private java.sql.Timestamp createdAt;
  private long updatedBy;
  private java.sql.Timestamp updatedAt;


  public long getHistoryId() {
    return historyId;
  }

  public void setHistoryId(long historyId) {
    this.historyId = historyId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Timestamp loginTime) {
    this.loginTime = loginTime;
  }


  public String getLoginIpAddress() {
    return loginIpAddress;
  }

  public void setLoginIpAddress(String loginIpAddress) {
    this.loginIpAddress = loginIpAddress;
  }


  public String getLoginDevice() {
    return loginDevice;
  }

  public void setLoginDevice(String loginDevice) {
    this.loginDevice = loginDevice;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public long getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(long updatedBy) {
    this.updatedBy = updatedBy;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
