class Cons (){
   init {
       println("Hello world");
   }
    constructor(name:String):this()  {
        println("Name is $name");
    }
    constructor(name: String,haircolor:String):this("Salik") {
        println("Color : $haircolor");
    }
}
fun main(){
    var c=Cons("Java","Brown");
}