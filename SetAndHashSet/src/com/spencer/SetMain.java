package com.spencer;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares.");
        System.out.println("There are " + cubes.size() + " cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("There are " + union.size() + " union of squares and cubes.");

        System.out.println(union);
        List<Integer> unionList = new ArrayList<>(union);
        Collections.sort(unionList);
        System.out.println(unionList);

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("There are " + intersection.size() + " elements in the intersection.");
        System.out.println(intersection);
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }


    }
}
