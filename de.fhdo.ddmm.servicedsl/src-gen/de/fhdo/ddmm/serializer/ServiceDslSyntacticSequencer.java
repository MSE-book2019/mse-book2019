/*
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm.serializer;

import com.google.inject.Inject;
import de.fhdo.ddmm.services.ServiceDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ServiceDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ServiceDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_OperationAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__;
	protected AbstractElementAlias match_ServiceAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_3__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ServiceDslGrammarAccess) access;
		match_OperationAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getRightCurlyBracketKeyword_5_0_2())), new TokenAlias(false, false, grammarAccess.getOperationAspectAccess().getSemicolonKeyword_5_1()));
		match_ServiceAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getLeftCurlyBracketKeyword_5_0_0()), new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getRightCurlyBracketKeyword_5_0_3())), new TokenAlias(false, false, grammarAccess.getServiceAspectAccess().getSemicolonKeyword_5_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_OperationAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__.equals(syntax))
				emit_OperationAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ServiceAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_3__.equals(syntax))
				emit_ServiceAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     joinPoints+=OperationJoinPointType (ambiguity) (rule end)
	 */
	protected void emit_OperationAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ';'
	 *
	 * This ambiguous syntax occurs at:
	 *     joinPoints+=ServiceJoinPointType (ambiguity) (rule end)
	 */
	protected void emit_ServiceAspect_SemicolonKeyword_5_1_or___LeftCurlyBracketKeyword_5_0_0_RightCurlyBracketKeyword_5_0_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
