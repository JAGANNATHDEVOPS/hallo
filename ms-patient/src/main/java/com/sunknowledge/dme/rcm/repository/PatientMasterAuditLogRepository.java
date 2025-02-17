package com.sunknowledge.dme.rcm.repository;

import com.sunknowledge.dme.rcm.domain.PatientMasterAuditLog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Spring Data R2DBC repository for the PatientMasterAuditLog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PatientMasterAuditLogRepository
    extends ReactiveCrudRepository<PatientMasterAuditLog, Long>, PatientMasterAuditLogRepositoryInternal {
    Flux<PatientMasterAuditLog> findAllBy(Pageable pageable);

    @Override
    <S extends PatientMasterAuditLog> Mono<S> save(S entity);

    @Override
    Flux<PatientMasterAuditLog> findAll();

    @Override
    Mono<PatientMasterAuditLog> findById(Long id);

    @Override
    Mono<Void> deleteById(Long id);
}

interface PatientMasterAuditLogRepositoryInternal {
    <S extends PatientMasterAuditLog> Mono<S> save(S entity);

    Flux<PatientMasterAuditLog> findAllBy(Pageable pageable);

    Flux<PatientMasterAuditLog> findAll();

    Mono<PatientMasterAuditLog> findById(Long id);
    // this is not supported at the moment because of https://github.com/jhipster/generator-jhipster/issues/18269
    // Flux<PatientMasterAuditLog> findAllBy(Pageable pageable, Criteria criteria);

}
