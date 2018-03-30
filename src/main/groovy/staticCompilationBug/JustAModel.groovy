package staticCompilationBug

import groovy.transform.CompileStatic
import java.time.LocalDateTime

@CompileStatic
class JustAModel {
	LocalDateTime timeToEscalate
}
