fun main(){
    var a= arrayOf<Int>(1,2,3);
    var str = arrayOf<String>("Salik","Nikhil")
    println("Integer Array")
    for(i in 0..a.size-1){
        println(a[i])
    }
    println("String Array")
    for(j in 0..str.size-1){
        println(str[j])
    }
}