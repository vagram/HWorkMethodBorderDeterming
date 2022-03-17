import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        borderDetermining();
    }
    public static void borderDetermining(){
        int number = new Scanner(System.in).nextInt();
        if (number <= 5){
            System.out.println("false");
        }else System.out.println("true");
    }
}
