/**
 * Copyright (C) 2016-2019 DSpot Sp. z o.o
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.com.dspot.archiannotations.handler;

import org.androidannotations.AndroidAnnotationsEnvironment;
import org.androidannotations.ElementValidation;
import org.androidannotations.handler.BaseAnnotationHandler;
import org.androidannotations.holder.EComponentHolder;

import javax.lang.model.element.Element;

public class ObserversLinkingHandler<T extends EComponentHolder> extends BaseAnnotationHandler<T> {

    public ObserversLinkingHandler(Class<?> targetClass, AndroidAnnotationsEnvironment environment) {
        super(targetClass, environment);
    }

    @Override
    protected void validate(Element element, ElementValidation validation) {
    }

    @Override
    public void process(Element element, EComponentHolder holder) {

//        //Determine the enhancedClass for the field
//        TypeMirror typeMirror = annotationHelper.extractAnnotationClassParameter(element);
//        if (typeMirror == null) {
//            typeMirror = element.asType();
//            typeMirror = getProcessingEnvironment().getTypeUtils().erasure(typeMirror);
//        }
//
//        String typeQualifiedName = typeMirror.toString();
//        AbstractJClass enhancedClass = getJClass(annotationHelper.generatedClassQualifiedNameFromQualifiedName(typeQualifiedName));
//
//        //Check Observable fields
//        final String generatedClassName = getGeneratedClassName(element, getEnvironment());
//        process(generatedClassName.substring(0, generatedClassName.length() - 1), element, enhancedClass, holder);

    }

//    protected boolean isViewPresenter(Element element) {
//
//        //Check if the class is a View Presenter
//        TypeMirror typeMirror = annotationHelper.extractAnnotationClassParameter(element);
//        if (typeMirror == null) {
//            typeMirror = element.asType();
//            typeMirror = getProcessingEnvironment().getTypeUtils().erasure(typeMirror);
//        }
//
//        String typeQualifiedName = typeMirror.toString();
//        String generatedClass = annotationHelper.generatedClassQualifiedNameFromQualifiedName(typeQualifiedName);
//        TypeElement generatorTypeElement = getProcessingEnvironment().getElementUtils().getTypeElement(
//                generatedClass.substring(0, generatedClass.length() - 1)
//        );
//
//        return adiHelper.hasAnnotation(generatorTypeElement, EViewPresenter.class);
//
//    }
//
//    protected void process(String generatorClassName, Element injectingElement, AbstractJClass injectingEnhancedClass, EComponentHolder injectingElementHolder) {
//        final IJExpression injectingField;
//        if (injectingElement.asType().toString().endsWith(ModelConstants.generationSuffix())) {
//            injectingField = ref(injectingElement.getSimpleName().toString());
//        } else {
//            injectingField = cast(injectingEnhancedClass, ref(injectingElement.getSimpleName().toString()));
//        }
//
//        linkObserversFrom(generatorClassName, injectingElement, injectingField, injectingEnhancedClass, injectingElementHolder);
//    }
//
//    private void linkObserversFrom(String generatorClassName, Element injectingElement, IJExpression injectingField,
//                                   AbstractJClass injectingEnhancedClass, EComponentHolder injectingElementHolder) {
//
//        TypeElement generatorTypeElement = getProcessingEnvironment().getElementUtils().getTypeElement(generatorClassName);
//        if (generatorTypeElement == null) return;
//        if (generatorTypeElement.getKind().equals(ElementKind.INTERFACE)) return;
//        if (generatorTypeElement.asType().toString().equals(Object.class.getCanonicalName())) return;
//
//        for (Element elem : generatorTypeElement.getEnclosedElements()) {
//
//            final String observableFieldName = elem.getSimpleName().toString();
//            String observableTypeName = elem.asType().toString();
//            if (observableTypeName.contains("<")) {
//                observableTypeName = observableTypeName.substring(observableTypeName.indexOf("<") + 1, observableTypeName.length() - 1);
//            }
//
//            if (adiHelper.hasAnnotation(elem, Observable.class)) {
//                performObservation(observableFieldName, observableTypeName, injectingElement, injectingField, injectingEnhancedClass, injectingElementHolder);
//            }
//
//        }
//
//        //Look for observers in the super classes
//        List<? extends TypeMirror> superTypes = getProcessingEnvironment().getTypeUtils().directSupertypes(generatorTypeElement.asType());
//        for (TypeMirror type : superTypes) {
//            type = getProcessingEnvironment().getTypeUtils().erasure(type);
//            linkObserversFrom(type.toString(), injectingElement, injectingField, injectingEnhancedClass, injectingElementHolder);
//        }
//
//    }
//
//    protected void performObservation(String observableFieldName, String observableTypeName, Element injectingElement,
//                                      IJExpression injectingField, AbstractJClass injectingEnhancedClass, EComponentHolder injectingElementHolder) {
//
//        final ObserverHolder observersHolder = injectingElementHolder.getPluginHolder(new ObserverHolder(injectingElementHolder));
//        final TypeElement rootElement = getRootElement(injectingElement);
//
//        final JInvocation observableGetterInvoke = invoke(injectingField, fieldToGetter(observableFieldName));
//
//        //Look for matching observer
//        for (Element elem : rootElement.getEnclosedElements()) {
//
//            if (adiHelper.hasAnnotation(elem, Observer.class)) {
//
//                final String observerMethodName = elem.getSimpleName().toString();
//
//                if (observerMethodName.equals(observableFieldName)) {
//
//                    //TODO ensure the parameters are the same type
//                    final ExecutableElement executableElem = (ExecutableElement) elem;
//                    final String observerGetterName = fieldToGetter(observerNameFor(executableElem, codeModelHelper));
//
//                    registerObserver(observableGetterInvoke, invoke(observerGetterName), injectingElement, injectingElementHolder);
//
//                    //Register the observers which could be removed in the removeObserver method
//                    if (!executableElem.getReturnType().toString().equals("void")) {
//                        JMethod method = observersHolder.getRemoveObserverMethod();
//
//                        JBlock removeObserverBlock = method.body()
//                                ._if(observersHolder.getRemoveObserverMethodParam().eq(invoke(observerGetterName)))._then();
//
//                        removeObserverBlock.add(observableGetterInvoke.invoke("removeObserver").arg(observersHolder.getRemoveObserverMethodParam()));
//                    }
//                }
//
//            }
//
//        }
//
//    }
//


}
