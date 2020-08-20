package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author wyq
 * @create 2020-08-19-16:15
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
