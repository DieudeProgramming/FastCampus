package ch10;

public class ConstantTest {

    public static void main(String[] args){
        //상수는 사용하기전 무조건 값을 지정해주어야 한다.
        final int MAX_NUM = 100;
        final int MIN_NUM;
        MIN_NUM = 0;

        //MAX_NUM = 20; 이미 얘는 상수로 초기화 됬기 때문에 바꿀수 없다. 오류남

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

    }
}
