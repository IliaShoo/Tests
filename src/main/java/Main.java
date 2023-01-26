import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        Calculator calculator =new Calculator();

        int first = calculator.sub(25,5);
        int second = calculator.div(100,20);
        int third = calculator.summ(20,20);
        int fourth = calculator.multiply(10,3);

        int result = comparison(first,second,third,fourth);
        System.out.println("Your result is "+ result );

        int custom = scanner.nextInt();

        System.out.println(recursion(custom,result));
        ;

    }

    public static int comparison(int first, int second,int third, int fourth){

        int result = 0;
        int one = first + second;
        int two = third + fourth;
        if(one>two){
            result = one - two;
        }else{
            result = two + one;
        }
        return result;
    }

    public static int recursion(int custom, int result) {
        int resursionInt =1;
        if(custom == 0){
            return resursionInt;
        }else{
            resursionInt = result * recursion(custom-1,result);
        }
        return resursionInt;
    }
}