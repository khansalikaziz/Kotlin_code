class Chaining(){
    init {
        println("Init started");
    }
    constructor(num1:Int):this(){
        println("Sum of single digit is : $num1")
    }
    constructor(num1: Int,num2: Int):this(){
        var sum:Int=num1+num2;
        println("Sum of two digit is $sum");

    }
    constructor(num1: Int,num2: Int,num3:Int):this(){
        var sum:Int=num1+num2+num3;
        println("Sum of three digit is $sum");
    }
}
fun main(){
    var obj1=Chaining(4);
    var obj2=Chaining(4,5);
    var obj3= Chaining(4,5,9);
}