package membership.adapter.out.persistent

import membership.domain.Membership

class MembershipMapper {
    companion object {
        fun toDomain(
            entity: MembershipEntity
        ): Membership {
            return Membership.new(
                membershipId = Membership.MembershipId(entity.id),
                membershipName = Membership.MembershipName(entity.name),
                membershipEmail = Membership.MembershipEmail(entity.email),
                membershipAddress = Membership.MembershipAddress(entity.address),
                membershipIsCorp = Membership.MembershipIsCorp(entity.isCorp)
            )
        }
    }
}