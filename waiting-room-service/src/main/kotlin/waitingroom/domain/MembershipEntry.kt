package waitingroom.waitingroom.domain

data class MembershipEntry private constructor(
    val membershipEmail: MembershipEmail,
    val membershipEntryTimestamp: MembershipEntryTimestamp
) {
    companion object {
        fun new(
            membershipEmail: MembershipEmail,
            membershipEntryTimestamp: MembershipEntryTimestamp
        ): MembershipEntry {
            return MembershipEntry(
                membershipEmail,
                membershipEntryTimestamp
            )
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
    value class MembershipEntryTimestamp(val value: Long) {
        init {
            require(value >= 0) { "MembershipEntryTimestamp cannot be blank" }
        }
    }
}