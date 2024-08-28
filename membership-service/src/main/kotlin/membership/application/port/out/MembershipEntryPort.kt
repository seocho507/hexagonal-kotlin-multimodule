package membership.application.port.out

interface MembershipEntryPort {
    fun entryMembership(
        membershipName: String,
        membershipEmail: String,
        membershipAddress: String,
        membershipIsCorp: Boolean
    )
}