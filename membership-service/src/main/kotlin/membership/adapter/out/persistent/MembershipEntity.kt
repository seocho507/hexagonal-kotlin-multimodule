package membership.adapter.out.persistent

import jakarta.persistence.*

@Entity
@Table(name = "memberships")
data class MembershipEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_id")
    val membershipId: Long = 0,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "email", nullable = false)
    val email: String,

    @Column(name = "address", nullable = false)
    val address: String,
    @Column(name = "is_corp", nullable = false)
    val isCorp: Boolean
) {
    companion object {
        fun new(
            name: String,
            email: String,
            address: String,
            isCorp: Boolean
        ): MembershipEntity {
            return MembershipEntity(
                name = name,
                email = email,
                address = address,
                isCorp = isCorp
            )
        }
    }
}
