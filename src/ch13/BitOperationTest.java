package ch13;

public class BitOperationTest {

    public static void main(String[] args){

        int num1 = 5;
        int num2 = 10;

        System.out.println( num1 | num2 );
        System.out.println( num1 & num2 );
        System.out.println( num1 ^ num2 );
        System.out.println( ~num1 );

        System.out.println( num1 << 2 );//num1을 들고와서 복사해서 비트를 옮김 값을 바꾸려면 대입연산자를 써야한다.
        System.out.println( num1 <<= 2);
        System.out.println( num1 >> 1);


    }
}
