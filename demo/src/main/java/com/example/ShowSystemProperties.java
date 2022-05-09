package com.example;

public class ShowSystemProperties {
    public void show() {
        System.getProperties().list(System.out);
    }

    public void show(String startsWithStr) {
        System.getProperties().entrySet().stream()
                .filter(e -> ((String) e.getKey()).startsWith(startsWithStr))
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}
