/**
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.operationdsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fhdo.ddmm.operationdsl.OperationDslRuntimeModule;
import de.fhdo.ddmm.operationdsl.OperationDslStandaloneSetup;
import de.fhdo.ddmm.operationdsl.ide.OperationDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class OperationDslIdeSetup extends OperationDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    OperationDslRuntimeModule _operationDslRuntimeModule = new OperationDslRuntimeModule();
    OperationDslIdeModule _operationDslIdeModule = new OperationDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_operationDslRuntimeModule, _operationDslIdeModule));
  }
}
