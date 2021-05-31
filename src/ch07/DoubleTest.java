package ch07;

public class DoubleTest {
    public static void main(String[] args){

        double dnum = 3.14;
        //정수의 숫자들 실수의 숫자들이 컴퓨터내에서 지정된 타입으로 저장이된다. 이 숫자들은 어딘가에 저장이되어있다.
        //정수는 integer 4바이트 그범위가 넘어가면 L이라는 식별자를 붙여야한다.
        //리터럴들은 기본적으로 double(8바이트)
        float fnum = 3.14f;//float는 4바이트 밖에 안됨. 3.14가 8바이트로 이미 잡혀있는 애들을 복사 해온것이라서 집어넣기엔 너무 큼
        //그래서 뒤에다 f: float타입으로 핸들링해라 라는 의미.

        System.out.println(dnum);
        System.out.println(fnum);
    }
}
