package incrementalCompilationBug

import groovy.transform.CompileStatic
import org.springframework.data.repository.CrudRepository

@CompileStatic
interface HospitalRepository extends CrudRepository<Hospital, Long> {
}
