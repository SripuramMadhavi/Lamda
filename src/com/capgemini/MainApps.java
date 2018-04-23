package com.capgemini;

import java.util.ArrayList;
import java.util.List;

/**
 * @author madhavs
 *
 */
public class MainApps {

  /**
   * @param args
   */
  public static void main(String[] args) {

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

    for (Person personn : personList) {
      System.out.println(personn.getName() + ":" + personn.getAge());
    }

    PersonMethods personMethods = new PersonMethods();
    personMethods.sortUsingComparator(personList);
    personMethods.sortUsingLambda(personList);
    personMethods.sortUsingStreamLambda(personList);

  }

}
