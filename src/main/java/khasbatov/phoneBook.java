package khasbatov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneBook {

    static Map<String, List<String>> book = new HashMap<>();

    static List<String> ivanov = new ArrayList<>();
    static List<String> petrov = new ArrayList<>();
    static List<String> sidorov = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String name = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void init(){

        ivanov.add("+8 800 2000 500");
        ivanov.add("+8 800 200 600");
        petrov.add("+8 800 2000 700");
        sidorov.add("+8 800 2000 800");
        sidorov.add("+8 800 2000 900");
        sidorov.add("+8 800 2000 000");

        book.put("Иванов", ivanov);
        book.put("Петров", petrov);
        book.put("Сидоров", sidorov);
    }

}
