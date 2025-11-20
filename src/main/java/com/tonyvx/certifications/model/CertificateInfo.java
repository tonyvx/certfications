package com.tonyvx.certifications.model;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "certificate_info", schema = "certifications")
public class CertificateInfo {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String notes;
    private String certificateUrl;
    private LocalDate dateOfCertification;
    private String status;

    // Getters and setters
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    public String getCertificateUrl() { return certificateUrl; }
    public void setCertificateUrl(String certificateUrl) { this.certificateUrl = certificateUrl; }
    public LocalDate getDateOfCertification() { return dateOfCertification; }
    public void setDateOfCertification(LocalDate dateOfCertification) { this.dateOfCertification = dateOfCertification; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
