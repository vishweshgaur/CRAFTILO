package GenericsObjectsExtensions

interface printable{
    val progressString: String
    fun progressBar()
}

class Quiz: printable{

    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
    override val progressString: String
        get() = "${Generics.Quiz.answered} of ${Generics.Quiz.total}"

    override fun progressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressString)
    }



}

fun main(){
    Quiz().progressBar()
}