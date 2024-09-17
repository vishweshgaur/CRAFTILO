package Collections

fun main(){
    val arr = arrayOf<Int>(1,2,3,4)
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf<String>("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets+gasPlanets
    println(solarSystem[4])
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
    solarSystem[8] = "Pluto"
}
