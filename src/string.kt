import java.util.Locale
import java.util.Locale.getDefault

fun main(){

    val stringsss = "this is an example"
    println(stringsss)
    println("IT IS : $stringsss")

    println("BIG: ${stringsss.uppercase(getDefault())}")
}