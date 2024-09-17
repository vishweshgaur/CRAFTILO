package Lamda


    fun main(){
//        This will show error
//        val trickFunction = trick
//        val trickFunction = trick
//        trick()
//        trickFunction()
//        treat()
//        trickFunction
//        trick()

//        val coins: (Int) -> String = { quantity ->
//            "$quantity paise"
//        }
//
//        val cupcake: (Int) -> String = { quantity ->
//            "cupcake given"
//        }

        val morningNotification = 51
        val eveningNotification = 135

        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)

//        val ans1 = trickOrTreat(false, {"$it paise"})
//        val ans1 = trickOrTreat(false){"$it paise"}
//        val ans2 = trickOrTreat(false, null)
//        ans1()
//        ans2()

    }

//    fun trick (){
//        println("There is no treat");
//    }

    fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit{
        if (isTrick){
            return trick
        }
        else{
            if (extraTreat != null) {
                println(extraTreat(5))
            }
            return treat
        }
    }
    val trick = {
        println("There is no treat!")
    }

    val treat: () -> Unit = {
        println("Here are the treats")
    }

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }
    else{
        println("You have $numberOfMessages notifications")
    }
}
