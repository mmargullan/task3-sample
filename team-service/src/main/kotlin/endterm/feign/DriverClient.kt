package endterm.feign

import endterm.model.DriverDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient("driver-service")
interface DriverClient {

    @GetMapping("/drivers/getByTeamId/{teamId}")
    fun getDrivers(@PathVariable("teamId") id: Long): List<DriverDto>

}