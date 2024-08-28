package waitingroom


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WaitingRoomServiceApplication

fun main(args: Array<String>) {
    runApplication<WaitingRoomServiceApplication>(*args)
}
