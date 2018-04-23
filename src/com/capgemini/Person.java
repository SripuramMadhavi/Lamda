package com.capgemini;

/**
 * @author madhavs
 *
 */
public class Person {

  private String name;

  private Integer age;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return age
   */
  public Integer getAge() {

    return this.age;
  }

  /**
   * @param age new value of {@link #getage}.
   */
  public void setAge(Integer age) {

    this.age = age;
  }

  /**
   * The constructor.
   *
   * @param name
   * @param age
   */
  public Person(String name, Integer age) {
    super();
    this.name = name;
    this.age = age;
  }

  /**
   * The constructor.
   */
  public Person() {
    super();
  }

  @Override
  public String toString() {

    return "Person [name=" + this.name + ", age=" + this.age + "]";
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.age == null) ? 0 : this.age.hashCode());
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (this.age == null) {
      if (other.age != null)
        return false;
    } else if (!this.age.equals(other.age))
      return false;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    return true;
  }

}
