package com.example.dhaka_metro_rail;

import android.content.Context;

import java.util.Set;

/**
 * controller class for metro
 */
public class MetroExtractor {

    /**
     * Reads a text file from the raw resources folder and extracts unique lines into a set of strings.
     *
     * @param context    The context of the application.
     * @param resourceId The resource ID of the text file in the raw resources folder.
     * @return A set containing unique lines from the text file.
     */

    Metro metro = new Metro();
    public Set<String> getMetros(Context context,int resourceId){
        return metro.getMetros(context,resourceId);
    }
}
