/**
 */
package de.fhdo.ddmm.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Concept for data structures, i.e., complex types probably consisting of named and typed fields,
 * but that may also be empty though
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.data.DataStructure#getSuper <em>Super</em>}</li>
 *   <li>{@link de.fhdo.ddmm.data.DataStructure#getDataFields <em>Data Fields</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ddmm.data.DataPackage#getDataStructure()
 * @model
 * @generated
 */
public interface DataStructure extends ComplexType {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Implicit Constraints:
	 *     (C1) No cyclic inheritance, i.e., within an inheritance hierarchy, a data structure must
	 *          not occur twice.
	 *          Ensured by: DSL validator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(DataStructure)
	 * @see de.fhdo.ddmm.data.DataPackage#getDataStructure_Super()
	 * @model
	 * @generated
	 */
	DataStructure getSuper();

	/**
	 * Sets the value of the '{@link de.fhdo.ddmm.data.DataStructure#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(DataStructure value);

	/**
	 * Returns the value of the '<em><b>Data Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ddmm.data.DataField}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ddmm.data.DataField#getDataStructure <em>Data Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Fields</em>' containment reference list.
	 * @see de.fhdo.ddmm.data.DataPackage#getDataStructure_DataFields()
	 * @see de.fhdo.ddmm.data.DataField#getDataStructure
	 * @model opposite="dataStructure" containment="true"
	 * @generated
	 */
	EList<DataField> getDataFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Get the effective fields of the structure considering possible direct and indirect
	 * inheritance relationships
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<DataField> getEffectiveFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Check if this data structure is a direct or indirect extension of, i.e., if it inherits from,
	 * another data structure
	 * <!-- end-model-doc -->
	 * @model unique="false" structureUnique="false"
	 * @generated
	 */
	boolean isExtensionOf(DataStructure structure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Convenience methods to compare two data structures by field counts
	 * <!-- end-model-doc -->
	 * @model unique="false" structureToCompareUnique="false"
	 * @generated
	 */
	int compareFieldCounts(DataStructure structureToCompare);

} // DataStructure
