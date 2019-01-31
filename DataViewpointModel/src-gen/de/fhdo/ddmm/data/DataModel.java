/**
 */
package de.fhdo.ddmm.data;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This metamodel represents the Data Modeling Viewpoint, which is mainly used for defining custom
 * structure and list types.
 *  *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.data.DataModel#getComplexTypeImports <em>Complex Type Imports</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.DataModel#getVersions <em>Versions</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.DataModel#getContexts <em>Contexts</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.DataModel#getComplexTypes <em>Complex Types</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.data.DataPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex Type Imports</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.data.ComplexTypeImport}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.ComplexTypeImport#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) Only one (or none) of the lists versions, contexts or complexTypes may be filled
	 *          with elements. That is, a DataModel may define custom types in versions (and
	 *          contexts), contexts, or without versions and contexts.
	 *          Ensured by: DSL grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Type Imports</em>' containment reference list.
	 * @see de.fhdo.ddmm.data.DataPackage#getDataModel_ComplexTypeImports()
	 * @see de.fhdo.ddmm.data.ComplexTypeImport#getDataModel
	 * @model opposite="dataModel" containment="true"
	 * @generated
	 */
	EList<ComplexTypeImport> getComplexTypeImports();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.data.Version}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.Version#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see de.fhdo.ddmm.data.DataPackage#getDataModel_Versions()
	 * @see de.fhdo.ddmm.data.Version#getDataModel
	 * @model opposite="dataModel" containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.data.Context}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.Context#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see de.fhdo.ddmm.data.DataPackage#getDataModel_Contexts()
	 * @see de.fhdo.ddmm.data.Context#getDataModel
	 * @model opposite="dataModel" containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

	/**
	 * Returns the value of the '<em><b>Complex Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.data.ComplexType}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.ComplexType#getDataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Types</em>' containment reference list.
	 * @see de.fhdo.ddmm.data.DataPackage#getDataModel_ComplexTypes()
	 * @see de.fhdo.ddmm.data.ComplexType#getDataModel
	 * @model opposite="dataModel" containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplexTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  For debugging purposes to test the type checker. May be safely removed in the future.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<ComplexType> getContainedComplexTypes();

} // DataModel
