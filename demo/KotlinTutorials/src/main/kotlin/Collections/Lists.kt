package Collections

fun main() {
    val rockPlanets = listOf<String>("Mercury", "Venus", "Earth", "Mars")
    println(rockPlanets.size)
    println(rockPlanets.get(3))
    println(rockPlanets.indexOf("earth"))

    for(planets in rockPlanets){
        println(planets)
    }
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add(4,"Pluto")
    for (planets in solarSystem){
        println(planets)
    }

}