package endterm.repository

import endterm.controller.RaceController
import endterm.model.Race
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RaceRepository: JpaRepository<Race, Long> {
}