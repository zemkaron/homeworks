package hw.hw2;

public class AreaShooting {
    public static void main(String[] args) {
        System.out.println("All set. Get ready to rumble!");
        char [][] a = new char[6][6];

        for (int i = 0; i < a.length-1 ; i++ ){
                for (int j = 0; j < a.length-1; j++ ){
                    System.out.print("-");
                }
            System.out.println();
        }
    }
}
