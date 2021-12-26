package blue.bluejam.goyotracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoyoTrackerApplication

fun main(args: Array<String>) {
	runApplication<GoyoTrackerApplication>(*args)
}
