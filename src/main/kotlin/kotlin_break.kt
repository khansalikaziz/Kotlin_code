fun main(args:Array<String>){
    var i:Int =0;
    var count:Int=0
    label1@ for ( i in 1..3){
        label2@ for (j in 1..3){
            label3@ for (k in 1..3){
                if (j==2)continue@label2;
                println("i is $i , j is $j,k is $k ");
                count++;
            }
        }
    }
    println(count);
}