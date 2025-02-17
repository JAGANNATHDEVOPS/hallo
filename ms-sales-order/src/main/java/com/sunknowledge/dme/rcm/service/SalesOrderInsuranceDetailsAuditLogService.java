package com.sunknowledge.dme.rcm.service;

import com.sunknowledge.dme.rcm.service.dto.SalesOrderInsuranceDetailsAuditLogDTO;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Service Interface for managing {@link com.sunknowledge.dme.rcm.domain.SalesOrderInsuranceDetailsAuditLog}.
 */
public interface SalesOrderInsuranceDetailsAuditLogService {
    /**
     * Save a salesOrderInsuranceDetailsAuditLog.
     *
     * @param salesOrderInsuranceDetailsAuditLogDTO the entity to save.
     * @return the persisted entity.
     */
    Mono<SalesOrderInsuranceDetailsAuditLogDTO> save(SalesOrderInsuranceDetailsAuditLogDTO salesOrderInsuranceDetailsAuditLogDTO);

    /**
     * Updates a salesOrderInsuranceDetailsAuditLog.
     *
     * @param salesOrderInsuranceDetailsAuditLogDTO the entity to update.
     * @return the persisted entity.
     */
    Mono<SalesOrderInsuranceDetailsAuditLogDTO> update(SalesOrderInsuranceDetailsAuditLogDTO salesOrderInsuranceDetailsAuditLogDTO);

    /**
     * Partially updates a salesOrderInsuranceDetailsAuditLog.
     *
     * @param salesOrderInsuranceDetailsAuditLogDTO the entity to update partially.
     * @return the persisted entity.
     */
    Mono<SalesOrderInsuranceDetailsAuditLogDTO> partialUpdate(SalesOrderInsuranceDetailsAuditLogDTO salesOrderInsuranceDetailsAuditLogDTO);

    /**
     * Get all the salesOrderInsuranceDetailsAuditLogs.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Flux<SalesOrderInsuranceDetailsAuditLogDTO> findAll(Pageable pageable);

    /**
     * Returns the number of salesOrderInsuranceDetailsAuditLogs available.
     * @return the number of entities in the database.
     *
     */
    Mono<Long> countAll();

    /**
     * Get the "id" salesOrderInsuranceDetailsAuditLog.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Mono<SalesOrderInsuranceDetailsAuditLogDTO> findOne(Long id);

    /**
     * Delete the "id" salesOrderInsuranceDetailsAuditLog.
     *
     * @param id the id of the entity.
     * @return a Mono to signal the deletion
     */
    Mono<Void> delete(Long id);
}
