/**
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.eDdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.selenium.eliedenis.eDdsl.Click;
import org.xtext.selenium.eliedenis.eDdsl.ClickableEnum;
import org.xtext.selenium.eliedenis.eDdsl.EDdslPackage;
import org.xtext.selenium.eliedenis.eDdsl.Parameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.impl.ClickImpl#getClickableElement <em>Clickable Element</em>}</li>
 *   <li>{@link org.xtext.selenium.eliedenis.eDdsl.impl.ClickImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClickImpl extends MinimalEObjectImpl.Container implements Click
{
  /**
   * The default value of the '{@link #getClickableElement() <em>Clickable Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickableElement()
   * @generated
   * @ordered
   */
  protected static final ClickableEnum CLICKABLE_ELEMENT_EDEFAULT = ClickableEnum.BUTTON;

  /**
   * The cached value of the '{@link #getClickableElement() <em>Clickable Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClickableElement()
   * @generated
   * @ordered
   */
  protected ClickableEnum clickableElement = CLICKABLE_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected Parameters parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClickImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EDdslPackage.Literals.CLICK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickableEnum getClickableElement()
  {
    return clickableElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClickableElement(ClickableEnum newClickableElement)
  {
    ClickableEnum oldClickableElement = clickableElement;
    clickableElement = newClickableElement == null ? CLICKABLE_ELEMENT_EDEFAULT : newClickableElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDdslPackage.CLICK__CLICKABLE_ELEMENT, oldClickableElement, clickableElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs)
  {
    Parameters oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EDdslPackage.CLICK__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(Parameters newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EDdslPackage.CLICK__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EDdslPackage.CLICK__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDdslPackage.CLICK__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EDdslPackage.CLICK__PARAMETERS:
        return basicSetParameters(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EDdslPackage.CLICK__CLICKABLE_ELEMENT:
        return getClickableElement();
      case EDdslPackage.CLICK__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EDdslPackage.CLICK__CLICKABLE_ELEMENT:
        setClickableElement((ClickableEnum)newValue);
        return;
      case EDdslPackage.CLICK__PARAMETERS:
        setParameters((Parameters)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EDdslPackage.CLICK__CLICKABLE_ELEMENT:
        setClickableElement(CLICKABLE_ELEMENT_EDEFAULT);
        return;
      case EDdslPackage.CLICK__PARAMETERS:
        setParameters((Parameters)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EDdslPackage.CLICK__CLICKABLE_ELEMENT:
        return clickableElement != CLICKABLE_ELEMENT_EDEFAULT;
      case EDdslPackage.CLICK__PARAMETERS:
        return parameters != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (clickableElement: ");
    result.append(clickableElement);
    result.append(')');
    return result.toString();
  }

} //ClickImpl
