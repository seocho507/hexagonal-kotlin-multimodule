package membership.adapter.`in`.web.request

data class RegisterMembershipRequest(
    val name: String,
    val address: String,
    val email: String,
    val isCorp: Boolean
)