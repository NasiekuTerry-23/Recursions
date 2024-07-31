fun main(){
    for (i in 1..5){
        print(i)
    }
    println("\n---")
    for (i in 5 downTo 1){
        print(i)
    }
    println("\n---")
    for (i in 0..100 step 10) {
        print("$i ")
    }
    println("\n---")
    for (i in 100 downTo 0 step 10)
        print("$i ")
}