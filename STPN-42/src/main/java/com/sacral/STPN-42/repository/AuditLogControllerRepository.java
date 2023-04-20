package com.sacral.STPN-42.repository;

import com.sacral.STPN-42.dto.AuditLogDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.validation.Valid;

@Repository
public class AuditLogControllerRepository {

    @Autowired
    private ManagementService managementService;

    public AuditLogDto saveAuditLog(@Valid AuditLogDto auditLogDto) {
        return managementService.saveAuditLog(auditLogDto);
    }

}