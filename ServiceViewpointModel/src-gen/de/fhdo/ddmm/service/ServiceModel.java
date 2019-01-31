/**
 */
package de.fhdo.ddmm.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This metamodel represents the Service Modeling Viewpoint, which is used for defining services.
 *  *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.ServiceModel#getImports <em>Imports</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.ServiceModel#getMicroservices <em>Microservices</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.service.ServicePackage#getServiceModel()
 * @model
 * @generated
 */
public interface ServiceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.service.Import}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.service.Import#getServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see de.fhdo.ddmm.service.ServicePackage#getServiceModel_Imports()
	 * @see de.fhdo.ddmm.service.Import#getServiceModel
	 * @model opposite="serviceModel" containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Microservices</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.service.Microservice}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.service.Microservice#getServiceModel <em>Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microservices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservices</em>' containment reference list.
	 * @see de.fhdo.ddmm.service.ServicePackage#getServiceModel_Microservices()
	 * @see de.fhdo.ddmm.service.Microservice#getServiceModel
	 * @model opposite="serviceModel" containment="true" required="true"
	 * @generated
	 */
	EList<Microservice> getMicroservices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get all operations of all defined microservices
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Operation> getContainedOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get all referred operations of all defined microservices
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<ReferredOperation> getContainedReferredOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get all interfaces of all defined microservices
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<Interface> getContainedInterfaces();

} // ServiceModel
