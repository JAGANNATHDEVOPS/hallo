package com.sunknowledge.dme.rcm.service.impl.audittrail.queryhandler;

import com.sunknowledge.dme.rcm.repository.PatientClinicalInformationAuditLogRepositoryExtended;
import com.sunknowledge.dme.rcm.service.audittrail.queryhandler.PatientClinicalInfoAuditLogQueryHandler;
import com.sunknowledge.dme.rcm.service.dto.PatientClinicalInformationAuditLogDTO;
import com.sunknowledge.dme.rcm.service.dto.audittrail.query.PatientClinicalInfoAuditLogByPatientNoAndUserIdAndDateQuery;
import com.sunknowledge.dme.rcm.service.mapper.PatientClinicalInformationAuditLogMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class PatientClinicalInfoAuditLogQueryHandlerImpl implements PatientClinicalInfoAuditLogQueryHandler {

    @Autowired
    PatientClinicalInformationAuditLogRepositoryExtended patientClinicalInformationAuditLogRepositoryExtended;
    @Autowired
    PatientClinicalInformationAuditLogMapper patientClinicalInformationAuditLogMapper;

    @Override
    public Flux<PatientClinicalInformationAuditLogDTO> getPatientClinicalInfoAuditTrailInfoByQueryHandler(PatientClinicalInfoAuditLogByPatientNoAndUserIdAndDateQuery queryObj) {
        return patientClinicalInformationAuditLogRepositoryExtended.findAll()
            .map(patientClinicalInformationAuditLogMapper::toDto).filter(x -> {
                try {
                    return (queryObj.getPatientClinicalInfoIdList().contains(x.getPatntCliicalInfoationId())) && ((((JSONObject) new JSONParser()
                        .parse(x.getNewRowData()))
                        .get("created_by_id") == null ? "" : ((JSONObject) new JSONParser()
                        .parse(x.getNewRowData()))
                        .get("created_by_id").toString()).equals(String.valueOf(queryObj.getUserId())) ||
                        (((JSONObject) new JSONParser()
                            .parse(x.getNewRowData()))
                            .get("updated_by_id") == null ? "" : ((JSONObject) new JSONParser()
                            .parse(x.getNewRowData()))
                            .get("updated_by_id").toString()).equals(String.valueOf(queryObj.getUserId())) ||
                        (x.getDmlTimestamp().compareTo(queryObj.getFromDate()) >= 0 &&
                            x.getDmlTimestamp().compareTo(queryObj.getToDate()) <= 0) &&
                            !x.getDmlType().equals("DELETE"));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            });
    }
}
