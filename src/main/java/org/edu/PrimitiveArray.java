package org.edu;

import java.util.*;
import java.util.stream.Collectors;

public class PrimitiveArray {
    public static void main(String[] args) {
        new PrimitiveArray();
    }

    PrimitiveArray() {
        // prymitive numbers array, can't have null, more efficient
        int[] arrprym = {3, -100, 0};
        Arrays.sort(arrprym);

        // prymitive numbers array, can't have null, more efficient
        short[] arrprym2 = new short[5];
        arrprym2[0] = 4;
        arrprym2[1] = 8;

        // object type (wrapper) array, can have null, can be used in List
        // etc. Integer, String, Byte, Float, Double
        Character[] arrObj = new Character[]{'ś', null, 'ż'};
        arrObj[1] = 'a';
        Arrays.sort(arrObj); //  arrObj[0] -> 'a'

        // extending array
        float[] original = {1.1f, 1.2f, 1.3f};
        float[] extended = new float[5];
        System.arraycopy(original, 0, extended, 0, original.length);
        // extended -> {1.1f, 1.2f, 1.3f, null, null};

        // two-dimensional array
        byte[][] matrix = {
            {'a', 'b', 'c'},
            {'m', 'n', 'o'},
            {'x', 'y', 'z'}
        };
        System.out.println(matrix[1][2]); // o
        for (byte[] arr : matrix)
            for (byte a : arr) System.out.println(a + " ");

        // convert int[] to List<Integer>
        int[] arrPrymInt = {-100, 0, 200};
        List<Integer> lista = Arrays.stream(arrPrymInt)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        lista.stream().forEach(System.out::println);
    }


}

/*
TODO:
class Car {

	String color;
	String make; //manufacturer
	Model model;
	List<String> additionalEquipment;

}

	Collection<Car> cars = new ArrayList<>(); // 10_000 cars

1. Print all unique colors of the cars, except Nissans, sorted alphabetically

    	cars.stream()
    	.filter(n -> !n.make.equals("Nissan") // stream of cars
    	.map(car -> car.color) // stream of car colors
    	.sorted()
    	.foreach(c -> System.out.println(c))



*/

