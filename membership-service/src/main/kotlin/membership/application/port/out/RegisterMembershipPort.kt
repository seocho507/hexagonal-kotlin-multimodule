package membership.application.port.out

import membership.adapter.out.persistent.MembershipEntity
import membership.domain.Membership.*

interface RegisterMembershipPort {
    fun createMembership(
        membershipName: MembershipName,
        membershipEmail: MembershipEmail,
        membershipAddress: MembershipAddress,
        membershipIsCorp: MembershipIsCorp
    ): MembershipEntity
}