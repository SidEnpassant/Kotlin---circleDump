fun main(){

    val x = 56
    val y = 7

    if(x < y){
        print("True")
    }else{
        print("False")
    }

    if(x < y || y * y == 49)
        println("at least of the condition is true")
    else if (x > y)
        println("X is greater than y")
    else
        println("Not matches any condition")
}