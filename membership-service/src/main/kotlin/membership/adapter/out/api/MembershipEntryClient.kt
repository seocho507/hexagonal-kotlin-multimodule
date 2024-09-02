package membership.adapter.out.api

import annotations.StreamAdapter
import membership.application.port.out.MembershipEntryPort
import org.springframework.web.reactive.function.client.WebClient

@StreamAdapter
class MembershipEntryClient(
    private val waitingRoomClient: WebClient = WebClient.create("http://localhost:8081/api/v1/waiting-room/")
) : MembershipEntryPort {

    override fun entryMembership(
        membershipName: String,
        membershipEmail: String,
        membershipAddress: String,
        membershipIsCorp: Boolean
    ) {
        TODO("Not yet implemented")
    }

}