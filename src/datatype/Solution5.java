package datatype;

public class Solution5 {
    public static void main(String[] args) {
        //typecast : 형변환

        //1. 메소드 사용
        //문자열 -> 정수
        String str = "100";
        System.out.println("str : "+str);
        int num = Integer.parseInt(str); //parsing : 분석
        System.out.println("num : "+num);

        //순수한 숫자가 아니라면?
        str="-100";
        num=Integer.parseInt(str);
        num++;
        System.out.println("num : "+num);

        str="100.56";
        Double num2=Double.parseDouble(str);
        num2++;
        System.out.println("num2 : "+num2);

        // 정수 -> 문자열
        int num4=200;
        System.out.println("num4 : "+num4);
        System.out.println("num4 toString : "+ new Integer(num4).toString());

        //2. 강제 변환 방식
        // str -> int
        String str2 = "200";

        int num5=100;
        System.out.println("(double) num5 = "+ (double) num5);

        double num6 = 200.5;
        System.out.println("(int) num6 = "+ (int) num6);

    }
}
