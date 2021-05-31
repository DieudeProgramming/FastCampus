package ch06;

public class VariableTest {
    public static void main(String[] args){

        byte bnum = 127;

        System.out.println(bnum);

        //int num = 12345678900;
        long lNum = 12345678900L; //이 숫자 자체가 4바이트에 들어갈수 없으니까 8바이트 해라
        long lNum2 = 123456789; // 작은수에서 큰수로 바뀜, 4바이트짜리가 8바이트짜리 공간으로 가는것은 아무런 문제가 되지 않는다.
        //롱타입일때 숫자가 작으면 integer에서 long으로 자동 형변환이 이루어진다.

        System.out.println(lNum);
        System.out.println(lNum2);


    }
}
