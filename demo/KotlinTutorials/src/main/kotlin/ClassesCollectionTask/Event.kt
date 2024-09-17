package ClassesCollectionTask

data class Event(
    val title: String,
    val description: String?=null,
    val daypart: Daypart,
    val durationInMinutes: Int

)

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

val events = mutableListOf<Event>(
    event1,
    event2,
    event3,
    event4,
    event5,
    event6
)
val shortEvents = events.filter {
    it.durationInMinutes < 15
}
val eventAccordingToTime = events.groupBy {
    it.daypart
}

val kotlin = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.", Daypart.MORNING, 15)
fun main() {
    println(kotlin)
//    shortEvents.forEach {
//        println(it.title)
//    }

//    eventAccordingToTime.forEach{(daypart, events)->
//        println("$daypart - ${events.size}")
//
//    }

    println("Last event of the day: ${events.last().title}")
}