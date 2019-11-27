package hw.hw4;

public class Human {
    String name;
    String surname;
    int dateOfBirth;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

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
        System.out.println("Hello," + pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel > 50) {
            System.out.printf("I have a %s, he is %d years old, he is very sly.\n", pet.species, pet.age);
        }
        if (pet.trickLevel < 50) {
            System.out.printf("I have a %s, he is %d years old, he is almost not sly.\n", pet.species, pet.age);
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
}
