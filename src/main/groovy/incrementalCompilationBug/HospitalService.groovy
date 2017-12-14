package incrementalCompilationBug

import groovy.transform.CompileStatic

@CompileStatic
class HospitalService {

	HospitalRepository hospitalRepository

	void usingMethod() {
		hospitalRepository.save(new Hospital())
	}
}
