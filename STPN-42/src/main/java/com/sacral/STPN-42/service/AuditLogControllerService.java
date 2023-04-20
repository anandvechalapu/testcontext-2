package com.sacral.STPN-42.service;

import com.sacral.STPN-42.dto.AuditLogDto;
import com.sacral.STPN-42.repository.AuditLogControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditLogControllerService {

    @Autowired
    private AuditLogControllerRepository auditLogControllerRepository;

    public AuditLogDto saveAuditLog(AuditLogDto auditLogDto) {
        return auditLogControllerRepository.saveAuditLog(auditLogDto);
    }
}