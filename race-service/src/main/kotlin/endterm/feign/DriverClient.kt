package endterm.feign

import endterm.model.dto.DriverDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("driver-service")
interface DriverClient {

    @GetMapping("/drivers/{id}")
    fun getDriver(@PathVariable id: Long) : DriverDto

}