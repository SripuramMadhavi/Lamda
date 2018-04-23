package com.api;

import java.util.List;

import com.capgemini.Person;

/**
 * @author madhavs
 *
 */
public interface PersonApi {

  public void sortUsingStreamLambda(List<Person> personList);

  public void sortUsingLambda(List<Person> personList);

  public void sortUsingComparator(List<Person> personList);

}
