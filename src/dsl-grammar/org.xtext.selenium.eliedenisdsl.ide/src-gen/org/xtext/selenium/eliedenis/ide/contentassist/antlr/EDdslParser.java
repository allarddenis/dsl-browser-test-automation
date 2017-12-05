/*
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.selenium.eliedenis.ide.contentassist.antlr.internal.InternalEDdslParser;
import org.xtext.selenium.eliedenis.services.EDdslGrammarAccess;

public class EDdslParser extends AbstractContentAssistParser {

	@Inject
	private EDdslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEDdslParser createParser() {
		InternalEDdslParser result = new InternalEDdslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionNoReturnAccess().getAlternatives(), "rule__ActionNoReturn__Alternatives");
					put(grammarAccess.getActionReturnAccess().getAlternatives(), "rule__ActionReturn__Alternatives");
					put(grammarAccess.getActionBoolReturnAccess().getAlternatives(), "rule__ActionBoolReturn__Alternatives");
					put(grammarAccess.getCountAccess().getParametersAlternatives_1_0(), "rule__Count__ParametersAlternatives_1_0");
					put(grammarAccess.getParameterAccess().getParameterAlternatives_1_0(), "rule__Parameter__ParameterAlternatives_1_0");
					put(grammarAccess.getValAccess().getAlternatives(), "rule__Val__Alternatives");
					put(grammarAccess.getBoolEnumAccess().getAlternatives(), "rule__BoolEnum__Alternatives");
					put(grammarAccess.getBrowserEnumAccess().getAlternatives(), "rule__BrowserEnum__Alternatives");
					put(grammarAccess.getClickableEnumAccess().getAlternatives(), "rule__ClickableEnum__Alternatives");
					put(grammarAccess.getComparisonOperatorEnumAccess().getAlternatives(), "rule__ComparisonOperatorEnum__Alternatives");
					put(grammarAccess.getConstraintTypeEnumAccess().getAlternatives(), "rule__ConstraintTypeEnum__Alternatives");
					put(grammarAccess.getReadableEnumAccess().getAlternatives(), "rule__ReadableEnum__Alternatives");
					put(grammarAccess.getAllAccess().getGroup(), "rule__All__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getBrowseAccess().getGroup(), "rule__Browse__Group__0");
					put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getCountAccess().getGroup(), "rule__Count__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getReadAccess().getGroup(), "rule__Read__Group__0");
					put(grammarAccess.getSeriesAccess().getGroup(), "rule__Series__Group__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
					put(grammarAccess.getVariableSetAccess().getGroup(), "rule__VariableSet__Group__0");
					put(grammarAccess.getTestAccess().getTestsAssignment(), "rule__Test__TestsAssignment");
					put(grammarAccess.getAllAccess().getOperationAssignment_1(), "rule__All__OperationAssignment_1");
					put(grammarAccess.getAttributeAccess().getAttributeNameAssignment_1(), "rule__Attribute__AttributeNameAssignment_1");
					put(grammarAccess.getAttributeAccess().getAttributeValueAssignment_2(), "rule__Attribute__AttributeValueAssignment_2");
					put(grammarAccess.getBrowseAccess().getUrlAssignment_1(), "rule__Browse__UrlAssignment_1");
					put(grammarAccess.getCheckAccess().getActionAssignment_1(), "rule__Check__ActionAssignment_1");
					put(grammarAccess.getComparisonAccess().getFirstValAssignment_1(), "rule__Comparison__FirstValAssignment_1");
					put(grammarAccess.getComparisonAccess().getComparatorOperatorAssignment_2(), "rule__Comparison__ComparatorOperatorAssignment_2");
					put(grammarAccess.getComparisonAccess().getSecondValAssignment_3(), "rule__Comparison__SecondValAssignment_3");
					put(grammarAccess.getConstraintAccess().getReadableElementAssignment_0(), "rule__Constraint__ReadableElementAssignment_0");
					put(grammarAccess.getConstraintAccess().getConstraintTypeAssignment_1(), "rule__Constraint__ConstraintTypeAssignment_1");
					put(grammarAccess.getConstraintAccess().getExpectedValAssignment_2(), "rule__Constraint__ExpectedValAssignment_2");
					put(grammarAccess.getConstraintAccess().getParametersAssignment_3(), "rule__Constraint__ParametersAssignment_3");
					put(grammarAccess.getCountAccess().getParametersAssignment_1(), "rule__Count__ParametersAssignment_1");
					put(grammarAccess.getClickAccess().getClickableElementAssignment_1(), "rule__Click__ClickableElementAssignment_1");
					put(grammarAccess.getClickAccess().getParametersAssignment_2(), "rule__Click__ParametersAssignment_2");
					put(grammarAccess.getOperationAccess().getActionAssignment_0(), "rule__Operation__ActionAssignment_0");
					put(grammarAccess.getParameterAccess().getParameterAssignment_1(), "rule__Parameter__ParameterAssignment_1");
					put(grammarAccess.getParametersAccess().getParametersAssignment(), "rule__Parameters__ParametersAssignment");
					put(grammarAccess.getReadAccess().getReadableElementAssignment_1(), "rule__Read__ReadableElementAssignment_1");
					put(grammarAccess.getReadAccess().getParametersAssignment_2(), "rule__Read__ParametersAssignment_2");
					put(grammarAccess.getSeriesAccess().getBrowserAssignment_1(), "rule__Series__BrowserAssignment_1");
					put(grammarAccess.getSeriesAccess().getExpectedReturnAssignment_2(), "rule__Series__ExpectedReturnAssignment_2");
					put(grammarAccess.getSeriesAccess().getOperationsAssignment_4(), "rule__Series__OperationsAssignment_4");
					put(grammarAccess.getTypeAccess().getTextToTypeAssignment_1(), "rule__Type__TextToTypeAssignment_1");
					put(grammarAccess.getTypeAccess().getParametersAssignment_2(), "rule__Type__ParametersAssignment_2");
					put(grammarAccess.getValAccess().getBoolAssignment_2(), "rule__Val__BoolAssignment_2");
					put(grammarAccess.getValueAccess().getValueAssignment_1(), "rule__Value__ValueAssignment_1");
					put(grammarAccess.getVariableGetAccess().getVarNameAssignment(), "rule__VariableGet__VarNameAssignment");
					put(grammarAccess.getVariableSetAccess().getVarNameAssignment_0(), "rule__VariableSet__VarNameAssignment_0");
					put(grammarAccess.getVariableSetAccess().getActionAssignment_2(), "rule__VariableSet__ActionAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EDdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EDdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
