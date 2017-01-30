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


        System.out.println("Введите ФИО (например Иванов И.И.):");
        init();
        String name = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            name = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        if(book.containsKey(name)){

            int i=1;
            for (String str : book.get(name)){
                System.out.println(i+ ". " + str);
                i++;
            }

        } else
            System.out.println("такого ФИО в БД нет");
    }

    public static void init(){

        ivanov.add("+8 800 2000 500");
        ivanov.add("+8 800 200 600");
        petrov.add("+8 800 2000 700");
        sidorov.add("+8 800 2000 800");
        sidorov.add("+8 800 2000 900");
        sidorov.add("+8 800 2000 000");

        book.put("Иванов И.И.", ivanov);
        book.put("Петров П.П.", petrov);
        book.put("Сидоров С.С.", sidorov);
    }
}