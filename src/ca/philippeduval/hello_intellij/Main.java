package ca.philippeduval.hello_intellij;

import java.io.PrintStream;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.format("%s %n", "hello world #2");


        System.getProperties().entrySet().stream().forEach(consumeEntry);

//        System.getProperty("java.version")

    }

    static Consumer<Map.Entry> consumeEntry = entry ->
            System.out.format("-%30s %s %n", entry.getKey(), entry.getValue());

}
