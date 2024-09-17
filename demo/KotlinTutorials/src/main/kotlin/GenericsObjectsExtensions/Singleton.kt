package GenericsObjectsExtensions

object StudentProgress{
    var total: Int = 10
    var answered: Int = 3
}

fun main(){
    println("${StudentProgress.answered} of ${StudentProgress.total}")
}