package com.company;

import com.company.Classes.Person;
import com.company.Classes.Room;
import com.company.Classes.Subject;

public class Main {

    public static void main(String[] args)
    {
	    // write your code here
        // 1.	Write a program to create a Person object, with the following attributes: name as string, surname as string, age as int,
        // identity number as long, type as string. Define a constructor for this class as well as accessors and mutators for all the attributes.
        // Create two objects of type Person and display the information for them on separate lines.

        Person a = new Person();
        a.setName("Dumitrescu");
        a.setSurname("Alina");
        a.setAge(20);
        a.setIdentity_number(382216);
        a.setType("unemployed");

        Person b = new Person("Dumitrescu", "Marinela", 25, 382222, "employed");

        System.out.println("Name:" + a.getName());
        System.out.println("Surname:" + a.getSurname());
        System.out.println("Age:" + a.getAge());
        System.out.println("Identity number:" + a.getIdentity_number());
        System.out.println("Type:" + a.getType());

        System.out.println();

        System.out.println("Name:" + b.getName());
        System.out.println("Surname:" + b.getSurname());
        System.out.println("Age:" + b.getAge());
        System.out.println("Identity number:" + b.getIdentity_number());
        System.out.println("Type:" + b.getType());

        System.out.println();
        System.out.println();
        //2.	Write a program to create a Room object, the attributes of this object are room number, room type and room floor.
        // Define a constructor for this class as well as accessors and mutators for all the attributes.
        // Create two objects of type and display the information for them on separate lines.


        Room c = new Room();
        c.setNumber(127);
        c.setType("Double-room");
        c.setFloor(1);

        Room d = new Room(523, "Triple-room", 5);

        System.out.println("Room number:" + c.getNumber());
        System.out.println("Room type:" + c.getType());
        System.out.println("Room floor:" + c.getFloor());

        System.out.println();

        System.out.println("Room number:" + d.getNumber());
        System.out.println("Room type:" + d.getType());
        System.out.println("Room floor:" + d.getFloor());

        //3.	Write a program to create an object Subject with the following attributes: room as Room, noOfStudents as integer,
        // teacher as Person. Define a constructor for this class as well as accessors and mutators for all the attributes.
        // Create two objects of type Subject and display the information for them on separate lines.

        Subject e = new Subject();

        e.setRoom(c);       //room C previously defined
        e.setNoOfStudents(25);
        e.setTeacher(a);    //room A previously defined

        Subject f = new Subject(d, 30, b);

        System.out.println("Subject room:");
        System.out.println("    Room number:" + e.getRoom().getNumber());
        System.out.println("    Room type:" + e.getRoom().getType());
        System.out.println("    Room floor:" + e.getRoom().getFloor());
        System.out.println("Number of students" + e.getNoOfStudents());
        System.out.println("Subject teacher:");
        System.out.println("    Name:" + e.getTeacher().getName());
        System.out.println("    Surname:" + e.getTeacher().getSurname());
        System.out.println("    Age:" + e.getTeacher().getAge());
        System.out.println("    Identity number:" + e.getTeacher().getIdentity_number());
        System.out.println("    Type:" + e.getTeacher().getType());

        System.out.println();
        System.out.println("Subject room:");
        System.out.println("    Room number:" + f.getRoom().getNumber());
        System.out.println("    Room type:" + f.getRoom().getType());
        System.out.println("    Room floor:" + f.getRoom().getFloor());
        System.out.println("Number of students" + f.getNoOfStudents());
        System.out.println("Subject teacher:");
        System.out.println("    Name:" + f.getTeacher().getName());
        System.out.println("    Surname:" + f.getTeacher().getSurname());
        System.out.println("    Age:" + f.getTeacher().getAge());
        System.out.println("    Identity number:" + f.getTeacher().getIdentity_number());
        System.out.println("    Type:" + f.getTeacher().getType());
    }
}
