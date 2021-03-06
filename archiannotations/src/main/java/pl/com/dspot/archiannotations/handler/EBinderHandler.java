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
import org.androidannotations.holder.EComponentWithViewSupportHolder;
import pl.com.dspot.archiannotations.annotation.EBinder;
import pl.com.dspot.archiannotations.holder.BinderHolder;

import javax.lang.model.element.Element;

public class EBinderHandler extends BaseAnnotationHandler<EComponentWithViewSupportHolder> {

    public EBinderHandler(AndroidAnnotationsEnvironment environment) {
        super(EBinder.class.getCanonicalName(), environment);
    }

    @Override
    public void validate(Element element, ElementValidation valid) {

    }

    @Override
    public void process(Element element, EComponentWithViewSupportHolder holder) {

        BinderHolder binderHolder = holder.getPluginHolder(new BinderHolder(holder));

        binderHolder.exploreObservablesAndBindingMethods();

        binderHolder.performObservations();

    }

}
