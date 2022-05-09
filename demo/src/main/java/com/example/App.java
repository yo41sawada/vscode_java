package com.example;

public class App {
    public static void main(String[] args) {
        var systemProp = new ShowSystemProperties();
        systemProp.show();
        systemProp.show("java.vm");
    }
}
