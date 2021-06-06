package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        //비교대상 ; month
        int day;
        switch(month){
            //같은 케이스인 경우 옆으로 같이 쓰면 된다.
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
                //break를 반드시 써야한다 그렇지 않으면 맞아서 이 조건에 걸려들어도 다음 조건으로에 있는 브레이크를 찾아서 멈춤
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;


            default:
                System.out.println("존재하지 않는 달 입니다");
                day = -1;

        }

        System.out.println(month + "월은" + day + "일 입니다.");
    }
}
