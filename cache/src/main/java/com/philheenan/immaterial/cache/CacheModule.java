package com.philheenan.immaterial.cache;

import com.philheenan.immaterial.cache.sample.SampleCache;
import com.philheenan.immaterial.conductor.facets.sample.SampleCacheFacet;

import dagger.Module;
import dagger.Provides;

/**
 * @author Phil Heenan on 07/08/15.
 */
@Module (
        complete = false,
        library = true
)
public class CacheModule {

    @Provides
    SampleCacheFacet provideSampleCache() {
        return new SampleCache();
    }
}
