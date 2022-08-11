fun main(){
    fun isPrime(num2:Int): Boolean {
        if (num2 <= 1) {
            return false;
        }
        var i: Int = 0;
        for (i in 2..Math.sqrt(num2.toDouble()).toInt()) {
            if (num2 % i == 0) {
                return false;

            }
        }
        return true;
    }
    var num1= readLine()!!;
    var num2:Int=num1.toInt();
    if (isPrime(num2)){
        println("$num2 is prime")
    }
    else{
        println("$num2 is not prime")
    }
}




















//import java.util.Scanner;
//
//public class Prime {
//    static boolean isPrime(int n){
//        if (n<=1){
//            return false;
//        }
//        for (int i=2;i<=Math.sqrt(n);i++){
//            if (n%i==0) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number up to which you want to print prime number");
//
//        int n=sc.nextInt();
//        for(int i=2;i<=n;i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//
//    }
//
//}
