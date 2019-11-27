package ca.philippeduval.hello_intellij;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.format("%s %n", "hello world");


        System.getProperties().entrySet().stream().forEach(entry -> {
            System.out.format("-%30s %s %n", entry.getKey(), entry.getValue());
        });

//        System.getProperty("java.version")

    }
}
