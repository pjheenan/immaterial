package com.philheenan.immaterial.remote;

/**
 * @author Phil Heenan on 28/08/15.
 */
public interface ModelFactory<A, M> {

    M fromEntity(A entity);
}
