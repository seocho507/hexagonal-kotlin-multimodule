package membership.adapter.`in`.web.api

import annotations.WebAdapter
import membership.adapter.`in`.web.request.RegisterMembershipRequest
import membership.adapter.`in`.web.response.RegisterMembershipResponse
import membership.application.port.`in`.RegisterMembershipCommand
import membership.application.port.`in`.RegisterMembershipUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@WebAdapter
@RestController("/api/v1/membership")
class RegisterMembershipController(
    private val registerMembershipUseCase: RegisterMembershipUseCase
) {

    @PostMapping("/register")
    fun register(@RequestBody request: RegisterMembershipRequest): RegisterMembershipResponse {
        val command = RegisterMembershipCommand(
            name = request.name,
            address = request.address,
            email = request.email,
            isCorp = request.isCorp
        )

        val result = registerMembershipUseCase.register(command)
        return RegisterMembershipResponse(
            status = HttpStatus.CREATED,
            membership = result.membership
        )
    }
}