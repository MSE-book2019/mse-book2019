/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.operationdsl.ide

import com.google.inject.Guice
import de.fhdo.ddmm.operationdsl.OperationDslRuntimeModule
import de.fhdo.ddmm.operationdsl.OperationDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OperationDslIdeSetup extends OperationDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OperationDslRuntimeModule, new OperationDslIdeModule))
	}
	
}