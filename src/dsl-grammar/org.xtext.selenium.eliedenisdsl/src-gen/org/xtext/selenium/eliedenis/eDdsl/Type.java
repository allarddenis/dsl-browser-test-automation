/**
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.eDdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.Type#getTextToType <em>Text To Type</em>}</li>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.Type#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Text To Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text To Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text To Type</em>' containment reference.
   * @see #setTextToType(Val)
   * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getType_TextToType()
   * @model containment="true"
   * @generated
   */
  Val getTextToType();

  /**
   * Sets the value of the '{@link org.xtext.selenium.eliedenis.eDdsl.Type#getTextToType <em>Text To Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text To Type</em>' containment reference.
   * @see #getTextToType()
   * @generated
   */
  void setTextToType(Val value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameters)
   * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getType_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameters getParameters();

  /**
   * Sets the value of the '{@link org.xtext.selenium.eliedenis.eDdsl.Type#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameters value);

} // Type
