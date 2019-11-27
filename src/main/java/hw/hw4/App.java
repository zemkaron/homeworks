package hw.hw4;

public class App {
    public static void main(String[] args) {

        Human father = new Human("Javid", "Mammadov", 1966);
        Human mother = new Human("Leyla", "Mammadova", 1972);
        Pet pet = new Pet("cat", "Zara", 1, 70, new String[]{"eat", "drink", "sleep"});
        Human child = new Human("Orkhan", "Mammadov", 1998, 70, pet, mother, father, new String[][]{{"Sunday", "go to gym"}, {"Monday", "do homeworks"}});

        Human human = new Human(); // for using empty constructor
        Human human1 = new Human("Arif", "Karimov",1997,mother,father); //just for using last constructor

        System.out.println(child.toString());
        System.out.println(pet.toString());
        child.describePet();
        child.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();


    }
}
