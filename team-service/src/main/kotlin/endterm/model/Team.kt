package endterm.model

import javax.persistence.*

@Entity
@Table(name = "teams")
class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var name: String? = null

    @Column
    var country: String? = null

    @Column
    @ElementCollection
    var driverList: ArrayList<DriverDto> ?= null

}