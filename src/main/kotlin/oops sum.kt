import java.util.Scanner

class Calculator{
    fun sum(x: Int, y:Int): Int {
        return (x+y);
    }
}

fun main(){
    var sc=Scanner(System.`in`);
    println("Enter first number");
    var a:Int=sc.nextInt();
    println("Enter second number");
    var b:Int=sc.nextInt();
    var obj=Calculator();
    println("Sum is :"+obj.sum(a,b));
}