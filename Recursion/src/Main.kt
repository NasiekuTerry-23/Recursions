fun main(){
    println("Factorial of 8: ${factorial(8)}")
}

fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}