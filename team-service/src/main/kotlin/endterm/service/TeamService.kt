package endterm.service

import endterm.model.Team
import endterm.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(
    private val teamRepository: TeamRepository
) {

    fun updateTeam(id: Long, body: Team): Team {
        val team = teamRepository.findById(id).get()
        body.name?.let { team.name = it }
        body.country?.let { team.country = it }
        body.driverList?.let { team.driverList = it }
        teamRepository.save(team)
        return team
    }

}