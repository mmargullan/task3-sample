package endterm.service

import endterm.feign.DriverClient
import endterm.model.DriverDto
import endterm.model.Team
import endterm.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(
    private val teamRepository: TeamRepository,
    private val driverClient: DriverClient
) {

    fun updateTeam(id: Long, body: Team): Team {
        val team = teamRepository.findById(id).get()
        body.name?.let { team.name = it }
        body.country?.let { team.country = it }
        teamRepository.save(team)
        return team
    }

    fun find(id: Long): DriverDto {
        return driverClient.getDriver(id)
    }

}