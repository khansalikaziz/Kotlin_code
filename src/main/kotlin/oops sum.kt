import java.util.Scanner
//Addition
open class Calculator{
    fun sum(x: Int, y:Int): Int {
        return (x+y);
    }
}
//Enhancing functionality of calculator class
class NewCalculator: Calculator() {
    fun sub(x:Int,y: Int):Int{
        return (x-y);
    }
}

fun main(){
    var sc=Scanner(System.`in`);
    println("Enter first number");
    var a:Int=sc.nextInt();
    println("Enter second number");
    var b:Int=sc.nextInt();
    var obj=NewCalculator();
    println("Sum is :"+obj.sum(a,b));
    println("Subtraction result is :"+obj.sub(a,b));

}
//if class is open then it is not final we can inherit that