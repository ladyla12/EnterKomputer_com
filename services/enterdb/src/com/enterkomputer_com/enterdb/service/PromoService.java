/*Copyright (c) 2019-2020 deltadatamandiri.com All Rights Reserved.
 This software is the confidential and proprietary information of deltadatamandiri.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with deltadatamandiri.com*/
package com.enterkomputer_com.enterdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.DataExportOptions;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.enterkomputer_com.enterdb.Promo;

/**
 * Service object for domain model class {@link Promo}.
 */
public interface PromoService {

    /**
     * Creates a new Promo. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Promo if any.
     *
     * @param promo Details of the Promo to be created; value cannot be null.
     * @return The newly created Promo.
     */
    Promo create(@Valid Promo promo);


	/**
     * Returns Promo by given id if exists.
     *
     * @param promoId The id of the Promo to get; value cannot be null.
     * @return Promo associated with the given promoId.
	 * @throws EntityNotFoundException If no Promo is found.
     */
    Promo getById(Integer promoId);

    /**
     * Find and return the Promo by given id if exists, returns null otherwise.
     *
     * @param promoId The id of the Promo to get; value cannot be null.
     * @return Promo associated with the given promoId.
     */
    Promo findById(Integer promoId);

	/**
     * Find and return the list of Promos by given id's.
     *
     * If orderedReturn true, the return List is ordered and positional relative to the incoming ids.
     *
     * In case of unknown entities:
     *
     * If enabled, A null is inserted into the List at the proper position(s).
     * If disabled, the nulls are not put into the return List.
     *
     * @param promoIds The id's of the Promo to get; value cannot be null.
     * @param orderedReturn Should the return List be ordered and positional in relation to the incoming ids?
     * @return Promos associated with the given promoIds.
     */
    List<Promo> findByMultipleIds(List<Integer> promoIds, boolean orderedReturn);


    /**
     * Updates the details of an existing Promo. It replaces all fields of the existing Promo with the given promo.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Promo if any.
     *
     * @param promo The details of the Promo to be updated; value cannot be null.
     * @return The updated Promo.
     * @throws EntityNotFoundException if no Promo is found with given input.
     */
    Promo update(@Valid Promo promo);


    /**
     * Partially updates the details of an existing Promo. It updates only the
     * fields of the existing Promo which are passed in the promoPatch.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Promo if any.
     *
     * @param promoId The id of the Promo to be deleted; value cannot be null.
     * @param promoPatch The partial data of Promo which is supposed to be updated; value cannot be null.
     * @return The updated Promo.
     * @throws EntityNotFoundException if no Promo is found with given input.
     */
    Promo partialUpdate(Integer promoId, Map<String, Object> promoPatch);

    /**
     * Deletes an existing Promo with the given id.
     *
     * @param promoId The id of the Promo to be deleted; value cannot be null.
     * @return The deleted Promo.
     * @throws EntityNotFoundException if no Promo found with the given id.
     */
    Promo delete(Integer promoId);

    /**
     * Deletes an existing Promo with the given object.
     *
     * @param promo The instance of the Promo to be deleted; value cannot be null.
     */
    void delete(Promo promo);

    /**
     * Find all Promos matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
     *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
     *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Promos.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
     */
    @Deprecated
    Page<Promo> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
     * Find all Promos matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Promos.
     *
     * @see Pageable
     * @see Page
     */
    Page<Promo> findAll(String query, Pageable pageable);

    /**
     * Exports all Promos matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
     */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

    /**
     * Exports all Promos matching the given input query to the given exportType format.
     *
     * @param options The export options provided by the user; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @param outputStream The output stream of the file for the exported data to be written to.
     *
     * @see DataExportOptions
     * @see Pageable
     * @see OutputStream
     */
    void export(DataExportOptions options, Pageable pageable, OutputStream outputStream);

    /**
     * Retrieve the count of the Promos in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
     * @return The count of the Promo.
     */
    long count(String query);

    /**
     * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return Paginated data with included fields.
     *
     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
    Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}