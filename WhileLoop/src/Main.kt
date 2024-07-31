fun main(){

    var sum = 0
    var userInput:String
    println("Instructions:" +
    "\n - Type in any whole number to add" +
        "\n - Press \"0\" to exit")

    do {
        print("Enter a number:")
        userInput = readLine()!!
        sum += userInput.toInt()
    }while (userInput!= "0")

    println("Total = $sum")
}