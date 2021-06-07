package ch17;

public class WhileTest {

    public static void main(String[] args){
        /*블록 안에 있는것들은 지역변수. 지역변수 같은것들은 자동화로 초기되지않는다.
        * 그러므로 지역변수는 반드시 대부분 초기화를 해주어야 한다.*/
        int num = 1;
        int sum = 0;

        while(num <= 10) {
            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);//loop을 빠져나왔을때 num의값 이렇게 우리가 반복적인 문장을 쓸때 반복문을 쓴다.
    }
}
