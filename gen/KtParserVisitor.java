// Generated from D:/UltimateIDEA/VorPAL/src/main/java\KtParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KtParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KtParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KtParser#kotlinFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKotlinFile(KtParser.KotlinFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(KtParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#fileAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAnnotation(KtParser.FileAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(KtParser.PackageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#importList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportList(KtParser.ImportListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#importHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportHeader(KtParser.ImportHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(KtParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#topLevelObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelObject(KtParser.TopLevelObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(KtParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(KtParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameters(KtParser.ClassParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassParameter(KtParser.ClassParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#delegationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifiers(KtParser.DelegationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#delegationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegationSpecifier(KtParser.DelegationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#constructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorInvocation(KtParser.ConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#explicitDelegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitDelegation(KtParser.ExplicitDelegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(KtParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(KtParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#anonymousInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousInitializer(KtParser.AnonymousInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#secondaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryConstructor(KtParser.SecondaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#constructorDelegationCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDelegationCall(KtParser.ConstructorDelegationCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#enumClassBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumClassBody(KtParser.EnumClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#enumEntries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntries(KtParser.EnumEntriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#enumEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumEntry(KtParser.EnumEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(KtParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionValueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameters(KtParser.FunctionValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionValueParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionValueParameter(KtParser.FunctionValueParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KtParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(KtParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#objectDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclaration(KtParser.ObjectDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#companionObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompanionObject(KtParser.CompanionObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(KtParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiVariableDeclaration(KtParser.MultiVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(KtParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(KtParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(KtParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(KtParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(KtParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(KtParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KtParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeModifierList(KtParser.TypeModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#parenthesizedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedType(KtParser.ParenthesizedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#nullableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullableType(KtParser.NullableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(KtParser.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(KtParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionTypeReceiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeReceiver(KtParser.FunctionTypeReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#userType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserType(KtParser.UserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#simpleUserType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleUserType(KtParser.SimpleUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionTypeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTypeParameters(KtParser.FunctionTypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeConstraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraints(KtParser.TypeConstraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstraint(KtParser.TypeConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KtParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(KtParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KtParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(KtParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KtParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KtParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(KtParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(KtParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(KtParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(KtParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(KtParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(KtParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#infixFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunctionCall(KtParser.InfixFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(KtParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(KtParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(KtParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#asExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpression(KtParser.AsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#asExpressionTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsExpressionTail(KtParser.AsExpressionTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(KtParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(KtParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#callExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(KtParser.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#labeledExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledExpression(KtParser.LabeledExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#dotQualifiedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotQualifiedExpression(KtParser.DotQualifiedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#assignableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignableExpression(KtParser.AssignableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#indexingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingExpression(KtParser.IndexingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(KtParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#annotatedLambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedLambda(KtParser.AnnotatedLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(KtParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#valueArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArguments(KtParser.ValueArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(KtParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeProjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjection(KtParser.TypeProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeProjectionModifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeProjectionModifierList(KtParser.TypeProjectionModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#valueArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueArgument(KtParser.ValueArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(KtParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(KtParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#literalConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralConstant(KtParser.LiteralConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(KtParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringLiteral(KtParser.LineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringLiteral(KtParser.MultiLineStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#lineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringContent(KtParser.LineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#lineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineStringExpression(KtParser.LineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringContent(KtParser.MultiLineStringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiLineStringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineStringExpression(KtParser.MultiLineStringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionLiteral(KtParser.FunctionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(KtParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(KtParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(KtParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#collectionLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionLiteral(KtParser.CollectionLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(KtParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#superExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperExpression(KtParser.SuperExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(KtParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(KtParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#controlStructureBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStructureBody(KtParser.ControlStructureBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(KtParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#whenEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenEntry(KtParser.WhenEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(KtParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#rangeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeTest(KtParser.RangeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(KtParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#tryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpression(KtParser.TryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(KtParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(KtParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#loopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExpression(KtParser.LoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(KtParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#whileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpression(KtParser.WhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#doWhileExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileExpression(KtParser.DoWhileExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#jumpExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpExpression(KtParser.JumpExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#callableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallableReference(KtParser.CallableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(KtParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(KtParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(KtParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(KtParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(KtParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(KtParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(KtParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#asOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsOperator(KtParser.AsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#prefixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryOperator(KtParser.PrefixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#postfixUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryOperator(KtParser.PostfixUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#memberAccessOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOperator(KtParser.MemberAccessOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#modifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifierList(KtParser.ModifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(KtParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(KtParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#memberModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberModifier(KtParser.MemberModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(KtParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#varianceAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarianceAnnotation(KtParser.VarianceAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#functionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionModifier(KtParser.FunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(KtParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#inheritanceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritanceModifier(KtParser.InheritanceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#parameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterModifier(KtParser.ParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(KtParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(KtParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(KtParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(KtParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#annotationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationList(KtParser.AnnotationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#annotationUseSiteTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationUseSiteTarget(KtParser.AnnotationUseSiteTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#unescapedAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnescapedAnnotation(KtParser.UnescapedAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(KtParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIdentifier(KtParser.SimpleIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KtParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(KtParser.SemiContext ctx);
}