package com.example.dhaka_metro_rail;

import android.content.res.Resources;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class is for accessing all the stations and metro information from the existing text files by calling respective methods.
 */
public class StationExtractor {
    private Resources resources;

    /**
     * Constructor for StationExtractor class.
     *
     * @param resources The Resources object used to access app resources.
     */
    public StationExtractor(Resources resources) {
        this.resources = resources;
    }

    /**
     * Retrieve a set of all the stations from the text file.
     *
     * @return A set containing the names of all stations.
     */
    public Set<String> getStations(){
        Set<String> stations = new HashSet<>();
        InputStream inputStream = resources.openRawResource(R.raw.stations);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            String cur = "";
            String token = scanner.next(); // Tokenizing by words
            for(int i = 0;i < token.length();i++){
                if(token.charAt(i) == '-'){
                    stations.add(cur);
                    cur = "";
                }
                else
                    cur += token.charAt(i);
            }
            stations.add(cur);
        }
        scanner.close();
        return  stations;
    }

    /**
     * Retrieve a set of all the metro information from the text file.
     *
     * @return A set containing the metro information.
     */
    public Set<String> getMetro(){
        Set<String> metro = new HashSet<>();
        InputStream inputStream = resources.openRawResource(R.raw.metro);
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            String token = scanner.next();
            if(!token.isEmpty()){
                metro.add(token);
            }
        }
        scanner.close();
        return metro;
    }
}
