package oop.etc.test;

public class TestRecursiveCall {

    int fectorial(int num) {
//         int result = 1;
//
//       for(int i = num; i > 0;i--){
//           result *= i;
//           System.out.print(i +" * ");
//       }
//        System.out.println();

        if(num > 0) {
            System.out.print(num + " * ");
            return num * fectorial(num-1);
        }else {
            return 1;
        }




        //¹Ýº¹¹®
    }
    public static void main(String[] args) {
        int result = new TestRecursiveCall().fectorial(5);
        System.out.println("5! : " + result);

    }
}
