// Generated from D:/UltimateIDEA/VorPAL/src/main/java\KtParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KtParser}.
 */
public interface KtParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KtParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void enterKotlinFile(KtParser.KotlinFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#kotlinFile}.
	 * @param ctx the parse tree
	 */
	void exitKotlinFile(KtParser.KotlinFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(KtParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(KtParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterFileAnnotation(KtParser.FileAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#fileAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitFileAnnotation(KtParser.FileAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void enterPackageHeader(KtParser.PackageHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#packageHeader}.
	 * @param ctx the parse tree
	 */
	void exitPackageHeader(KtParser.PackageHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(KtParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(KtParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(KtParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(KtParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(KtParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(KtParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelObject(KtParser.TopLevelObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#topLevelObject}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelObject(KtParser.TopLevelObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(KtParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(KtParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryConstructor(KtParser.PrimaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#primaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryConstructor(KtParser.PrimaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void enterClassParameters(KtParser.ClassParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classParameters}.
	 * @param ctx the parse tree
	 */
	void exitClassParameters(KtParser.ClassParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void enterClassParameter(KtParser.ClassParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classParameter}.
	 * @param ctx the parse tree
	 */
	void exitClassParameter(KtParser.ClassParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifiers(KtParser.DelegationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifiers(KtParser.DelegationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegationSpecifier(KtParser.DelegationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegationSpecifier(KtParser.DelegationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterConstructorInvocation(KtParser.ConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#constructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitConstructorInvocation(KtParser.ConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDelegation(KtParser.ExplicitDelegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#explicitDelegation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDelegation(KtParser.ExplicitDelegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(KtParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(KtParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(KtParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(KtParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousInitializer(KtParser.AnonymousInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousInitializer(KtParser.AnonymousInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void enterSecondaryConstructor(KtParser.SecondaryConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 */
	void exitSecondaryConstructor(KtParser.SecondaryConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDelegationCall(KtParser.ConstructorDelegationCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDelegationCall(KtParser.ConstructorDelegationCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumClassBody(KtParser.EnumClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#enumClassBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumClassBody(KtParser.EnumClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntries(KtParser.EnumEntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#enumEntries}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntries(KtParser.EnumEntriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void enterEnumEntry(KtParser.EnumEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#enumEntry}.
	 * @param ctx the parse tree
	 */
	void exitEnumEntry(KtParser.EnumEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(KtParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(KtParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameters(KtParser.FunctionValueParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionValueParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameters(KtParser.FunctionValueParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValueParameter(KtParser.FunctionValueParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionValueParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValueParameter(KtParser.FunctionValueParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KtParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KtParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(KtParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(KtParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterObjectDeclaration(KtParser.ObjectDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#objectDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitObjectDeclaration(KtParser.ObjectDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void enterCompanionObject(KtParser.CompanionObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#companionObject}.
	 * @param ctx the parse tree
	 */
	void exitCompanionObject(KtParser.CompanionObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(KtParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(KtParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultiVariableDeclaration(KtParser.MultiVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultiVariableDeclaration(KtParser.MultiVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(KtParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(KtParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(KtParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(KtParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(KtParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(KtParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(KtParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(KtParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(KtParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(KtParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(KtParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(KtParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KtParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KtParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeModifierList(KtParser.TypeModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeModifierList(KtParser.TypeModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedType(KtParser.ParenthesizedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#parenthesizedType}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedType(KtParser.ParenthesizedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void enterNullableType(KtParser.NullableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#nullableType}.
	 * @param ctx the parse tree
	 */
	void exitNullableType(KtParser.NullableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(KtParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(KtParser.TypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(KtParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(KtParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionTypeReceiver}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeReceiver(KtParser.FunctionTypeReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionTypeReceiver}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeReceiver(KtParser.FunctionTypeReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#userType}.
	 * @param ctx the parse tree
	 */
	void enterUserType(KtParser.UserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#userType}.
	 * @param ctx the parse tree
	 */
	void exitUserType(KtParser.UserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleUserType(KtParser.SimpleUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#simpleUserType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleUserType(KtParser.SimpleUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameters(KtParser.FunctionTypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameters(KtParser.FunctionTypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraints(KtParser.TypeConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeConstraints}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraints(KtParser.TypeConstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstraint(KtParser.TypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstraint(KtParser.TypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(KtParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(KtParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(KtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(KtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KtParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KtParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KtParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KtParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KtParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KtParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(KtParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(KtParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(KtParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(KtParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(KtParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(KtParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(KtParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(KtParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperation(KtParser.InfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#infixOperation}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperation(KtParser.InfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void enterElvisExpression(KtParser.ElvisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#elvisExpression}.
	 * @param ctx the parse tree
	 */
	void exitElvisExpression(KtParser.ElvisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunctionCall(KtParser.InfixFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunctionCall(KtParser.InfixFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(KtParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(KtParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(KtParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(KtParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(KtParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(KtParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void enterAsExpression(KtParser.AsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#asExpression}.
	 * @param ctx the parse tree
	 */
	void exitAsExpression(KtParser.AsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#asExpressionTail}.
	 * @param ctx the parse tree
	 */
	void enterAsExpressionTail(KtParser.AsExpressionTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#asExpressionTail}.
	 * @param ctx the parse tree
	 */
	void exitAsExpressionTail(KtParser.AsExpressionTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryExpression(KtParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryExpression(KtParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryExpression(KtParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryExpression(KtParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(KtParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#callExpression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(KtParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#labeledExpression}.
	 * @param ctx the parse tree
	 */
	void enterLabeledExpression(KtParser.LabeledExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#labeledExpression}.
	 * @param ctx the parse tree
	 */
	void exitLabeledExpression(KtParser.LabeledExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#dotQualifiedExpression}.
	 * @param ctx the parse tree
	 */
	void enterDotQualifiedExpression(KtParser.DotQualifiedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#dotQualifiedExpression}.
	 * @param ctx the parse tree
	 */
	void exitDotQualifiedExpression(KtParser.DotQualifiedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignableExpression(KtParser.AssignableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#assignableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignableExpression(KtParser.AssignableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#indexingExpression}.
	 * @param ctx the parse tree
	 */
	void enterIndexingExpression(KtParser.IndexingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#indexingExpression}.
	 * @param ctx the parse tree
	 */
	void exitIndexingExpression(KtParser.IndexingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void enterCallSuffix(KtParser.CallSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#callSuffix}.
	 * @param ctx the parse tree
	 */
	void exitCallSuffix(KtParser.CallSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedLambda(KtParser.AnnotatedLambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#annotatedLambda}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedLambda(KtParser.AnnotatedLambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(KtParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(KtParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void enterValueArguments(KtParser.ValueArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#valueArguments}.
	 * @param ctx the parse tree
	 */
	void exitValueArguments(KtParser.ValueArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(KtParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(KtParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjection(KtParser.TypeProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeProjection}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjection(KtParser.TypeProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeProjectionModifierList(KtParser.TypeProjectionModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeProjectionModifierList(KtParser.TypeProjectionModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void enterValueArgument(KtParser.ValueArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#valueArgument}.
	 * @param ctx the parse tree
	 */
	void exitValueArgument(KtParser.ValueArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(KtParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(KtParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(KtParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(KtParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void enterLiteralConstant(KtParser.LiteralConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#literalConstant}.
	 * @param ctx the parse tree
	 */
	void exitLiteralConstant(KtParser.LiteralConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(KtParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(KtParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(KtParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(KtParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(KtParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(KtParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(KtParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(KtParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterLineStringExpression(KtParser.LineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#lineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitLineStringExpression(KtParser.LineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(KtParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(KtParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringExpression(KtParser.MultiLineStringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringExpression(KtParser.MultiLineStringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFunctionLiteral(KtParser.FunctionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFunctionLiteral(KtParser.FunctionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(KtParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(KtParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameter(KtParser.LambdaParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#lambdaParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameter(KtParser.LambdaParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(KtParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(KtParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteral(KtParser.CollectionLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#collectionLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteral(KtParser.CollectionLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(KtParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#thisExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(KtParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperExpression(KtParser.SuperExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#superExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperExpression(KtParser.SuperExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(KtParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(KtParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(KtParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(KtParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void enterControlStructureBody(KtParser.ControlStructureBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#controlStructureBody}.
	 * @param ctx the parse tree
	 */
	void exitControlStructureBody(KtParser.ControlStructureBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpression(KtParser.WhenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#whenExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpression(KtParser.WhenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void enterWhenEntry(KtParser.WhenEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#whenEntry}.
	 * @param ctx the parse tree
	 */
	void exitWhenEntry(KtParser.WhenEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(KtParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(KtParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void enterRangeTest(KtParser.RangeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#rangeTest}.
	 * @param ctx the parse tree
	 */
	void exitRangeTest(KtParser.RangeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void enterTypeTest(KtParser.TypeTestContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeTest}.
	 * @param ctx the parse tree
	 */
	void exitTypeTest(KtParser.TypeTestContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTryExpression(KtParser.TryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#tryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTryExpression(KtParser.TryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(KtParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(KtParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(KtParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(KtParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(KtParser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(KtParser.LoopExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(KtParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(KtParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpression(KtParser.WhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#whileExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpression(KtParser.WhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#doWhileExpression}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileExpression(KtParser.DoWhileExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#doWhileExpression}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileExpression(KtParser.DoWhileExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void enterJumpExpression(KtParser.JumpExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#jumpExpression}.
	 * @param ctx the parse tree
	 */
	void exitJumpExpression(KtParser.JumpExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void enterCallableReference(KtParser.CallableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#callableReference}.
	 * @param ctx the parse tree
	 */
	void exitCallableReference(KtParser.CallableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(KtParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(KtParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(KtParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(KtParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(KtParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(KtParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(KtParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#inOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(KtParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(KtParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#isOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(KtParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOperator(KtParser.AdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#additiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOperator(KtParser.AdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOperator(KtParser.MultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOperator(KtParser.MultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void enterAsOperator(KtParser.AsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#asOperator}.
	 * @param ctx the parse tree
	 */
	void exitAsOperator(KtParser.AsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnaryOperator(KtParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnaryOperator(KtParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixUnaryOperator(KtParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixUnaryOperator(KtParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOperator(KtParser.MemberAccessOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOperator(KtParser.MemberAccessOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(KtParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(KtParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(KtParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(KtParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(KtParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(KtParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void enterMemberModifier(KtParser.MemberModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#memberModifier}.
	 * @param ctx the parse tree
	 */
	void exitMemberModifier(KtParser.MemberModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityModifier(KtParser.VisibilityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#visibilityModifier}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityModifier(KtParser.VisibilityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterVarianceAnnotation(KtParser.VarianceAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitVarianceAnnotation(KtParser.VarianceAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionModifier(KtParser.FunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#functionModifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionModifier(KtParser.FunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(KtParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(KtParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceModifier(KtParser.InheritanceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceModifier(KtParser.InheritanceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterParameterModifier(KtParser.ParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#parameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitParameterModifier(KtParser.ParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(KtParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(KtParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(KtParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(KtParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(KtParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(KtParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(KtParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(KtParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationList(KtParser.AnnotationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#annotationList}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationList(KtParser.AnnotationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationUseSiteTarget(KtParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationUseSiteTarget(KtParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterUnescapedAnnotation(KtParser.UnescapedAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitUnescapedAnnotation(KtParser.UnescapedAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(KtParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(KtParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(KtParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(KtParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KtParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(KtParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link KtParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(KtParser.SemiContext ctx);
}