package com.sunknowledge.dme.rcm.web.rest.audittrail;

import com.sunknowledge.dme.rcm.audittrailutil.AuditLogReportDTO;
import com.sunknowledge.dme.rcm.service.audittrail.BranchGroupAuditLogServiceExtended;
import com.sunknowledge.dme.rcm.service.audittrail.BranchItemLocationMapAuditLogServiceExtended;
import com.sunknowledge.dme.rcm.service.dto.audittrail.BranchGroupAuditLogParameterDTO;
import com.sunknowledge.dme.rcm.service.dto.audittrail.BranchNoAuditLogParameterDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BranchItemLocationMapAuditTrailResourceExtended {
    private final Logger log = LoggerFactory.getLogger(BranchItemLocationMapAuditTrailResourceExtended.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    @Autowired
    @Qualifier("branchItemLocationMapAuditLogServiceExtendedImpl")
    BranchItemLocationMapAuditLogServiceExtended branchItemLocationMapAuditLogServiceExtended;

    /**
     * Get BranchItemLocationMap Audit Trail .......
     */
    @GetMapping("getBranchItemLocationMapAuditLog")
    public List<AuditLogReportDTO> getBranchItemLocationMapAuditLog(
        @ModelAttribute BranchNoAuditLogParameterDTO auditLogParameterDTO
    ) {
        return branchItemLocationMapAuditLogServiceExtended.getBranchItemLocationMapAuditLog(auditLogParameterDTO);
    }
}
