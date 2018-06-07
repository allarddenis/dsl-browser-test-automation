/**
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.eDdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getFirstVal <em>First Val</em>}</li>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getComparatorOperator <em>Comparator Operator</em>}</li>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getSecondVal <em>Second Val</em>}</li>
 * </ul>
 *
 * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends ActionBoolReturn
{
  /**
   * Returns the value of the '<em><b>First Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Val</em>' containment reference.
   * @see #setFirstVal(Val)
   * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getComparison_FirstVal()
   * @model containment="true"
   * @generated
   */
  Val getFirstVal();

  /**
   * Sets the value of the '{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getFirstVal <em>First Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Val</em>' containment reference.
   * @see #getFirstVal()
   * @generated
   */
  void setFirstVal(Val value);

  /**
   * Returns the value of the '<em><b>Comparator Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.selenium.eliedenis.eDdsl.ComparisonOperatorEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comparator Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparator Operator</em>' attribute.
   * @see org.xtext.selenium.eliedenis.eDdsl.ComparisonOperatorEnum
   * @see #setComparatorOperator(ComparisonOperatorEnum)
   * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getComparison_ComparatorOperator()
   * @model
   * @generated
   */
  ComparisonOperatorEnum getComparatorOperator();

  /**
   * Sets the value of the '{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getComparatorOperator <em>Comparator Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparator Operator</em>' attribute.
   * @see org.xtext.selenium.eliedenis.eDdsl.ComparisonOperatorEnum
   * @see #getComparatorOperator()
   * @generated
   */
  void setComparatorOperator(ComparisonOperatorEnum value);

  /**
   * Returns the value of the '<em><b>Second Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Val</em>' containment reference.
   * @see #setSecondVal(Val)
   * @see org.xtext.selenium.eliedenis.eDdsl.EDdslPackage#getComparison_SecondVal()
   * @model containment="true"
   * @generated
   */
  Val getSecondVal();

  /**
   * Sets the value of the '{@link org.xtext.selenium.eliedenis.eDdsl.Comparison#getSecondVal <em>Second Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Val</em>' containment reference.
   * @see #getSecondVal()
   * @generated
   */
  void setSecondVal(Val value);

} // Comparison