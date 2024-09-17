package HighOrderFunctions

class Cookies(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
    )

val cookie = listOf(
    Cookies(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookies(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookies(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookies(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookies(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookies(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookies(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
val totalCost = cookie.fold(0.0){total, cookie ->
    total+cookie.price
}

val fullMenu = cookie.map {
    "${it.name} - Rs.${it.price}"
}

val softBaked = cookie.filter {
    it.softBaked
}

val groupedMenu = cookie.groupBy {
    it.softBaked
}

val softMenu = groupedMenu[true] ?: listOf()
val crunchyMenu = groupedMenu[false] ?: listOf()

val alphabeticalSort = cookie.sortedBy {
    it.name
}

fun main() {

//    println("Soft Menu")
//    softMenu.forEach{
//        println("${it.name} - ${it.price}")
//    }
//    println("Crunchy Menu")
//    crunchyMenu.forEach{
//        println("${it.name} - ${it.price}")
//    }

//    println("$totalCost")

    alphabeticalSort.forEach {
        println("${it.name} - ${it.price}")
    }

}