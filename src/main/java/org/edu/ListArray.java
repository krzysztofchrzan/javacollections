package org.edu;

import java.util.*;
import java.util.stream.Collectors;

public class ListArray {

        private void arrayListOperations() {

            // utworzenie listy z liczbami
            ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(33, -45, 105, -27, 0));

            //sortowanie
            Collections.sort(lista, Collections.reverseOrder());

            // create an array with Person objects and print with lambda
            Person[] arrp = new Person[4];
            arrp[0] = new Person("Youri", "Ribeiro", 25);
            arrp[1] = new Person("Marc", "Gual", 31);
            arrp[2] = new Person("Paweł", "Wszołek", 29);
            arrp[3] = new Person("Marcin", "Rosołek", 33);
            Arrays.stream(arrp).forEach(element -> {
                System.out.println(element.getAll());
            });


            // utworzenie listy z liczbami
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(33, -45, 105, -27, 0));

            // normal loop
            for (Integer i : list) System.out.println(i);

            // java 8 foreach
            list.forEach(System.out::println);

            // java 8 foreach with stream
            list.stream().forEach(System.out::println);

            // loop with stream with filter and sort
            list.stream()
                    .filter(n -> n > 0)
                    .sorted(Comparator.reverseOrder())
                    //.limit(1)
                    .forEach(System.out::println);

            // list Person class
            ArrayList<Person> persons = new ArrayList<>();
            persons.add(new Person("Jan", "Kowalski", 45));
            persons.add(new Person("Jan", "Mazur", 18));
            persons.add(new Person("Tadeusz", "Mazowiecki", 76));
            persons.add(new Person("Kamil", "Wojtasik", 51));

            // normal loop
            for (Person p : persons) System.out.println(p.getAge());

            // stream loop through objects with filter
            persons.stream()
                    .filter(s -> !s.getName().equals("Tadeusz"))
                    .sorted(Comparator.comparing(Person::getAll).reversed())
                    .forEach(p -> System.out.println(p.getSurname()));

            // collect by stream to new list with filtering
            ArrayList<Person> personsNew = (ArrayList<Person>) persons.stream()
                    .filter(p -> p.getName().equals("Jan"))
                    .collect(Collectors.toList());

            personsNew.stream().forEach(p -> System.out.println(p.getSurname()));


            // treeMap
            TreeMap<Integer, String> treeMap = new TreeMap<>();
            for (Person i : persons) treeMap.put(i.getAge(), i.getSurname());
            // hashmap keySet loop :
            for (Integer k : treeMap.keySet()) System.out.println(k + " " + treeMap.get(k));
            // hashmap entrySet loop :
            for (Map.Entry<Integer, String> map : treeMap.entrySet())
                System.out.println(map.getKey() + " " + map.getValue());
            // hashmap lambda loop:
            treeMap.forEach(
                    (k, v) -> System.out.println(k + " " + v)
            );
            // hashmap stream loop:
            treeMap.descendingMap().entrySet().stream()
                    .limit(3)
                    .forEach(element -> {
                                System.out.println(element.getKey() + " " + element.getValue());
                                System.out.println("Hello");
                            }
                    );


// adding data to Datatable and print
//   	 List<Map<String,String>> lista = datatable.asMaps(String.class,String.class);
//   	 lista.forEach(map ->
//       		 map.forEach((k, v) -> System.out.println((k + ":" + v)))
//   	 );
        }


    }