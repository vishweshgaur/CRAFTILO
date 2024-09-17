fun main() {
//    val string = "This is an example text"
//    println("Our String is: ${string.reversed()}")
//    var x = 4
//    var y = 4
//    println(x == y)

//    var userInput = readLine()
////    println("You entered ${userInput?.uppercase()}")
//    if (userInput != null) {
//        print(userInput.toInt() - 5)
//    }

    var age = readLine();
    if (age!=null) {
        if (age.toInt() < 18) {
            println("You are an adult")
        }
        else if(age.toInt() > 18 && age.toInt() < 65){
            println("You are a adult")
        }
        else {
            println("You really fucking old")
        }
    }
}
