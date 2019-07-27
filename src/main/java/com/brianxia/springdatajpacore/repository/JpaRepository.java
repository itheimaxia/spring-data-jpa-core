package com.brianxia.springdatajpacore.repository;

import java.io.Serializable;

public interface JpaRepository<T, ID extends Serializable> extends Repository{
    /**
     * Retrieves an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return the entity with the given id or {@literal null} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}
     */
    T findOne(ID id);
}
