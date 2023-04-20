package flowcontrol;

public class Solution1 {
    public static void main(String[] args) {

        int age = 20;
        if (age>=60){
            System.out.println("elder");
        }
        // 조건 만족 시 실행할 코드 묶음을 표현

        else if (age>=20){
            System.out.println("adult");
        }

        else if (age>=13){
            System.out.println("teenager");
        }

        else{
            System.out.println("not adult");
        }

    }
}
