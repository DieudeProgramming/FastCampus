package ch12;

public class ShortCircuit {

    public static void main(String[] args){

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);//i값 안 변함 이 이유는 앞의 항이 이미 false이기 때문에 뒤의 항을 볼 필요가 없다.

        value = ((num1 = num1 + 10) < 10) || (( i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);


    }
}
