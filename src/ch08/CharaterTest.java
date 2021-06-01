package ch08;

public class CharaterTest {

    public static void main(String[] args){

        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);//(int) typeCast 강제형변환

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);//char이 캐릭터타입이기 때문에 이경우 casting이 크게 필요없다.

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);//char로 캐스팅하면 이숫자값에 맞는 ASKII코드를 내놓음.




    }
}
