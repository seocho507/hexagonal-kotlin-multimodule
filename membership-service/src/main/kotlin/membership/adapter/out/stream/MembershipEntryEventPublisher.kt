package membership.adapter.out.stream

import annotations.StreamAdapter
import membership.application.port.out.MembershipEntryPort
import org.springframework.context.ApplicationEventPublisher

@StreamAdapter
class MembershipEntryEventPublisher(
    private val membershipEntryEventPublisher: ApplicationEventPublisher
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