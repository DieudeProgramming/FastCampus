package ch10;

public class TypeConversionTest {
    public static void main(String[] args){

        /*int iNum = 255;
        byte bNum = (byte)iNum;

        System.out.println(bNum);
        //한바이트로 다 표현될수 없는 레인지값 강제 캐스팅해서 들어간 경우라 값이 변경되 나온다 = 자료에 문제가 생긴다.

        double dNum = 3.14;
        int inum = (int)dNum;

        System.out.println(inum);
        //소숫점 이하 부분이 무시되고 3만 남는다.*/

        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum + (int)fNum;
        int iNum2 = (int)(dNum + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);
        //iNum1의 경우 둘다 먼저 integer로 변환 1+0 = 1
        //iNum2의 경우 1.2+0.9 = 2.1 그래서 2.1을 integer로 바꿨으니까 2만 남음.

        int myNum = 10;
        int yourNum = 20;

        //myNum = myNum + yourNum;
        myNum += yourNum;
        System.out.println(myNum);


    }
}
