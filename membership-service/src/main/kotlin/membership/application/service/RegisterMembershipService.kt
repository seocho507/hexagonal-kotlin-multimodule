package membership.application.service

import annotations.UseCase
import membership.adapter.out.persistent.MembershipMapper
import membership.application.port.`in`.RegisterMembershipCommand
import membership.application.port.`in`.RegisterMembershipResult
import membership.application.port.`in`.RegisterMembershipUseCase
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
            membership = MembershipMapper.toDomain(createdMembership)
        )
    }
}