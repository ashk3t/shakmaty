package person;

import java.util.Objects;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name=name;
    }

    public Person (){
        this.name= "Unnamed";
    }

    public String getName() {
        return name;
    }


    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this==otherObject) return true;
        if (otherObject==null || getClass()!=otherObject.getClass() ) return false;
        Person other= (Person) otherObject;
        return (getName()).equals((other).getName());
    }

    @Override
    public String toString() {
        return getName() + "[name: " + getName() +"]";
    }
}
