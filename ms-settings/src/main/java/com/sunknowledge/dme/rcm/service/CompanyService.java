package com.sunknowledge.dme.rcm.service;

import com.sunknowledge.dme.rcm.service.dto.CompanyDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.sunknowledge.dme.rcm.domain.Company}.
 */
public interface CompanyService {
    /**
     * Save a company.
     *
     * @param companyDTO the entity to save.
     * @return the persisted entity.
     */
    CompanyDTO save(CompanyDTO companyDTO);

    /**
     * Updates a company.
     *
     * @param companyDTO the entity to update.
     * @return the persisted entity.
     */
    CompanyDTO update(CompanyDTO companyDTO);

    /**
     * Partially updates a company.
     *
     * @param companyDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<CompanyDTO> partialUpdate(CompanyDTO companyDTO);

    /**
     * Get all the companies.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<CompanyDTO> findAll(Pageable pageable);

    /**
     * Get the "id" company.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CompanyDTO> findOne(Long id);

    /**
     * Delete the "id" company.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
