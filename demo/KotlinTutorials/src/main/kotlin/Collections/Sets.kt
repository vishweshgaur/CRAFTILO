package Collections

fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Earth")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    for (planets in solarSystem){
        println(planets)
    }
}