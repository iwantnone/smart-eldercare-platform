package com.sample;


public class MedicalHistory {

  private long medicalHistoryId;
  private long elderlyId;
  private String diseaseName;
  private String diagnosisDate;
  private String isCurrent;
  private String description;
  private long createdBy;
  private java.sql.Timestamp createdAt;
  private long updatedBy;
  private java.sql.Timestamp updatedAt;


  public long getMedicalHistoryId() {
    return medicalHistoryId;
  }

  public void setMedicalHistoryId(long medicalHistoryId) {
    this.medicalHistoryId = medicalHistoryId;
  }


  public long getElderlyId() {
    return elderlyId;
  }

  public void setElderlyId(long elderlyId) {
    this.elderlyId = elderlyId;
  }


  public String getDiseaseName() {
    return diseaseName;
  }

  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }


  public String getDiagnosisDate() {
    return diagnosisDate;
  }

  public void setDiagnosisDate(String diagnosisDate) {
    this.diagnosisDate = diagnosisDate;
  }


  public String getIsCurrent() {
    return isCurrent;
  }

  public void setIsCurrent(String isCurrent) {
    this.isCurrent = isCurrent;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
