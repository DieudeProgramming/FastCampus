package ch15;

import java.util.Scanner;

public class IfElseIfElseTest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입장객 나이");
        int age = scanner.nextInt();
        int charge;

        if(age < 8){
            charge = 1000;
            System.out.println("미취학아동 입니다.");
        }
        else if(age < 14){
            charge = 2000;
            System.out.println("초등학생 입니다");
        }
        else if(age < 20){
            charge = 2500;
            System.out.println("중,고등학생 입니다");
        }else{
            /*디폴트값 ; 위의 조건중 하나도 만족하는게 없으면 빠져나와서 실행함. 만약에 이게 없으면 밑에 입장료는 charge입니다에
            charge값이 비는 경우가 생기므로 오류뜸.*/

            charge = 3000;
            System.out.println("일반인 입니다");
        }
        System.out.println("입장료는"+charge+"입니다");

    }
}
