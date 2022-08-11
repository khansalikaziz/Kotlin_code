import java.util.*

fun main(){

    var sc= Scanner(System.`in`)
    println("Enter size of array 1");
    var n1=sc.nextInt();
    var a= Array <Int>(n1){0}
    var count:Int=0;
    println("Enter size of array 2");
    var n2=sc.nextInt();
    var b= Array <Int>(n2){0}
    var c= Array <Int>(a.size+b.size){0}
    println("Enter element of array 1")
    for (i in 0..a.size-1){
        var value:Int=sc.nextInt()
        a.set(i, value);
        c.set(count,value)
        count++;
    }
    println("Enter element of array 2")
    for (k in 0..b.size-1){
        var value:Int=sc.nextInt();
        b.set(k,value );
        c.set(count,value)
        count++
    }

    println("Final array")
    for (j in 0..c.size-1){
        println(c.get(j))
    }
}