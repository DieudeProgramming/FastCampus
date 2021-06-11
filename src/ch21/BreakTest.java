package ch21;

public class BreakTest {

    public static void main(String[] args){
        //어느 순간에 100이 넘느냐?
        int sum = 0;
        int num;
        /*for (num=1; sum<=100; num++){

            sum += num;
        }

        System.out.println(sum);
        System.out.println(num);
        //105,15가 나오는데 num이 ++ 되고 나서 체크함 (증감하고나서 조건체크나중에) sum이 100이 넘는 순간은 아마도 14였을거임*/

        for(num=1; ; num++){

            sum += num;
            if(sum >= 100){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
