package ch21;

public class ContinueTest {
    //1부터 100까지 숫자중에 3의 배수를 출력하세요
    public static void main(String[] args){

        int num;

        for(num = 1; num <= 100; num++){

            if( num%3 != 0 ) {
                continue;}
                System.out.println(num);


        }

    }
}
