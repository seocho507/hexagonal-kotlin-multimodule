package membership.application.port.`in`

import common.UseCase
import membership.application.port.out.RegisterMembershipPort
import membership.domain.Membership

@UseCase
class RegisterMembershipService(
    private val registerMembershipPort: RegisterMembershipPort
) : RegisterMembershipUseCase {

    override fun register(command: RegisterMembershipCommand): RegisterMembershipResult {
        val createdMembership = registerMembershipPort.createMembership(
            membershipName = Membership.MembershipName(command.name),
            membershipEmail = Membership.MembershipEmail(command.email),
            membershipAddress = Membership.MembershipAddress(command.address),
            membershipIsCorp = Membership.MembershipIsCorp(command.isCorp)
        )

        return RegisterMembershipResult(
            membership = Membership.new(
                membershipId = Membership.MembershipId(createdMembership.id),
                membershipName = Membership.MembershipName(createdMembership.name),
                membershipEmail = Membership.MembershipEmail(createdMembership.email),
                membershipAddress = Membership.MembershipAddress(createdMembership.address),
                membershipIsCorp = Membership.MembershipIsCorp(createdMembership.isCorp)
            )
        )
    }
}