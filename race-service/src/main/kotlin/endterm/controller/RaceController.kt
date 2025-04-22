package endterm.controller

import endterm.feign.TeamClient
import endterm.model.Race
import endterm.model.dto.TeamDto
import endterm.repository.RaceRepository
import endterm.service.RaceService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/race")
class RaceController(
    private val raceRepository: RaceRepository,
    private val raceService: RaceService,
    private val teamClient: TeamClient
) {

    @GetMapping
    fun getAllRaces(): List<Race> = raceRepository.findAll()

    @GetMapping("/{id}")
    fun getRace(@PathVariable id: Long): ResponseEntity<Any> {
        return raceService.getRace(id)
    }

    @PostMapping
    fun createRace(@RequestBody race: Race): Race {
        return raceRepository.save(race)
    }

}