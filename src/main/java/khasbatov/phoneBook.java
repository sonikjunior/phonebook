package khasbatov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneBook {

    Map<String,String> book = new HashMap<>();
    List<String> numbers = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String name = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
