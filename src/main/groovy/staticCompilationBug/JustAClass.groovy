package staticCompilationBug

import groovy.transform.CompileStatic
import java.time.LocalDateTime

@CompileStatic
class JustAClass {

	List<JustAModel> events = []

	LocalDateTime getTimeToEscalate() {
		events.reverse().findResult(LocalDateTime.MAX) { it.timeToEscalate }
	}
}
