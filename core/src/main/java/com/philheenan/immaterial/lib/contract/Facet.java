package com.philheenan.immaterial.lib.contract;

import rx.Observable;

/**
 * A facet is a class that will provide a self contained access point to a piece of functionality. Examples
 * of `facets` would be 'remote', 'cache', and 'logic'. A Facet will operate on a request/response model 
 * with the response passed through an {rx.Observable} implementation.
 * 
 * `I` is the input to the facet.
 * `O` being the class of object that will be published through the {rx.Observable} implementation.
 *
 * @author Phil Heenan on 06/08/15.
 */
public interface Facet<I,O> {

    Observable<O> process(I input);
    
}
