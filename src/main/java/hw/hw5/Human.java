package hw.hw5;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }


    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public void describePet() {
        if (pet.getTrickLevel() > 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly.\n", pet.getSpecies(), pet.getAge());
        }
        if (pet.getTrickLevel() < 50) {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly.\n", pet.getSpecies(), pet.getAge());
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iq +
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth &&
                iq == human.iq &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(pet, human.pet) &&
                Objects.equals(mother, human.mother) &&
                Objects.equals(father, human.father) &&
                Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, dateOfBirth, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
