package waitingroom.waitingroom.application.service

import annotations.UseCase
import org.springframework.data.redis.core.ReactiveRedisTemplate
import reactor.core.publisher.Mono
import waitingroom.waitingroom.application.port.`in`.WaitingRoomEntryCommand
import waitingroom.waitingroom.domain.MembershipEntry
import waitingroom.waitroom.application.port.`in`.WaitingRoomEntryUseCase

@UseCase
class WaitingRoomService(
    private val reactiveRedisTemplate: ReactiveRedisTemplate<String, MembershipEntry>
) : WaitingRoomEntryUseCase {
    override fun enterWaitingRoom(command: WaitingRoomEntryCommand): Mono<Long> {
        return reactiveRedisTemplate.opsForSet()
            .add(
                "waiting-room",
                MembershipEntry.new(
                    membershipEmail = MembershipEntry.MembershipEmail(
                        value = command.email
                    ),
                    membershipEntryTimestamp = MembershipEntry.MembershipEntryTimestamp(
                        value = command.timestamp
                    )
                )
            )
    }
}