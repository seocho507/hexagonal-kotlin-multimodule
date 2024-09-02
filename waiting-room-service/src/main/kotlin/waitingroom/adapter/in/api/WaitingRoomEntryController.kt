package waitingroom.waitroom.adapter.`in`.stream

import annotations.WebAdapter
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import waitingroom.waitroom.application.port.`in`.WaitingRoomEntryUseCase

@WebAdapter
@RequestMapping("/api/v1/waiting-room")
@RestController
class WaitingRoomEntryController(
    private val waitingRoomEntryUseCase: WaitingRoomEntryUseCase
) {

}