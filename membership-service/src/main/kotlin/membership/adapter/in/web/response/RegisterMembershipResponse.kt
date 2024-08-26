package membership.adapter.`in`.web.response

import membership.domain.Membership
import org.springframework.http.HttpStatus

data class RegisterMembershipResponse(
    val status: HttpStatus,
    val membership: Membership
)
