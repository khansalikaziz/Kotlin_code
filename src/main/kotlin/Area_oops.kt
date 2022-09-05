import java.util.Scanner
//Addition
open class rect{
    var a:Int=0
    var b:Int=0
    fun getInput(){
        var sc=Scanner(System.`in`)
        a=sc.nextInt()

        b=sc.nextInt()

    }
    fun calculate():Int{
        getInput()
        return (a*b)
    }
    fun display(){
        println("Area of rectangle is "+calculate())
    }
}
fun main(){
    var obj23=rect();
    obj23.getInput();
    obj23.calculate();
    obj23.display();
}