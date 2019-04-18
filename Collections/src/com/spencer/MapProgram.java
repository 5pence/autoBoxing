package com.spencer;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high-level, object-oriented, platform independent language");
        languages.put("Python", "an interrupted, object-oriented, high-level programming language with dynamic " +
                "semantics");
        languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");
        languages.put("PHP", "A sad excuse for a language");

        System.out.println(languages.get("Java"));

        System.out.println("======================================================================");

        System.out.println(languages.replace("Lisp", "quite crazy stuff"));
        System.out.println(languages.replace("Scala", "not added"));

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
