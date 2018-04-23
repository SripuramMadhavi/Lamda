package com.capgemini;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.builder.CompareToBuilder;

import com.api.PersonApi;

/**
 * @author madhavs
 *
 */
public class PersonMethods implements PersonApi {

  /**
   * This method is used to sort a list of persons using Comparator
   *
   * @param personList
   */
  @Override
  public void sortUsingComparator(List<Person> personList) {

    Collections.sort(personList, new Comparator<Person>() {

      @Override
      public int compare(Person p1, Person p2) {

        return new CompareToBuilder().append(p2.getName(), p1.getName()).append(p2.getAge(), p1.getAge()).build();

      }

    });

    System.out.println("After sorting (Comparator)");

    for (Person person5 : personList) {

      System.out.println(person5);
    }

  }

  /**
   * This method is used to sort a list of persons using Lamda expressions
   *
   * @param personList
   */
  @Override
  public void sortUsingLambda(List<Person> personList) {

    Collections.sort(personList, (Person p1, Person p2) -> {

      return new CompareToBuilder().append(p2.getName(), p1.getName()).append(p2.getAge(), p1.getAge()).build();

    });

    System.out.println("After sorting (Lambda)");

    for (Person person5 : personList) {

      System.out.println(person5);
    }

  }

  /**
   * This method is used to sort a list of persons using Streams
   *
   * @param personList
   */
  @Override
  public void sortUsingStreamLambda(List<Person> personList) {

    personList.stream().sorted((Person p1, Person p2) -> {

      return new CompareToBuilder().append(p2.getName(), p1.getName()).append(p2.getAge(), p1.getAge()).build();

    }).collect(Collectors.toList());

    System.out.println("After sorting (Stream)");

    for (Person person5 : personList) {

      System.out.println(person5);
    }

  }
}