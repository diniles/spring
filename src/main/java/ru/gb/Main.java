package ru.gb;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> helloween = new ArrayList<>();
        helloween.add(new Person("Daniel", "Löble", 1973));
        helloween.add(new Person("Sascha", "Gerstner", 1977));
        helloween.add(new Person("Andi", "Deris", 1964));
        helloween.add(new Person("Michael", "Kiske", 1968));
        helloween.add(new Person("Kai", "Hansen", 1963));
        helloween.add(new Person("Markus", "Grosskopf", 1965));
        helloween.add(new Person("Michael", "Weikath", 1962));

        Gson gson = new Gson();
        String pureJson = gson.toJson(helloween);

        System.out.println(prettyPrintUsingGson(pureJson));
    }

    public static String prettyPrintUsingGson(String pureJson) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonElement = JsonParser.parseString(pureJson);
        return gson.toJson(jsonElement);
    }
}