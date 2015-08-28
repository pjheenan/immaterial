package com.philheenan.immaterial.remote.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author Phil Heenan on 28/08/15.
 */
public class SampleEntity {

    @SerializedName("sample_name")
    public String name;

    @SerializedName("version")
    public int version;
}
