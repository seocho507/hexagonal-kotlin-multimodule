package membership.domain

data class Membership(
    val membershipId: MembershipId,
    val name: MembershipName,
    val email: MembershipEmail,
    val address: MembershipAddress,
    val aggregateIdentifier: MembershipIsCorp
) {
    companion object {
        fun new(
            membershipId: MembershipId,
            membershipName: MembershipName,
            membershipEmail: MembershipEmail,
            membershipAddress: MembershipAddress,
            membershipIsCorp: MembershipIsCorp
        ): Membership {
            return Membership(
                membershipId,
                membershipName,
                membershipEmail,
                membershipAddress,
                membershipIsCorp
            )
        }
    }

    @JvmInline
    value class MembershipId(val value: String) {
        init {
            require(value.isNotBlank()) { "MembershipId cannot be blank" }
        }
    }

    @JvmInline
    value class MembershipName(val value: String) {
        init {
            require(value.isNotBlank()) { "MembershipName cannot be blank" }
        }
    }

    @JvmInline
    value class MembershipEmail(val value: String) {
        init {
            require(value.isNotBlank()) { "MembershipEmail cannot be blank" }
            require(Regex("^[A-Za-z0-9+_.-]+@(.+)\$").matches(value)) { "Invalid email format" }
        }
    }

    @JvmInline
    value class MembershipAddress(val value: String) {
        init {
            require(value.isNotBlank()) { "MembershipAddress cannot be blank" }
        }
    }

    @JvmInline
    value class MembershipIsCorp(val value: Boolean)
}