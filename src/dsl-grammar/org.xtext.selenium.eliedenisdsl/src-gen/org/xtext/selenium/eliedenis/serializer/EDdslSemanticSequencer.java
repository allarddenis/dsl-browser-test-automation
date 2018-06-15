/*
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.selenium.eliedenis.eDdsl.Assert;
import org.xtext.selenium.eliedenis.eDdsl.CallProcedure;
import org.xtext.selenium.eliedenis.eDdsl.Click;
import org.xtext.selenium.eliedenis.eDdsl.EDdslPackage;
import org.xtext.selenium.eliedenis.eDdsl.Fill;
import org.xtext.selenium.eliedenis.eDdsl.MainProcedure;
import org.xtext.selenium.eliedenis.eDdsl.Navigate;
import org.xtext.selenium.eliedenis.eDdsl.Procedure;
import org.xtext.selenium.eliedenis.eDdsl.Read;
import org.xtext.selenium.eliedenis.eDdsl.Select;
import org.xtext.selenium.eliedenis.eDdsl.Test;
import org.xtext.selenium.eliedenis.eDdsl.Tick;
import org.xtext.selenium.eliedenis.services.EDdslGrammarAccess;

@SuppressWarnings("all")
public class EDdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EDdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EDdslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EDdslPackage.ASSERT:
				sequence_Assert(context, (Assert) semanticObject); 
				return; 
			case EDdslPackage.CALL_PROCEDURE:
				sequence_CallProcedure(context, (CallProcedure) semanticObject); 
				return; 
			case EDdslPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case EDdslPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case EDdslPackage.MAIN_PROCEDURE:
				sequence_MainProcedure(context, (MainProcedure) semanticObject); 
				return; 
			case EDdslPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case EDdslPackage.PROCEDURE:
				sequence_Procedure(context, (Procedure) semanticObject); 
				return; 
			case EDdslPackage.READ:
				sequence_Read(context, (Read) semanticObject); 
				return; 
			case EDdslPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case EDdslPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case EDdslPackage.TICK:
				sequence_Tick(context, (Tick) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instruction returns Assert
	 *     Assert returns Assert
	 *
	 * Constraint:
	 *     (
	 *         ((Type='input' | Type='link' | Type='name' | Type='xpath') Name=STRING (Method='contains' | Method='equals') (Value=STRING | Value=IDENTIFIER)) | 
	 *         ((Type='input' | Type='link' | Type='name' | Type='xpath') Name=STRING Method='exists')
	 *     )
	 */
	protected void sequence_Assert(ISerializationContext context, Assert semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns CallProcedure
	 *     CallProcedure returns CallProcedure
	 *
	 * Constraint:
	 *     (
	 *         ProcedureName=IDENTIFIER 
	 *         ((Parameters+=IDENTIFIER | Parameters+=STRING) Parameters+=IDENTIFIER? (Parameters+=STRING? Parameters+=IDENTIFIER?)*)?
	 *     )
	 */
	protected void sequence_CallProcedure(ISerializationContext context, CallProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     ((Type='input' | Type='link' | Type='name' | Type='xpath') Value=STRING)
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (Name=STRING (Value=STRING | Value=IDENTIFIER))
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainProcedure returns MainProcedure
	 *
	 * Constraint:
	 *     instructions+=Instruction*
	 */
	protected void sequence_MainProcedure(ISerializationContext context, MainProcedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Navigate
	 *     Navigate returns Navigate
	 *
	 * Constraint:
	 *     (url=STRING | url=IDENTIFIER)
	 */
	protected void sequence_Navigate(ISerializationContext context, Navigate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Procedure returns Procedure
	 *
	 * Constraint:
	 *     (Name=IDENTIFIER (Parameters+=IDENTIFIER Parameters+=IDENTIFIER*)? instructions+=Instruction*)
	 */
	protected void sequence_Procedure(ISerializationContext context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Read
	 *     Read returns Read
	 *
	 * Constraint:
	 *     (Variable=IDENTIFIER Name=STRING)
	 */
	protected void sequence_Read(ISerializationContext context, Read semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EDdslPackage.Literals.READ__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EDdslPackage.Literals.READ__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, EDdslPackage.Literals.READ__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EDdslPackage.Literals.READ__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReadAccess().getVariableIDENTIFIERTerminalRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getReadAccess().getNameSTRINGTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     (Name=STRING (Value=STRING | Value=IDENTIFIER))
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (procedures+=Procedure* main=MainProcedure)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Tick
	 *     Tick returns Tick
	 *
	 * Constraint:
	 *     Name=STRING
	 */
	protected void sequence_Tick(ISerializationContext context, Tick semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EDdslPackage.Literals.TICK__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EDdslPackage.Literals.TICK__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTickAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
