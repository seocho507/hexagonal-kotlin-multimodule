package membership.adapter.out.persistent

import annotations.PersistentAdapter
import membership.application.port.out.RegisterMembershipPort
import membership.domain.Membership

@PersistentAdapter
class MembershipPersistentAdapter(
    private val membershipRepository: MembershipRepository
) : RegisterMembershipPort {
    override fun createMembership(
        membershipName: Membership.MembershipName,
        membershipEmail: Membership.MembershipEmail,
        membershipAddress: Membership.MembershipAddress,
        membershipIsCorp: Membership.MembershipIsCorp
    ): MembershipEntity {
        val entity = membershipRepository.save(
            MembershipEntity.new(
                name = membershipName.value,
                email = membershipEmail.value,
                address = membershipAddress.value,
                isCorp = membershipIsCorp.value
            )
        )
        return entity
    }
}