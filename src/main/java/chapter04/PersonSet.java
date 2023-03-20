package chapter04;

import java.util.HashSet;
import java.util.Set;

import annotation.ThreadSafe;

@ThreadSafe
public class PersonSet {

    private final Set<Person> mySet = new HashSet<Person>();

    public synchronized void addPerson(Person p) {
        mySet.add(p);
    }

    public synchronized boolean containsPerson(Person p) {
        return mySet.contains(p);
    }

    private class Person {}
}
