package endterm.model

import javax.persistence.Embeddable

@Embeddable
class DriverDto {

    var id: Long? = null
    var name: String? = null
    var age: Int? = null
    var nationality: String? = null
    var team: String? = null

}