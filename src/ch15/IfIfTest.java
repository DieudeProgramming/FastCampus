package ch15;

import java.util.Scanner;
//각각의 조건을 따로따로 비교할때.(각각의 상황)
public class IfIfTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입장객 나이");
        int age = scanner.nextInt();
        int charge;
        //ifif는 단독조건임. 얘인지 따로 체크 쟤인지 따로체크 서로의 배타적인 관계에 대한 로직이 성립 되지 않는다.
        if(age < 8){
            charge = 1000;
            System.out.println("미취학아동 입니다.");
        }
        if(age < 14){
            charge = 2000;
            System.out.println("초등학생 입니다");
        }
        if(age < 20){//나이가 12라면 여기서 한번 더 체크함. 그래서 얘도 프린트 함
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
