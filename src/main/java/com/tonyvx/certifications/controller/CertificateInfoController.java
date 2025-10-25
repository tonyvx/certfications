package com.tonyvx.certifications.controller;

import com.tonyvx.certifications.model.CertificateInfo;
import com.tonyvx.certifications.service.CertificateInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/certificates")
public class CertificateInfoController {
    private final CertificateInfoService service;

    public CertificateInfoController(CertificateInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<CertificateInfo> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CertificateInfo> getById(@PathVariable UUID id) {
        Optional<CertificateInfo> cert = service.getById(id);
        return cert.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CertificateInfo add(@RequestBody CertificateInfo cert) {
        return service.add(cert);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CertificateInfo> update(@PathVariable UUID id, @RequestBody CertificateInfo cert) {
        if (!service.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(service.update(id, cert));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        if (!service.getById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
