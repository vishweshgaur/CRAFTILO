fun main() {
    var computerOutput = ""
    var userOutput = ""

    println("Rock, Paper, Scissor, Chose one!")
    userOutput = readln()
    var randomNumber = (1..3).random()

    if (userOutput == "Rock"){
        if (randomNumber == 1){
            println("Both same, Try Again")
        }
        else if (randomNumber == 2){
            println("Computer wins, paper drawn")
        }
        else{
            println("You win, scissors drawn")
        }
    }
    if (userOutput == "Paper"){
        if (randomNumber == 1){
            println("You win, Rock drawn")
        }
        else if (randomNumber == 2){
            println("Both same, Try Again")
        }
        else{
            println("Computer wins, scissors drawn")
        }
    }
    if (userOutput == "Scissors"){
        if (randomNumber == 1){
            println("Computer win, Rock drawn")
        }
        else if (randomNumber == 2){
            println("You win, Paper drawn")
        }
        else{
            println("Both same, Try Again")
        }
    }

}