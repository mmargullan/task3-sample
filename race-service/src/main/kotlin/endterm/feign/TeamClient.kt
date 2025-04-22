package endterm.feign

import endterm.model.dto.TeamDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("team-service")
interface TeamClient {

    @GetMapping("/team/{id}")
    fun getTeamById(@PathVariable id: Long): ResponseEntity<Any>

}