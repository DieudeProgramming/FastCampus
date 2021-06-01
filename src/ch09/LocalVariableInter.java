package ch09;

public class LocalVariableInter {

    public static void main(String[] args){
        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        //str을 컴파일하면서 str2도 같이 string일것이다 추론한다.
        System.out.println(str);
        str = "hello";
        // str = 3; 이미 데이터형이 정해졌으므로 가능하지 않다.

        System.out.println(str);

    }
}
