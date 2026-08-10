
fun main() {
    val name = "Kotlin"


    // FUNDAMENTAL OR PRIMITIVE DATATYPES
    //    val x = 5 OR
    // val x: Int = 5 // integer
    //    val x: Float = 5f // float
    //    val x: Double = 5.2222  // double numbers
    //    val x: Boolean = true // Boolean
    //    var x: String = "Siddhes" //String
       // can take var when value changing later on in code
    //    x = "Bye Bye"



//    // ARITHMETIC OPERATORS
//    val x = 10
//    val y = 5
//    println(x + y)
//    println(x / y)
//    println(x * y)
//    println(x % y)
//
//    // COMPARISON OPERATORS
//    println(x == y)
//    println(x > y)
//    println(x < y)
//    println("Is $x an even number?: ${x % 2 == 0}")


    // LOGICAL OPERATORS
//    val x = 12
//    val y = 11
////    val areBothEven = x % 2 == 0 && y % 2 == 0
////    val areBothEven = x % 2 == 0 || y % 2 == 0
//    val areBothEven = x % 2 == 0 || y % 2 == 0 && x + y == 25 // && is prioritized here above ||
//    println(areBothEven)


    // USER INPUT
//    println("Enter a number:")
//    val input = readln()
////    val inputAsInteger = input.toInt()
//
//    val inputAsInteger = input.toIntOrNull() ?: 0// nullability
//    // OR
////    val inputAsInteger = input.toIntOrNull()?.inc()// nullability
//
////    val isEven = inputAsInteger % 2 == 0
////    println("Is the number even? $isEven")
//    println("Integer is $inputAsInteger")
//
//    val isEven = inputAsInteger!! % 2 == 0 // !!
//    println("Is the number even? $isEven")




//
//    //IF STATEMENTS , WHEN
//
//    println("Enter a number:")
//    val input = readln()
//    val inputAsInteger = input.toIntOrNull()
//
//    if(inputAsInteger != null){
//        val output = when{
//            inputAsInteger % 2 == 0 -> "THe number s even!"
//            inputAsInteger < 10 -> "The number is less than 10"
//            //in 10..20 ->  "The number is between 10 and 20"
//            else -> "The number is odd and atleast 11"
//        }
////        val output = if(inputAsInteger  % 2 == 0){
////            "The number is even"
////        }else{
////            "The number is odd"
////        }
////        val isEven = inputAsInteger % 2 == 0
////        if(isEven){
////            println("The number is even !")
////        }else{
////            println("The number is odd!")
////        }
////        println("Is the number even? $isEven")
//        println(output)
//    }else{
//        println("Dude, enter a valid number:")
//    }
//

    //TRY , CATCH , EXCEPTIONS

    println("Enter a number:")
    val input = readln()
//    throw Exception("Dude what u passed here") // for throwing exceptions
    val inputAsInteger = try{
        input.toInt()
    }catch (e: NumberFormatException){
//    }catch (e: Exception){ // include all kinds of exceptions
        0
    } finally { // this piece definitely executed this finally bloc

    }









}


