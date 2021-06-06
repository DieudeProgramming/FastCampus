package ch13;

import java.util.Scanner;//import는 Scanner가 이 라이브러리에 있는 놈이다를 알려주는 키워드.

public class ConditionTest {

    public static void main(String[] args){
        //자바의입출력 = 자바 아이오 , 아이오스트림사용
        //입력받기 위해서 간단하게 쓸수있는 방법

        int max;
        System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");

        Scanner scanner = new Scanner(System.in);//System.in ; 표준 입력
        System.out.println("입력1:");
        int num1 = scanner.nextInt();
        System.out.println("입력2:");
        int num2 = scanner.nextInt();

        max = (num1 > num2)? num1 : num2;
        System.out.println(max);


    }
}
