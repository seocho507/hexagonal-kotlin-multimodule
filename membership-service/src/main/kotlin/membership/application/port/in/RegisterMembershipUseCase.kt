package membership.application.port.`in`

interface RegisterMembershipUseCase {
    fun register(command: RegisterMembershipCommand): RegisterMembershipResult
}