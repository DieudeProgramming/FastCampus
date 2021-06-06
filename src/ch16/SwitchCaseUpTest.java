package ch16;

import java.util.Scanner;

public class SwitchCaseUpTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("month");
        int month = scanner.nextInt();

        // 리턴값을 반환 받을수 있다.
        int day = switch(month) {
            case 1,3,5,7,8,10,12 -> {
                System.out.println("한 달은 31 입니다");
                yield 31;//return of switch-case : day에다가 yield(수행과 반환을 같이할때) 값을 준다.
            }

            case 4,6,9,11 -> {
                System.out.println("한 달은 30 입니다");
                yield 30;
            }

            case 2 -> {
                System.out.println("한 달은 28 입니다");
                yield 28;
            }
            default ->{
                System.out.println("존재하지 않는 달입니다");
                yield -1;

            }
        };// day가 값을 받기 때문에 문장의 끝이 여기다 라는 뜻인 세미콜론을 붙여 줘야함.
    }
}
