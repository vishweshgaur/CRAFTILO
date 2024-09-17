package GenericsObjectsExtensions

class Generics {
    data class Question<T>(
        val questionText: String,
        val answer: T,
        val difficulty: Difficulty

    )
    enum class Difficulty{
        EASY, MEDIUM, HARD
    }
    class Quiz{
        val question1 = Generics.Question<String>("Quoth the raven ___", "nevermore", Generics.Difficulty.HARD)
        val question2 = Generics.Question<Boolean>("The sky is green. True or false", false, Generics.Difficulty.EASY)
        val question3 = Generics.Question<Int>("How many days are there between full moons?", 28, Generics.Difficulty.HARD)

        companion object StudentProgress {
            var total: Int = 10
            var answered: Int = 3
        }

        fun printQuiz(){
            question1.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
            question2.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
            question3.let {
                println(it.questionText)
                println(it.answer)
                println(it.difficulty)
            }
            println()
        }

    }


    val Quiz.StudentProgress.getProgressText: String
        get() = "$answered of $total answered"

    fun Quiz.StudentProgress.progressBar(){
        repeat(times = Quiz.answered){ print("▓") }
        repeat(times = Quiz.total-Quiz.answered){ print("▒") }
        println()
        println(Quiz.getProgressText)

    }


}


