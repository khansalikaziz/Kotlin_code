interface calc{
    fun sum(a:Int,b:Int):Int
}
class ImplCalculator:calc{
    override fun sum(a: Int, b: Int):Int{
        return (a+b)
    }
}
fun main(){
    var num1:Int=2
    var num2:Int=6
    var obj=ImplCalculator()
    print("Sum is "+obj.sum(num1,num2));
}