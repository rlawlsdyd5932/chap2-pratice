package com.ohgiraffers.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여
         * 두 수 중 큰 수를 출력하는 프로그램을 작성해본다.
         *
         *
         * -- 출력 예시 --
         *
         * 두 수 중 큰 수는 20입니다.
         *
         * */

        int num1=10;
        int num2=20;

        String result1=(num1==200)? "두 수 중 큰 수는 10입니다":"두 수 중 큰 수는 20입니다.";
        System.out.println("result1 = " + result1);

        System.out.println((num1>num2)? "두 수 중 큰 수는 10입니다.": "두 수 중 큰 수는 20입니다.");

        System.out.println((10>num2)? "두 수 중 큰 수는 10입니다.": "두 수 중 큰 수는 20입니다.");


        System.out.println((num2<=num1)?"두 수중 큰수는 10입니다.":(num2>=num1)? "두 수중 큰수는 20입니다.": "두 수는 같습니다.");

        String result2=(num2<=num1)?"두 수중 큰수는 10입니다.":(num2>=num1)? "두 수중 큰수는 20입니다.": "두 수는 같습니다.";
        System.out.println("result2 = " + result2);



    }
}
