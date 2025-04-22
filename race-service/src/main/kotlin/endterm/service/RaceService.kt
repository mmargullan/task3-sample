package endterm.service

import endterm.feign.DriverClient
import endterm.feign.TeamClient
import endterm.repository.RaceRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class RaceService(
    private val raceRepository: RaceRepository,
    private val driverClient: DriverClient,
    private val teamClient: TeamClient
) {

    fun getRace(id: Long): ResponseEntity<Any> {
        val race = raceRepository.findById(id).get()
        val winner = driverClient.getDriver(race.winnerId!!)
        val team = teamClient.getTeamById(winner.teamId!!)
        return ResponseEntity.ok().body(mapOf("race" to race, "winner" to winner, "team" to team.body))
    }

}