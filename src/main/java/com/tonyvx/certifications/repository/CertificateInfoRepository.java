package com.tonyvx.certifications.repository;

import com.tonyvx.certifications.model.CertificateInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CertificateInfoRepository extends JpaRepository<CertificateInfo, UUID> {
}
