// Generated from gramatyka.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatykaParser}.
 */
public interface gramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(gramatykaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(gramatykaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(gramatykaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(gramatykaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(gramatykaParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(gramatykaParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(gramatykaParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(gramatykaParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(gramatykaParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(gramatykaParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(gramatykaParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(gramatykaParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(gramatykaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(gramatykaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(gramatykaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(gramatykaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(gramatykaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(gramatykaParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(gramatykaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(gramatykaParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(gramatykaParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(gramatykaParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(gramatykaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(gramatykaParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(gramatykaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(gramatykaParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(gramatykaParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(gramatykaParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(gramatykaParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(gramatykaParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(gramatykaParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(gramatykaParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(gramatykaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(gramatykaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(gramatykaParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(gramatykaParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(gramatykaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(gramatykaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(gramatykaParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(gramatykaParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(gramatykaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(gramatykaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(gramatykaParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(gramatykaParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(gramatykaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(gramatykaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(gramatykaParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(gramatykaParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(gramatykaParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(gramatykaParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(gramatykaParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(gramatykaParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(gramatykaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(gramatykaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(gramatykaParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(gramatykaParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(gramatykaParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(gramatykaParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(gramatykaParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(gramatykaParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(gramatykaParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(gramatykaParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(gramatykaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(gramatykaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(gramatykaParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(gramatykaParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(gramatykaParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(gramatykaParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(gramatykaParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(gramatykaParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(gramatykaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(gramatykaParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(gramatykaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(gramatykaParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(gramatykaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(gramatykaParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(gramatykaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(gramatykaParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(gramatykaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(gramatykaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(gramatykaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(gramatykaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(gramatykaParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(gramatykaParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(gramatykaParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(gramatykaParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(gramatykaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(gramatykaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(gramatykaParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(gramatykaParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(gramatykaParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(gramatykaParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(gramatykaParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(gramatykaParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(gramatykaParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(gramatykaParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(gramatykaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(gramatykaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(gramatykaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(gramatykaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(gramatykaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(gramatykaParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(gramatykaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(gramatykaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(gramatykaParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(gramatykaParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(gramatykaParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(gramatykaParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(gramatykaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(gramatykaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(gramatykaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(gramatykaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(gramatykaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(gramatykaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(gramatykaParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(gramatykaParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(gramatykaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(gramatykaParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(gramatykaParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(gramatykaParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(gramatykaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(gramatykaParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(gramatykaParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(gramatykaParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(gramatykaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(gramatykaParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(gramatykaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(gramatykaParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(gramatykaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(gramatykaParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(gramatykaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(gramatykaParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(gramatykaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(gramatykaParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(gramatykaParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(gramatykaParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(gramatykaParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(gramatykaParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gramatykaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gramatykaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(gramatykaParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(gramatykaParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(gramatykaParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(gramatykaParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(gramatykaParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(gramatykaParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(gramatykaParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(gramatykaParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(gramatykaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(gramatykaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(gramatykaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(gramatykaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(gramatykaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(gramatykaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(gramatykaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(gramatykaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(gramatykaParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(gramatykaParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(gramatykaParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(gramatykaParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(gramatykaParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(gramatykaParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(gramatykaParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(gramatykaParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(gramatykaParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(gramatykaParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(gramatykaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(gramatykaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(gramatykaParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(gramatykaParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(gramatykaParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(gramatykaParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(gramatykaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(gramatykaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(gramatykaParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(gramatykaParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(gramatykaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(gramatykaParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(gramatykaParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(gramatykaParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(gramatykaParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(gramatykaParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(gramatykaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(gramatykaParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(gramatykaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(gramatykaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(gramatykaParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(gramatykaParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(gramatykaParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(gramatykaParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(gramatykaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(gramatykaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(gramatykaParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(gramatykaParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(gramatykaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(gramatykaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(gramatykaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(gramatykaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(gramatykaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(gramatykaParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(gramatykaParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(gramatykaParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(gramatykaParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(gramatykaParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(gramatykaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(gramatykaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(gramatykaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(gramatykaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(gramatykaParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(gramatykaParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(gramatykaParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(gramatykaParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(gramatykaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(gramatykaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(gramatykaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(gramatykaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(gramatykaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(gramatykaParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(gramatykaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(gramatykaParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(gramatykaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(gramatykaParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(gramatykaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(gramatykaParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(gramatykaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(gramatykaParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(gramatykaParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(gramatykaParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(gramatykaParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(gramatykaParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(gramatykaParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(gramatykaParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(gramatykaParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(gramatykaParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(gramatykaParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(gramatykaParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(gramatykaParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(gramatykaParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(gramatykaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(gramatykaParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(gramatykaParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(gramatykaParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(gramatykaParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(gramatykaParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(gramatykaParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(gramatykaParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(gramatykaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(gramatykaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(gramatykaParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(gramatykaParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gramatykaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gramatykaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(gramatykaParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(gramatykaParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(gramatykaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(gramatykaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(gramatykaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(gramatykaParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(gramatykaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(gramatykaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramatykaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramatykaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(gramatykaParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(gramatykaParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(gramatykaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(gramatykaParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(gramatykaParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(gramatykaParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(gramatykaParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(gramatykaParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(gramatykaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(gramatykaParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(gramatykaParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(gramatykaParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(gramatykaParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(gramatykaParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(gramatykaParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(gramatykaParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(gramatykaParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(gramatykaParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(gramatykaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(gramatykaParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(gramatykaParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(gramatykaParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(gramatykaParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(gramatykaParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(gramatykaParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(gramatykaParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(gramatykaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(gramatykaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(gramatykaParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(gramatykaParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(gramatykaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(gramatykaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(gramatykaParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(gramatykaParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gramatykaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gramatykaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(gramatykaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(gramatykaParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(gramatykaParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(gramatykaParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gramatykaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gramatykaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(gramatykaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(gramatykaParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(gramatykaParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(gramatykaParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(gramatykaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(gramatykaParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(gramatykaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(gramatykaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(gramatykaParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(gramatykaParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(gramatykaParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(gramatykaParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(gramatykaParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(gramatykaParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(gramatykaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(gramatykaParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(gramatykaParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(gramatykaParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(gramatykaParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(gramatykaParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(gramatykaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(gramatykaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(gramatykaParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(gramatykaParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(gramatykaParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(gramatykaParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(gramatykaParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(gramatykaParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(gramatykaParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(gramatykaParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(gramatykaParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(gramatykaParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(gramatykaParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(gramatykaParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(gramatykaParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(gramatykaParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(gramatykaParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(gramatykaParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(gramatykaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(gramatykaParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(gramatykaParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(gramatykaParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(gramatykaParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(gramatykaParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(gramatykaParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(gramatykaParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(gramatykaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(gramatykaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(gramatykaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(gramatykaParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(gramatykaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(gramatykaParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(gramatykaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(gramatykaParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(gramatykaParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(gramatykaParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(gramatykaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(gramatykaParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(gramatykaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(gramatykaParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(gramatykaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(gramatykaParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(gramatykaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(gramatykaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(gramatykaParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(gramatykaParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(gramatykaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(gramatykaParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(gramatykaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(gramatykaParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(gramatykaParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(gramatykaParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(gramatykaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(gramatykaParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(gramatykaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(gramatykaParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(gramatykaParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(gramatykaParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(gramatykaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(gramatykaParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(gramatykaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(gramatykaParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(gramatykaParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(gramatykaParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(gramatykaParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(gramatykaParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(gramatykaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(gramatykaParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(gramatykaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(gramatykaParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(gramatykaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(gramatykaParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(gramatykaParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(gramatykaParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(gramatykaParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(gramatykaParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(gramatykaParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(gramatykaParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramatykaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(gramatykaParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(gramatykaParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(gramatykaParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(gramatykaParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(gramatykaParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(gramatykaParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(gramatykaParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(gramatykaParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(gramatykaParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(gramatykaParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gramatykaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gramatykaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(gramatykaParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(gramatykaParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(gramatykaParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(gramatykaParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(gramatykaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(gramatykaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(gramatykaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(gramatykaParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(gramatykaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(gramatykaParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(gramatykaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(gramatykaParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(gramatykaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(gramatykaParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(gramatykaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(gramatykaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(gramatykaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(gramatykaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(gramatykaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(gramatykaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(gramatykaParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(gramatykaParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(gramatykaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(gramatykaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(gramatykaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(gramatykaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(gramatykaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(gramatykaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(gramatykaParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(gramatykaParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(gramatykaParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(gramatykaParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(gramatykaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(gramatykaParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(gramatykaParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(gramatykaParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(gramatykaParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(gramatykaParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(gramatykaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(gramatykaParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(gramatykaParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(gramatykaParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(gramatykaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(gramatykaParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatykaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(gramatykaParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatykaParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(gramatykaParser.CastExpressionContext ctx);
}