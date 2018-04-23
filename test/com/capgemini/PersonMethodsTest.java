package com.capgemini;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author madhavs
 *
 */
public class PersonMethodsTest {

  @Test
  public void comparatorTest() {

    PersonMethods methods = new PersonMethods();

    Person person = new Person();
    person.setAge(34);
    person.setName("deepa");

    Person person2 = new Person();
    person2.setName("sushmitha");
    person2.setAge(24);

    Person person3 = new Person();
    person3.setName("lakshmi");
    person3.setAge(22);

    Person person4 = new Person();
    person4.setName("pooja");
    person4.setAge(20);
    List<Person> personList = new ArrayList<>();

    personList.add(person);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);

    methods.sortUsingComparator(personList);

    assertEquals(personList.get(0), person2);
    assertEquals(personList.get(1), person4);
    assertEquals(personList.get(2), person3);
    assertEquals(personList.get(3), person);
  }

  @Test
  public void lamdaTest() {

    PersonMethods methods = new PersonMethods();

    Person person = new Person();
    person.setAge(34);
    person.setName("deepa");

    Person person2 = new Person();
    person2.setName("sushmitha");
    person2.setAge(24);

    Person person3 = new Person();
    person3.setName("lakshmi");
    person3.setAge(22);

    Person person4 = new Person();
    person4.setName("pooja");
    person4.setAge(20);
    List<Person> personList = new ArrayList<>();

    personList.add(person);
    personList.add(person2);
    personList.add(person3);
    personList.add(person4);

    methods.sortUsingLambda(personList);

    assertEquals(personList.get(0), person2);
    assertEquals(personList.get(1), person4);
    assertEquals(personList.get(2), person3);
    assertEquals(personList.get(3), person);

  }

}
