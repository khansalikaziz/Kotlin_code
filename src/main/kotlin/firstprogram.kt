fun main(){
    var count=0;
    while (true){
        println("Enter user input:")
        var num1= readLine()!!
        var num:Int=num1.toInt()
         if(num==0){
             println("Exited")
             break
         }
        else if (num>0){
            count++
        }
    }
    println("Total positive numbers are $count")
}
