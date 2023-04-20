package com.sacral.STPN-42.controller;

import com.sacral.STPN-42.dto.AuditLogDto;
import com.sacral.STPN-42.service.AuditLogControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auditLog")
public class AuditLogController {

    @Autowired
    private AuditLogControllerService auditLogControllerService;

    @PostMapping("/save")
    public AuditLogDto saveAuditLog(@RequestBody AuditLogDto auditLogDto) {
        return auditLogControllerService.saveAuditLog(auditLogDto);
    }

}