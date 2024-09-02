package waitingroom.waitingroom.application.port.`in`

data class WaitingRoomEntryCommand(
    val email: String,
    val timestamp: Long
)
