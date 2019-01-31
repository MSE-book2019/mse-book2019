/**
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.data.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fhdo.ddmm.data.DataDslRuntimeModule;
import de.fhdo.ddmm.data.DataDslStandaloneSetup;
import de.fhdo.ddmm.data.ide.DataDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DataDslIdeSetup extends DataDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    DataDslRuntimeModule _dataDslRuntimeModule = new DataDslRuntimeModule();
    DataDslIdeModule _dataDslIdeModule = new DataDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_dataDslRuntimeModule, _dataDslIdeModule));
  }
}