package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("grade");
        String grade = scanner.next();

        switch(grade){
            case "First":
                System.out.println("It's Gold !");
                break;
            case "Second":
                System.out.println("It's Sivler !");
                break;
            case "Thrid":
                System.out.println("It's Bronze");
                break;
            default:
                System.out.println("Sorry, There is not medal");
                break;
        }

    }
}
