package endterm.repository

import endterm.model.Driver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DriverRepository: JpaRepository<Driver, Long> {
}