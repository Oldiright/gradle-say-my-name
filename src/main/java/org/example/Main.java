package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.dto.User;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        User user = new User("Dmytro", "Oliinyk");
        System.out.println(gson.toJson(user));

    }
}