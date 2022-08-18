class Calculator1(x:Int,y:Int){
    var num1=x;
    var num2=y;
    fun add(): Int {
        return (num1+num2);
    }
}

fun main(){
    var c=Calculator1(12,5);
    println(c.add());
}