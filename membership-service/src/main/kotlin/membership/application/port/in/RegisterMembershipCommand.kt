package membership.application.port.`in`

data class RegisterMembershipCommand(
    val name: String,
    val address: String,
    val email: String,
    val isCorp: Boolean
)
