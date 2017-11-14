/*
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.selenium.eliedenisdsl.ui.internal.EliedenisdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EDdslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EliedenisdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EliedenisdslActivator.getInstance().getInjector(EliedenisdslActivator.ORG_XTEXT_SELENIUM_ELIEDENIS_EDDSL);
	}
	
}
