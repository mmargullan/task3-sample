package endterm.controller

import endterm.model.Team
import endterm.repository.TeamRepository
import endterm.service.TeamService
import org.springframework.web.bind.annotation.*

@RestController
class TeamController(
    private val teamService: TeamService,
    private val teamRepository: TeamRepository
) {

    @GetMapping
    fun getDrivers(): List<Team> {
        return teamRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getTeam(@PathVariable id: Long): Team {
        return teamRepository.findById(id).get()
    }

    @PostMapping
    fun createTeam(@RequestBody driver: Team): Team {
        return teamRepository.save(driver)
    }

    @PutMapping("/{id}")
    fun updateTeam(@PathVariable id: Long, @RequestBody body: Team): Team {
        return teamService.updateTeam(id, body)
    }

}