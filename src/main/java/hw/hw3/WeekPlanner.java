package hw.hw3;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        Scanner input = new Scanner(System.in);

        schedule[0][0] = "Sunday";
        schedule[0][1] = "Dinner with Leila";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "department meeting";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do home work";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "do home work";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to courses";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "watch a film; go to gym";

        System.out.println("Please, input the day of the week:");
        String exit = "exit";


        while (true) {
            String inputLine = input.nextLine();

            if (inputLine.equals(exit)) {
                break;
            }

            switch (inputLine.toLowerCase()) {
                case "sunday":
                    System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }

        }
    }
}