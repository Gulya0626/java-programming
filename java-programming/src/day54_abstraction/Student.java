package day54_abstraction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * -> We add abstract keyword to a class to make it an abstract class.
 * -> We can't create object of student class - meaning:
 * Student student = new Student(); will show ERROR
 * -> what we can do with this Student class? We can extend this class by sub classes
 * -> Student class will Parent class for all other types of student related classes
 */

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    /**
     * we can add abstract methods into abstract class.
     * abstract method -> is created using abstract keyword
     * and doesn't have the implementation/method body
     */

    public abstract void attendClass();

}
