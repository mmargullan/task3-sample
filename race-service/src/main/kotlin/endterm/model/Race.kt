package endterm.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "races")
class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var place: String? = null

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    var date: Date? = null

    @Column
    var winnerId: Long? = null

}