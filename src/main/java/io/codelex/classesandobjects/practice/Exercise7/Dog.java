package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private String name;
    private String sex;
    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public Dog getMother() {
        return mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    public Dog getFather() {
        return father;
    }

    public void fathersName() {
        if (father == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(father.getName());
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother == null || otherDog.mother == null) {
            return false;
        }
        return this.mother.equals(otherDog.mother);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
