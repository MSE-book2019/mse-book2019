package de.fhdo.ddmm.operationdsl;

import de.fhdo.ddmm.service.Import;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

/**
 * Custom resource description strategy for the OperationDsl.
 */
@SuppressWarnings("all")
public class OperationDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  /**
   * Export selected EObjects from DSL models
   */
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _matched = false;
    if (eObject instanceof Import) {
      _matched=true;
      return false;
    }
    return super.createEObjectDescriptions(eObject, acceptor);
  }
}
