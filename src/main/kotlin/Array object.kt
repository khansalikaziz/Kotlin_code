import java.util.*

fun main(){
    var a= Array <Int>(5){0}
    var sc= Scanner(System.`in`)

    var b= Array <Int>(5){0}
    var c= Array <Int>(a.size+b.size){0}
    var count:Int=0;
    println("Enter element of array 1")
    for (i in 0..a.size-1){
        var value:Int=sc.nextInt()
        a.set(i, value);
        c.set(count,value)
        count++;
    }
    println("Enter element of array 2")
    for (k in 0..a.size-1){
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