package waitingroom.waitroom.application.port.`in`

import reactor.core.publisher.Mono
import waitingroom.waitingroom.application.port.`in`.WaitingRoomEntryCommand

interface WaitingRoomEntryUseCase {
    fun enterWaitingRoom(command: WaitingRoomEntryCommand): Mono<Long>
}