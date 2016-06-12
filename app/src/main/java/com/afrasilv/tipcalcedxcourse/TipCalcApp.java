package com.afrasilv.tipcalcedxcourse;

import android.app.Application;

/**
 * Created by alex on 12/06/16.
 */
public class TipCalcApp extends Application{
    private final static  String ABOUT_URL = "https://github.com/afrasilv";

    public String getAboutUrl(){
        return ABOUT_URL;
    }

}
