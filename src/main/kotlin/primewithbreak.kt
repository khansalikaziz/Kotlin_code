import java.util.*;
fun main( args:Array<String>){
    var n= readln()!!;
    var num:Int=n.toInt();
    var prime:Int=0;
    for (i in 2..num/2){
        if (num%i==0){
            println("Not prime")
            break;
        }
        else{
            println("Prime")
            break;
        }
    }
}