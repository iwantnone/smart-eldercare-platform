package org.ppzhu.pojo;


public class CaregiverProfile {

  private long caregiverId;
  private String caregiverName;
  private long caregiverAge;
  private String caregiverGender;
  private String caregiverQualification;
  private String specialization;
  private String caregiverHealth;
  private long caregiverStars;
  private long createdBy;
  private java.sql.Timestamp createdAt;
  private long updatedBy;
  private java.sql.Timestamp updatedAt;


  public long getCaregiverId() {
    return caregiverId;
  }

  public void setCaregiverId(long caregiverId) {
    this.caregiverId = caregiverId;
  }


  public String getCaregiverName() {
    return caregiverName;
  }

  public void setCaregiverName(String caregiverName) {
    this.caregiverName = caregiverName;
  }


  public long getCaregiverAge() {
    return caregiverAge;
  }

  public void setCaregiverAge(long caregiverAge) {
    this.caregiverAge = caregiverAge;
  }


  public String getCaregiverGender() {
    return caregiverGender;
  }

  public void setCaregiverGender(String caregiverGender) {
    this.caregiverGender = caregiverGender;
  }


  public String getCaregiverQualification() {
    return caregiverQualification;
  }

  public void setCaregiverQualification(String caregiverQualification) {
    this.caregiverQualification = caregiverQualification;
  }


  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }


  public String getCaregiverHealth() {
    return caregiverHealth;
  }

  public void setCaregiverHealth(String caregiverHealth) {
    this.caregiverHealth = caregiverHealth;
  }


  public long getCaregiverStars() {
    return caregiverStars;
  }

  public void setCaregiverStars(long caregiverStars) {
    this.caregiverStars = caregiverStars;
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
