package hw.hw5;

public class App {
    public static void main(String[] args) {

        Human father = new Human("Javid", "Mammadov", 1966);
        Human mother = new Human("Leyla", "Mammadova", 1972);
        Pet pet = new Pet("cat", "Zara", 1, 70, new String[]{"eat", "drink", "sleep"});
        Human child = new Human("Orkhan", "Mammadov", 1998, 70, pet, mother, father, new String[][]{{"Sunday", "go to gym"}, {"Monday", "do homeworks"}});


    }
}
