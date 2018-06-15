/*
 * generated by Xtext 2.12.0
 */
package org.xtext.selenium.eliedenis.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EDdslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Test");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProceduresAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProceduresProcedureParserRuleCall_0_0 = (RuleCall)cProceduresAssignment_0.eContents().get(0);
		private final Assignment cMainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMainMainProcedureParserRuleCall_1_0 = (RuleCall)cMainAssignment_1.eContents().get(0);
		
		//// Program
		//Test:
		//	procedures+=Procedure*
		//	main=MainProcedure;
		@Override public ParserRule getRule() { return rule; }
		
		//procedures+=Procedure* main=MainProcedure
		public Group getGroup() { return cGroup; }
		
		//procedures+=Procedure*
		public Assignment getProceduresAssignment_0() { return cProceduresAssignment_0; }
		
		//Procedure
		public RuleCall getProceduresProcedureParserRuleCall_0_0() { return cProceduresProcedureParserRuleCall_0_0; }
		
		//main=MainProcedure
		public Assignment getMainAssignment_1() { return cMainAssignment_1; }
		
		//MainProcedure
		public RuleCall getMainMainProcedureParserRuleCall_1_0() { return cMainMainProcedureParserRuleCall_1_0; }
	}
	public class ProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Procedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDENTIFIERTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cParametersAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_2_1_0_0 = (RuleCall)cParametersAssignment_2_1_0.eContents().get(0);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_2_1_1_0 = (RuleCall)cGroup_2_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0 = (RuleCall)cParametersAssignment_2_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInstructionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInstructionsInstructionParserRuleCall_4_0 = (RuleCall)cInstructionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Procedure:
		//	'def' Name=IDENTIFIER ('(' (Parameters+=IDENTIFIER (COMMA Parameters+=IDENTIFIER)*) ')')? '{'
		//	instructions+=Instruction*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'def' Name=IDENTIFIER ('(' (Parameters+=IDENTIFIER (COMMA Parameters+=IDENTIFIER)*) ')')? '{' instructions+=Instruction*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'def'
		public Keyword getDefKeyword_0() { return cDefKeyword_0; }
		
		//Name=IDENTIFIER
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//IDENTIFIER
		public RuleCall getNameIDENTIFIERTerminalRuleCall_1_0() { return cNameIDENTIFIERTerminalRuleCall_1_0; }
		
		//('(' (Parameters+=IDENTIFIER (COMMA Parameters+=IDENTIFIER)*) ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//Parameters+=IDENTIFIER (COMMA Parameters+=IDENTIFIER)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//Parameters+=IDENTIFIER
		public Assignment getParametersAssignment_2_1_0() { return cParametersAssignment_2_1_0; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_2_1_0_0() { return cParametersIDENTIFIERTerminalRuleCall_2_1_0_0; }
		
		//(COMMA Parameters+=IDENTIFIER)*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_2_1_1_0() { return cCOMMATerminalRuleCall_2_1_1_0; }
		
		//Parameters+=IDENTIFIER
		public Assignment getParametersAssignment_2_1_1_1() { return cParametersAssignment_2_1_1_1; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0() { return cParametersIDENTIFIERTerminalRuleCall_2_1_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_4() { return cInstructionsAssignment_4; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_4_0() { return cInstructionsInstructionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class MainProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.MainProcedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMainProcedureAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDefKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cMainKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInstructionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInstructionsInstructionParserRuleCall_4_0 = (RuleCall)cInstructionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//MainProcedure:
		//	{MainProcedure} 'def'+ 'main'+ '{'
		//	instructions+=Instruction*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{MainProcedure} 'def'+ 'main'+ '{' instructions+=Instruction* '}'
		public Group getGroup() { return cGroup; }
		
		//{MainProcedure}
		public Action getMainProcedureAction_0() { return cMainProcedureAction_0; }
		
		//'def'+
		public Keyword getDefKeyword_1() { return cDefKeyword_1; }
		
		//'main'+
		public Keyword getMainKeyword_2() { return cMainKeyword_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//instructions+=Instruction*
		public Assignment getInstructionsAssignment_4() { return cInstructionsAssignment_4; }
		
		//Instruction
		public RuleCall getInstructionsInstructionParserRuleCall_4_0() { return cInstructionsInstructionParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Instruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClickParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFillParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSelectParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTickParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNavigateParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cAssertParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cReadParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cCallProcedureParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		////Instruction is abstract
		//Instruction:
		//	Click | Fill | Select | Tick | Navigate | Assert | Read | CallProcedure;
		@Override public ParserRule getRule() { return rule; }
		
		//Click | Fill | Select | Tick | Navigate | Assert | Read | CallProcedure
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Click
		public RuleCall getClickParserRuleCall_0() { return cClickParserRuleCall_0; }
		
		//Fill
		public RuleCall getFillParserRuleCall_1() { return cFillParserRuleCall_1; }
		
		//Select
		public RuleCall getSelectParserRuleCall_2() { return cSelectParserRuleCall_2; }
		
		//Tick
		public RuleCall getTickParserRuleCall_3() { return cTickParserRuleCall_3; }
		
		//Navigate
		public RuleCall getNavigateParserRuleCall_4() { return cNavigateParserRuleCall_4; }
		
		//Assert
		public RuleCall getAssertParserRuleCall_5() { return cAssertParserRuleCall_5; }
		
		//Read
		public RuleCall getReadParserRuleCall_6() { return cReadParserRuleCall_6; }
		
		//CallProcedure
		public RuleCall getCallProcedureParserRuleCall_7() { return cCallProcedureParserRuleCall_7; }
	}
	public class ClickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Click");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTypeAlternatives_1_0 = (Alternatives)cTypeAssignment_1.eContents().get(0);
		private final Keyword cTypeInputKeyword_1_0_0 = (Keyword)cTypeAlternatives_1_0.eContents().get(0);
		private final Keyword cTypeLinkKeyword_1_0_1 = (Keyword)cTypeAlternatives_1_0.eContents().get(1);
		private final Keyword cTypeNameKeyword_1_0_2 = (Keyword)cTypeAlternatives_1_0.eContents().get(2);
		private final Keyword cTypeXpathKeyword_1_0_3 = (Keyword)cTypeAlternatives_1_0.eContents().get(3);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Click:
		//	'click' Type=('input' | 'link' | 'name' | 'xpath') Value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'click' Type=('input' | 'link' | 'name' | 'xpath') Value=STRING
		public Group getGroup() { return cGroup; }
		
		//'click'
		public Keyword getClickKeyword_0() { return cClickKeyword_0; }
		
		//Type=('input' | 'link' | 'name' | 'xpath')
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//('input' | 'link' | 'name' | 'xpath')
		public Alternatives getTypeAlternatives_1_0() { return cTypeAlternatives_1_0; }
		
		//'input'
		public Keyword getTypeInputKeyword_1_0_0() { return cTypeInputKeyword_1_0_0; }
		
		//'link'
		public Keyword getTypeLinkKeyword_1_0_1() { return cTypeLinkKeyword_1_0_1; }
		
		//'name'
		public Keyword getTypeNameKeyword_1_0_2() { return cTypeNameKeyword_1_0_2; }
		
		//'xpath'
		public Keyword getTypeXpathKeyword_1_0_3() { return cTypeXpathKeyword_1_0_3; }
		
		//Value=STRING
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0() { return cValueSTRINGTerminalRuleCall_2_0; }
	}
	public class FillElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Fill");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFillKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cValueAlternatives_2_0 = (Alternatives)cValueAssignment_2.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0_0 = (RuleCall)cValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_2_0_1 = (RuleCall)cValueAlternatives_2_0.eContents().get(1);
		
		//Fill:
		//	'fill' Name=STRING Value=(STRING | IDENTIFIER);
		@Override public ParserRule getRule() { return rule; }
		
		//'fill' Name=STRING Value=(STRING | IDENTIFIER)
		public Group getGroup() { return cGroup; }
		
		//'fill'
		public Keyword getFillKeyword_0() { return cFillKeyword_0; }
		
		//Name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//Value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_2_0() { return cValueAlternatives_2_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0_0() { return cValueSTRINGTerminalRuleCall_2_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_2_0_1() { return cValueIDENTIFIERTerminalRuleCall_2_0_1; }
	}
	public class SelectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Select");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSelectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cValueAlternatives_2_0 = (Alternatives)cValueAssignment_2.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_0_0 = (RuleCall)cValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_2_0_1 = (RuleCall)cValueAlternatives_2_0.eContents().get(1);
		
		//Select:
		//	'select' Name=STRING Value=(STRING | IDENTIFIER);
		@Override public ParserRule getRule() { return rule; }
		
		//'select' Name=STRING Value=(STRING | IDENTIFIER)
		public Group getGroup() { return cGroup; }
		
		//'select'
		public Keyword getSelectKeyword_0() { return cSelectKeyword_0; }
		
		//Name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//Value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_2_0() { return cValueAlternatives_2_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_0_0() { return cValueSTRINGTerminalRuleCall_2_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_2_0_1() { return cValueIDENTIFIERTerminalRuleCall_2_0_1; }
	}
	public class TickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Tick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Tick:
		//	'tick' Name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'tick' Name=STRING
		public Group getGroup() { return cGroup; }
		
		//'tick'
		public Keyword getTickKeyword_0() { return cTickKeyword_0; }
		
		//Name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class NavigateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Navigate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavigateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cUrlAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cUrlAlternatives_1_0 = (Alternatives)cUrlAssignment_1.eContents().get(0);
		private final RuleCall cUrlSTRINGTerminalRuleCall_1_0_0 = (RuleCall)cUrlAlternatives_1_0.eContents().get(0);
		private final RuleCall cUrlIDENTIFIERTerminalRuleCall_1_0_1 = (RuleCall)cUrlAlternatives_1_0.eContents().get(1);
		
		//Navigate:
		//	'navigate' url=(STRING | IDENTIFIER);
		@Override public ParserRule getRule() { return rule; }
		
		//'navigate' url=(STRING | IDENTIFIER)
		public Group getGroup() { return cGroup; }
		
		//'navigate'
		public Keyword getNavigateKeyword_0() { return cNavigateKeyword_0; }
		
		//url=(STRING | IDENTIFIER)
		public Assignment getUrlAssignment_1() { return cUrlAssignment_1; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getUrlAlternatives_1_0() { return cUrlAlternatives_1_0; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_1_0_0() { return cUrlSTRINGTerminalRuleCall_1_0_0; }
		
		//IDENTIFIER
		public RuleCall getUrlIDENTIFIERTerminalRuleCall_1_0_1() { return cUrlIDENTIFIERTerminalRuleCall_1_0_1; }
	}
	public class ReadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Read");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVariableAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVariableIDENTIFIERTerminalRuleCall_0_0 = (RuleCall)cVariableAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cReadKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Read:
		//	Variable=IDENTIFIER '=' 'read' Name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//Variable=IDENTIFIER '=' 'read' Name=STRING
		public Group getGroup() { return cGroup; }
		
		//Variable=IDENTIFIER
		public Assignment getVariableAssignment_0() { return cVariableAssignment_0; }
		
		//IDENTIFIER
		public RuleCall getVariableIDENTIFIERTerminalRuleCall_0_0() { return cVariableIDENTIFIERTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//'read'
		public Keyword getReadKeyword_2() { return cReadKeyword_2; }
		
		//Name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }
	}
	public class AssertElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.Assert");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final Alternatives cTypeAlternatives_1_0_0_0 = (Alternatives)cTypeAssignment_1_0_0.eContents().get(0);
		private final Keyword cTypeInputKeyword_1_0_0_0_0 = (Keyword)cTypeAlternatives_1_0_0_0.eContents().get(0);
		private final Keyword cTypeLinkKeyword_1_0_0_0_1 = (Keyword)cTypeAlternatives_1_0_0_0.eContents().get(1);
		private final Keyword cTypeNameKeyword_1_0_0_0_2 = (Keyword)cTypeAlternatives_1_0_0_0.eContents().get(2);
		private final Keyword cTypeXpathKeyword_1_0_0_0_3 = (Keyword)cTypeAlternatives_1_0_0_0.eContents().get(3);
		private final Group cGroup_1_0_1 = (Group)cGroup_1_0.eContents().get(1);
		private final Assignment cNameAssignment_1_0_1_0 = (Assignment)cGroup_1_0_1.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0_1_0_0 = (RuleCall)cNameAssignment_1_0_1_0.eContents().get(0);
		private final Assignment cMethodAssignment_1_0_1_1 = (Assignment)cGroup_1_0_1.eContents().get(1);
		private final Alternatives cMethodAlternatives_1_0_1_1_0 = (Alternatives)cMethodAssignment_1_0_1_1.eContents().get(0);
		private final Keyword cMethodContainsKeyword_1_0_1_1_0_0 = (Keyword)cMethodAlternatives_1_0_1_1_0.eContents().get(0);
		private final Keyword cMethodEqualsKeyword_1_0_1_1_0_1 = (Keyword)cMethodAlternatives_1_0_1_1_0.eContents().get(1);
		private final Assignment cValueAssignment_1_0_1_2 = (Assignment)cGroup_1_0_1.eContents().get(2);
		private final Alternatives cValueAlternatives_1_0_1_2_0 = (Alternatives)cValueAssignment_1_0_1_2.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0_1_2_0_0 = (RuleCall)cValueAlternatives_1_0_1_2_0.eContents().get(0);
		private final RuleCall cValueIDENTIFIERTerminalRuleCall_1_0_1_2_0_1 = (RuleCall)cValueAlternatives_1_0_1_2_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cTypeAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final Alternatives cTypeAlternatives_1_1_0_0 = (Alternatives)cTypeAssignment_1_1_0.eContents().get(0);
		private final Keyword cTypeInputKeyword_1_1_0_0_0 = (Keyword)cTypeAlternatives_1_1_0_0.eContents().get(0);
		private final Keyword cTypeLinkKeyword_1_1_0_0_1 = (Keyword)cTypeAlternatives_1_1_0_0.eContents().get(1);
		private final Keyword cTypeNameKeyword_1_1_0_0_2 = (Keyword)cTypeAlternatives_1_1_0_0.eContents().get(2);
		private final Keyword cTypeXpathKeyword_1_1_0_0_3 = (Keyword)cTypeAlternatives_1_1_0_0.eContents().get(3);
		private final Assignment cNameAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_1_1_0 = (RuleCall)cNameAssignment_1_1_1.eContents().get(0);
		private final Assignment cMethodAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final Keyword cMethodExistsKeyword_1_1_2_0 = (Keyword)cMethodAssignment_1_1_2.eContents().get(0);
		
		//Assert:
		//	'assert' (Type=('input' | 'link' | 'name' | 'xpath') (Name=STRING Method=('contains' | 'equals') Value=(STRING |
		//	IDENTIFIER)) | Type=('input' | 'link' | 'name' | 'xpath') Name=STRING Method='exists');
		@Override public ParserRule getRule() { return rule; }
		
		//'assert' (Type=('input' | 'link' | 'name' | 'xpath') (Name=STRING Method=('contains' | 'equals') Value=(STRING |
		//IDENTIFIER)) | Type=('input' | 'link' | 'name' | 'xpath') Name=STRING Method='exists')
		public Group getGroup() { return cGroup; }
		
		//'assert'
		public Keyword getAssertKeyword_0() { return cAssertKeyword_0; }
		
		//Type=('input' | 'link' | 'name' | 'xpath') (Name=STRING Method=('contains' | 'equals') Value=(STRING | IDENTIFIER)) |
		//Type=('input' | 'link' | 'name' | 'xpath') Name=STRING Method='exists'
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//Type=('input' | 'link' | 'name' | 'xpath') (Name=STRING Method=('contains' | 'equals') Value=(STRING | IDENTIFIER))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//Type=('input' | 'link' | 'name' | 'xpath')
		public Assignment getTypeAssignment_1_0_0() { return cTypeAssignment_1_0_0; }
		
		//('input' | 'link' | 'name' | 'xpath')
		public Alternatives getTypeAlternatives_1_0_0_0() { return cTypeAlternatives_1_0_0_0; }
		
		//'input'
		public Keyword getTypeInputKeyword_1_0_0_0_0() { return cTypeInputKeyword_1_0_0_0_0; }
		
		//'link'
		public Keyword getTypeLinkKeyword_1_0_0_0_1() { return cTypeLinkKeyword_1_0_0_0_1; }
		
		//'name'
		public Keyword getTypeNameKeyword_1_0_0_0_2() { return cTypeNameKeyword_1_0_0_0_2; }
		
		//'xpath'
		public Keyword getTypeXpathKeyword_1_0_0_0_3() { return cTypeXpathKeyword_1_0_0_0_3; }
		
		//Name=STRING Method=('contains' | 'equals') Value=(STRING | IDENTIFIER)
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//Name=STRING
		public Assignment getNameAssignment_1_0_1_0() { return cNameAssignment_1_0_1_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0_1_0_0() { return cNameSTRINGTerminalRuleCall_1_0_1_0_0; }
		
		//Method=('contains' | 'equals')
		public Assignment getMethodAssignment_1_0_1_1() { return cMethodAssignment_1_0_1_1; }
		
		//('contains' | 'equals')
		public Alternatives getMethodAlternatives_1_0_1_1_0() { return cMethodAlternatives_1_0_1_1_0; }
		
		//'contains'
		public Keyword getMethodContainsKeyword_1_0_1_1_0_0() { return cMethodContainsKeyword_1_0_1_1_0_0; }
		
		//'equals'
		public Keyword getMethodEqualsKeyword_1_0_1_1_0_1() { return cMethodEqualsKeyword_1_0_1_1_0_1; }
		
		//Value=(STRING | IDENTIFIER)
		public Assignment getValueAssignment_1_0_1_2() { return cValueAssignment_1_0_1_2; }
		
		//(STRING | IDENTIFIER)
		public Alternatives getValueAlternatives_1_0_1_2_0() { return cValueAlternatives_1_0_1_2_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0_1_2_0_0() { return cValueSTRINGTerminalRuleCall_1_0_1_2_0_0; }
		
		//IDENTIFIER
		public RuleCall getValueIDENTIFIERTerminalRuleCall_1_0_1_2_0_1() { return cValueIDENTIFIERTerminalRuleCall_1_0_1_2_0_1; }
		
		//Type=('input' | 'link' | 'name' | 'xpath') Name=STRING Method='exists'
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//Type=('input' | 'link' | 'name' | 'xpath')
		public Assignment getTypeAssignment_1_1_0() { return cTypeAssignment_1_1_0; }
		
		//('input' | 'link' | 'name' | 'xpath')
		public Alternatives getTypeAlternatives_1_1_0_0() { return cTypeAlternatives_1_1_0_0; }
		
		//'input'
		public Keyword getTypeInputKeyword_1_1_0_0_0() { return cTypeInputKeyword_1_1_0_0_0; }
		
		//'link'
		public Keyword getTypeLinkKeyword_1_1_0_0_1() { return cTypeLinkKeyword_1_1_0_0_1; }
		
		//'name'
		public Keyword getTypeNameKeyword_1_1_0_0_2() { return cTypeNameKeyword_1_1_0_0_2; }
		
		//'xpath'
		public Keyword getTypeXpathKeyword_1_1_0_0_3() { return cTypeXpathKeyword_1_1_0_0_3; }
		
		//Name=STRING
		public Assignment getNameAssignment_1_1_1() { return cNameAssignment_1_1_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_1_1_0() { return cNameSTRINGTerminalRuleCall_1_1_1_0; }
		
		//Method='exists'
		public Assignment getMethodAssignment_1_1_2() { return cMethodAssignment_1_1_2; }
		
		//'exists'
		public Keyword getMethodExistsKeyword_1_1_2_0() { return cMethodExistsKeyword_1_1_2_0; }
	}
	public class CallProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.CallProcedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProcedureNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProcedureNameIDENTIFIERTerminalRuleCall_0_0 = (RuleCall)cProcedureNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cParametersAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final Alternatives cParametersAlternatives_1_1_0_0 = (Alternatives)cParametersAssignment_1_1_0.eContents().get(0);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0 = (RuleCall)cParametersAlternatives_1_1_0_0.eContents().get(0);
		private final RuleCall cParametersSTRINGTerminalRuleCall_1_1_0_0_1 = (RuleCall)cParametersAlternatives_1_1_0_0.eContents().get(1);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final Assignment cParametersAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final Alternatives cParametersAlternatives_1_1_1_1_0 = (Alternatives)cParametersAssignment_1_1_1_1.eContents().get(0);
		private final RuleCall cParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0 = (RuleCall)cParametersAlternatives_1_1_1_1_0.eContents().get(0);
		private final RuleCall cParametersSTRINGTerminalRuleCall_1_1_1_1_0_1 = (RuleCall)cParametersAlternatives_1_1_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//CallProcedure:
		//	ProcedureName=IDENTIFIER ('(' (Parameters+=(IDENTIFIER | STRING) (COMMA Parameters+=(IDENTIFIER | STRING))*) ')')?;
		@Override public ParserRule getRule() { return rule; }
		
		//ProcedureName=IDENTIFIER ('(' (Parameters+=(IDENTIFIER | STRING) (COMMA Parameters+=(IDENTIFIER | STRING))*) ')')?
		public Group getGroup() { return cGroup; }
		
		//ProcedureName=IDENTIFIER
		public Assignment getProcedureNameAssignment_0() { return cProcedureNameAssignment_0; }
		
		//IDENTIFIER
		public RuleCall getProcedureNameIDENTIFIERTerminalRuleCall_0_0() { return cProcedureNameIDENTIFIERTerminalRuleCall_0_0; }
		
		//('(' (Parameters+=(IDENTIFIER | STRING) (COMMA Parameters+=(IDENTIFIER | STRING))*) ')')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Parameters+=(IDENTIFIER | STRING) (COMMA Parameters+=(IDENTIFIER | STRING))*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//Parameters+=(IDENTIFIER | STRING)
		public Assignment getParametersAssignment_1_1_0() { return cParametersAssignment_1_1_0; }
		
		//(IDENTIFIER | STRING)
		public Alternatives getParametersAlternatives_1_1_0_0() { return cParametersAlternatives_1_1_0_0; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0() { return cParametersIDENTIFIERTerminalRuleCall_1_1_0_0_0; }
		
		//STRING
		public RuleCall getParametersSTRINGTerminalRuleCall_1_1_0_0_1() { return cParametersSTRINGTerminalRuleCall_1_1_0_0_1; }
		
		//(COMMA Parameters+=(IDENTIFIER | STRING))*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1_0() { return cCOMMATerminalRuleCall_1_1_1_0; }
		
		//Parameters+=(IDENTIFIER | STRING)
		public Assignment getParametersAssignment_1_1_1_1() { return cParametersAssignment_1_1_1_1; }
		
		//(IDENTIFIER | STRING)
		public Alternatives getParametersAlternatives_1_1_1_1_0() { return cParametersAlternatives_1_1_1_1_0; }
		
		//IDENTIFIER
		public RuleCall getParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0() { return cParametersIDENTIFIERTerminalRuleCall_1_1_1_1_0_0; }
		
		//STRING
		public RuleCall getParametersSTRINGTerminalRuleCall_1_1_1_1_0_1() { return cParametersSTRINGTerminalRuleCall_1_1_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	
	
	private final TestElements pTest;
	private final ProcedureElements pProcedure;
	private final MainProcedureElements pMainProcedure;
	private final InstructionElements pInstruction;
	private final ClickElements pClick;
	private final FillElements pFill;
	private final SelectElements pSelect;
	private final TickElements pTick;
	private final NavigateElements pNavigate;
	private final ReadElements pRead;
	private final AssertElements pAssert;
	private final CallProcedureElements pCallProcedure;
	private final TerminalRule tIDENTIFIER;
	private final TerminalRule tCOMMA;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EDdslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTest = new TestElements();
		this.pProcedure = new ProcedureElements();
		this.pMainProcedure = new MainProcedureElements();
		this.pInstruction = new InstructionElements();
		this.pClick = new ClickElements();
		this.pFill = new FillElements();
		this.pSelect = new SelectElements();
		this.pTick = new TickElements();
		this.pNavigate = new NavigateElements();
		this.pRead = new ReadElements();
		this.pAssert = new AssertElements();
		this.pCallProcedure = new CallProcedureElements();
		this.tIDENTIFIER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.IDENTIFIER");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.selenium.eliedenis.EDdsl.COMMA");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.selenium.eliedenis.EDdsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// Program
	//Test:
	//	procedures+=Procedure*
	//	main=MainProcedure;
	public TestElements getTestAccess() {
		return pTest;
	}
	
	public ParserRule getTestRule() {
		return getTestAccess().getRule();
	}
	
	//Procedure:
	//	'def' Name=IDENTIFIER ('(' (Parameters+=IDENTIFIER (COMMA Parameters+=IDENTIFIER)*) ')')? '{'
	//	instructions+=Instruction*
	//	'}';
	public ProcedureElements getProcedureAccess() {
		return pProcedure;
	}
	
	public ParserRule getProcedureRule() {
		return getProcedureAccess().getRule();
	}
	
	//MainProcedure:
	//	{MainProcedure} 'def'+ 'main'+ '{'
	//	instructions+=Instruction*
	//	'}';
	public MainProcedureElements getMainProcedureAccess() {
		return pMainProcedure;
	}
	
	public ParserRule getMainProcedureRule() {
		return getMainProcedureAccess().getRule();
	}
	
	////Instruction is abstract
	//Instruction:
	//	Click | Fill | Select | Tick | Navigate | Assert | Read | CallProcedure;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Click:
	//	'click' Type=('input' | 'link' | 'name' | 'xpath') Value=STRING;
	public ClickElements getClickAccess() {
		return pClick;
	}
	
	public ParserRule getClickRule() {
		return getClickAccess().getRule();
	}
	
	//Fill:
	//	'fill' Name=STRING Value=(STRING | IDENTIFIER);
	public FillElements getFillAccess() {
		return pFill;
	}
	
	public ParserRule getFillRule() {
		return getFillAccess().getRule();
	}
	
	//Select:
	//	'select' Name=STRING Value=(STRING | IDENTIFIER);
	public SelectElements getSelectAccess() {
		return pSelect;
	}
	
	public ParserRule getSelectRule() {
		return getSelectAccess().getRule();
	}
	
	//Tick:
	//	'tick' Name=STRING;
	public TickElements getTickAccess() {
		return pTick;
	}
	
	public ParserRule getTickRule() {
		return getTickAccess().getRule();
	}
	
	//Navigate:
	//	'navigate' url=(STRING | IDENTIFIER);
	public NavigateElements getNavigateAccess() {
		return pNavigate;
	}
	
	public ParserRule getNavigateRule() {
		return getNavigateAccess().getRule();
	}
	
	//Read:
	//	Variable=IDENTIFIER '=' 'read' Name=STRING;
	public ReadElements getReadAccess() {
		return pRead;
	}
	
	public ParserRule getReadRule() {
		return getReadAccess().getRule();
	}
	
	//Assert:
	//	'assert' (Type=('input' | 'link' | 'name' | 'xpath') (Name=STRING Method=('contains' | 'equals') Value=(STRING |
	//	IDENTIFIER)) | Type=('input' | 'link' | 'name' | 'xpath') Name=STRING Method='exists');
	public AssertElements getAssertAccess() {
		return pAssert;
	}
	
	public ParserRule getAssertRule() {
		return getAssertAccess().getRule();
	}
	
	//CallProcedure:
	//	ProcedureName=IDENTIFIER ('(' (Parameters+=(IDENTIFIER | STRING) (COMMA Parameters+=(IDENTIFIER | STRING))*) ')')?;
	public CallProcedureElements getCallProcedureAccess() {
		return pCallProcedure;
	}
	
	public ParserRule getCallProcedureRule() {
		return getCallProcedureAccess().getRule();
	}
	
	//terminal IDENTIFIER:
	//	'^'? ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
	public TerminalRule getIDENTIFIERRule() {
		return tIDENTIFIER;
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
