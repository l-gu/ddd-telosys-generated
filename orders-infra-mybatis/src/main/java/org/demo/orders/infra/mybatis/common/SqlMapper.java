/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:12:15)
 */
package org.demo.orders.infra.mybatis.common;

import java.util.List;

import org.demo.orders.domain.common.AggregateRoot;

public interface SqlMapper<T extends AggregateRoot, ID> {

	/**
	 * Finds an entity for the given id
	 * @param id
	 * @return entity found or null
	 */
	T findById(ID id);

	/**
	 * Finds all existing entities with pagination and sorting
	 * @param offset
	 * @param limit
	 * @param sort
	 * @param order
	 * @return
	 */
	List<T> findAll(Integer offset, Integer limit, String sort, String order);

	/**
	 * Counts all existing entities 
	 * @return
	 */
	long count();

	/**
	 * Inserts the given entity in the database (SQL INSERT)
	 * @param entity
	 * @return number of inserted rows (0 or 1)
	 */
	int insert(T entity);

	/**
	 * Updates the given entity in the database if it exists (SQL UPDATE)
	 * @param entity
	 * @return number of updated rows (0 or 1)
	 */
	int update(T entity);

	/**
	 * Deletes the given entity in the database if it exists (SQL DELETE)
	 * @param entity
	 * @return number of deleted rows (0 or 1)
	 */
	int delete(T entity);

}