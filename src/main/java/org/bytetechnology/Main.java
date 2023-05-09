package org.bytetechnology;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();
        System.out.println("HashSet Values Initially");
        mySet.add("Peter Mwaniki");
        mySet.add("Brian Waweru");
        mySet.add("Joshua Musyoka");
        System.out.println(mySet);
        System.out.println("HashSet values after adding some more values");
        mySet.add("Elias Njoka");
        mySet.add("Peter Mwaniki");
      //  mySet.remove("Brian Waweru");
        Iterator<String> myIterator = mySet.iterator();
        while (myIterator.hasNext()){
            String name = myIterator.next();
            System.out.println(name);
        }



     //   System.out.println(mySet.contains("elias njoka"));
        List<String> names = new ArrayList<String>();
        names.add("Peter mwaniki");
        names.add("Brian Waweru");
        names.add("Elias Njoka");
        names.add("Joshua Musyoka");
        names.add("Brian Waweru");
        names.add("Peter Mwaniki");
        Iterator itr = names.iterator();
        System.out.println("@@@@@@@@@@@@@@@@@LIst@@@@@@@@@@@@@@@@");
        while (itr.hasNext()){
            String name = (String) itr.next();
            System.out.println(name);
        }

        System.out.println("@@@@@@  MAPS @@@@@@@@@");
       Map<String, Student> studentMap = new HashMap<String, Student>();
       Student peter = new Student("eb3/4350/19", "Peter Mwaniki");
        Student brian = new Student("eb3/4352/19", "Brian Waweru");
        Student joshua = new Student("eb3/4353/19", "Joshua Musyoki");
        Student elias= new Student("eb3/4354/19", "Elias Njoka");
        studentMap.put(peter.getRegNo(), peter);
        studentMap.put(brian.getRegNo(), brian);
        studentMap.put(joshua.getRegNo(), joshua);
        studentMap.put(elias.getRegNo(), elias);
      // Map myStudents = new HashMap();


        System.out.println("Searching for a student with REGNO " + peter.getRegNo());
        Student student = studentMap.get(peter.getRegNo());
        if(student != null){
            System.out.println(student);
        } else {
            System.out.println("The student doesnt exist");
        }

        Student existing = studentMap.get("eb3/4372/19");
        if(existing != null ){
            System.out.println("Existing student is "+ existing);

        }else {
            System.out.println("Does not exists");
        }



    }
}