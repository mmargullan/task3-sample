package endterm.controller

import endterm.model.DriverDto
import endterm.model.Team
import endterm.repository.TeamRepository
import endterm.service.TeamService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/team")
class TeamController(
    private val teamService: TeamService,
    private val teamRepository: TeamRepository
) {

    @GetMapping
    fun getDrivers(): List<Team> {
        return teamRepository.findAll()
    }

    @GetMapping("/{id}")
    fun getTeam(@PathVariable id: Long): ResponseEntity<Any> {
        return teamService.getTeam(id)
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