package datastructure.hash;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == this){
            return  true;
        }
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Person person = (Person)obj;

        return (person.name.equals(this.name) && person.age == this.age);

    }
}
