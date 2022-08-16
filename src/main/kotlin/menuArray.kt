import java.util.Scanner

fun main(){
    var sc=Scanner(System.`in`);
    var arr=Array<Int>(20){0};
    while (true){
        println("Enter user input");
        var inp:Int=sc.nextInt();
        if (inp==1){
            println("Enter index no:");
            var index:Int=sc.nextInt();
            println("Enter element to insert")
            var ele:Int=sc.nextInt();
            arr.set(index,ele);
        }
        else if (inp==2){
            println("Output is :");
            for (i in 0 .. arr.size-1){
                if (arr[i]==0){
                    continue;
                }
                else{
                    println(arr[i]);
                }
            }
        }
        else if(inp==3){
            println("Output is :");
            for (i in 0 .. arr.size-1){
                if (arr[i]==0){
                    continue;
                }
                else{
                    println(arr[i]);
                }
            }
            println("Exiting");
            break;
        }
       else if(inp==4){
           println("Enter index to delete");
           var ind:Int=sc.nextInt();
           arr[ind]=0;
        }
    }
}