package endterm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class EndtermApplication

fun main(args: Array<String>) {
	runApplication<EndtermApplication>(*args)
}
