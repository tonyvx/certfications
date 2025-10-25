package com.tonyvx.certifications.service;

import com.tonyvx.certifications.model.CertificateInfo;
import com.tonyvx.certifications.repository.CertificateInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CertificateInfoService {
    private final CertificateInfoRepository repository;

    public CertificateInfoService(CertificateInfoRepository repository) {
        this.repository = repository;
    }

    public List<CertificateInfo> getAll() {
        return repository.findAll();
    }

    public Optional<CertificateInfo> getById(UUID id) {
        return repository.findById(id);
    }

    public CertificateInfo add(CertificateInfo cert) {
        return repository.save(cert);
    }

    public CertificateInfo update(UUID id, CertificateInfo cert) {
        cert.setId(id);
        return repository.save(cert);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
