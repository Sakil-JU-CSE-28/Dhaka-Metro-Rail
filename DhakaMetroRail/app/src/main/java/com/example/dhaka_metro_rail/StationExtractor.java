package com.example.dhaka_metro_rail;

import android.content.res.Resources;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This class is for accessing all the stations from the
 * existing text file by calling a method
 */
public class StationExtractor {
    private Resources resources;

    public StationExtractor(Resources resources) {
        this.resources = resources;
    }

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
        return  stations;
    }
}
