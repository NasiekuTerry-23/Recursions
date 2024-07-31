
fun main(){
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    print("Enter another number: ")
    val number2 = readLine()!!.toInt()

    println("Enter an operator: +, -, *, /")
    val operator = readLine()!!

    val result = when(operator){
        "+" -> "$number + $number2 = ${number + number2}"
        "-" -> "$number - $number2 = ${number - number2}"
        "*" -> "$number * $number2 = ${number * number2}"
        "/" -> "$number / $number2 = ${number / number2}"

        else -> "$operator is not recognized"
    }

    println(result)
}