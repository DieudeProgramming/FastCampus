package ch11;

public class OperatorTest {

    public static void main(String[] args){

        int gameScore = 150;
        int lastScore = --gameScore; // gameScore += 1; gameScore = gameScore+1; 언제 더해지느냐의 문제
        System.out.println(lastScore);
        System.out.println(gameScore);

        int gameScore2 = 150;
        int lastScore2 = gameScore2--;
        System.out.println(lastScore2);
        System.out.println(gameScore2);
        // lastScoreé2에 gameScore2 가 들어간 다음에 gameScore2가 증가/감소.
        // 제어문과 함께 할때 이 연산자를 많이 쓴다.

    }
}
