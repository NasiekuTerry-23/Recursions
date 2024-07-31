fun main(){

    val total : Int = (1..500).random() + 202
    val numberCheck = if(total > 500) "More than 500" else "Less than 500"

    println("total = $total")
    println("total = $numberCheck")
}