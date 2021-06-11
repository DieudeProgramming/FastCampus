package ch19;

public class ForTest {

    public static void main(String[] args){

        int count = 1;
        int sum = 0;

        for(int i =0; i< 10; i++, count++){
            //i의 역할은 횟수 , 횟수를 체크하는 변수를 따로 둠
            //횟수에서 돌때는 for문을 가장 많이 쓴다 특히 배열과 같이 많이 사용 된다.

            sum += count;
        }

        System.out.println(sum);

        int num = 1;
        int total = 0;

        while(num <= 10){
            total += num;
            num++;
        }
        System.out.println(total);
    }

}
