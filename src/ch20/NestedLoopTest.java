package ch20;

public class NestedLoopTest {

    public static void main(String[] args){
        int dan = 2;
        int count = 1;

/*        for( ; dan <= 9; dan++){

            for(count = 1; count <= 9; count++){

                System.out.println( dan + "X" + count + "=" + dan*count);

            }
            System.out.println();//한줄띄우기
        }*/
        dan = 2;
        count = 1;
        while( dan <= 9 ){
            //외부제어 내부제어 할때 이 두제어 둘다 위한 변수를 주의해서 사용해야함.
            count = 1;//초기화 한 count값
            while( count <= 9){


                System.out.println( dan + "X" + count + "=" + dan*count);
                count++;

            }

            dan++;// 2단 밖에 안나온다 왜냐하면 단이 +가 된후 두번째 while로 들어가려고 치니까 지금 count가 9이상이라서
            //그안으로 더이상 들어가지 않는다. 그래서 count 초기화 시켜주어야함.
            System.out.println();
        }

    }
}
