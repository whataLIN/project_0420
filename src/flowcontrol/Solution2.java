package flowcontrol;

public class Solution2 {
    public static void main(String[] args) {
        //switch-case

        int a=(int) (Math.random()*5)+1;

        switch(a){

            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            default:
                System.out.println("1,2,3도 아님");
                //default는 필수아님
        }

        // LunchMenu를 바탕으로, 랜덤하게 1개 값을 받음
        // 해당 변수를 switch case로 검사

        LunchMenu menu = LunchMenu.values()[(int) (Math.random() * LunchMenu.values().length)];
        System.out.println("menu : "+menu);
        String strmenu="메뉴는 ";
        switch (menu){
            case KIMCHI:
                System.out.println(strmenu+"kimchi");
                break;
            case BANANA:
                System.out.println(strmenu+"banana");
                break;
            case SOUP:
                System.out.println(strmenu+"banana");
            case BULGOGI:
                System.out.println(strmenu+"bulgogi");
            case PASTA:
                System.out.println(strmenu+"pasta");
        }
    }
}

enum LunchMenu{     //상수 집합
    KIMCHI, BULGOGI, BANANA, SOUP, PASTA
}
