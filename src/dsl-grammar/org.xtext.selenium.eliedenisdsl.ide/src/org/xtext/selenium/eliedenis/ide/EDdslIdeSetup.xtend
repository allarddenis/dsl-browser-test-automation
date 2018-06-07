/*
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.selenium.eliedenis.EDdslRuntimeModule
import org.xtext.selenium.eliedenis.EDdslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EDdslIdeSetup extends EDdslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EDdslRuntimeModule, new EDdslIdeModule))
	}
	
}