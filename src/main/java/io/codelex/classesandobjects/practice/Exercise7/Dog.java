package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;


    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public void fathersName() {
        if (father == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(father);
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
