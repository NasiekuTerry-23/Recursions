fun main(){
    print("Enter a Number: ")
    val number = readLine()!!.toInt()
    print("Enter another Number: ")
    val number2 = readLine()!!.toInt()

    println("$number + $number2 = ${number +number2}")
}