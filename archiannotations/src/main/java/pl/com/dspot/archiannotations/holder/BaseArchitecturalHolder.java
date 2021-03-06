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
package pl.com.dspot.archiannotations.holder;

import com.helger.jcodemodel.JFieldVar;
import com.helger.jcodemodel.JMethod;
import com.helger.jcodemodel.JVar;
import org.androidannotations.holder.EBeanHolder;
import org.androidannotations.holder.EComponentHolder;
import org.androidannotations.plugin.PluginClassHolder;

import static com.helger.jcodemodel.JMod.PRIVATE;
import static com.helger.jcodemodel.JMod.PUBLIC;

public class BaseArchitecturalHolder extends PluginClassHolder<EComponentHolder>  {

    public static String REBIND_NAME = "rebind";

    private JFieldVar rootViewField;
    private JMethod rebindMethod;

    private JMethod constructorMethod;

    public BaseArchitecturalHolder(EComponentHolder holder) {
        super(holder);
    }

    public JFieldVar getRootViewField() {
        if (rootViewField == null) {
            setRebind();
        }
        return rootViewField;
    }

    public JMethod getRebindMethod() {
        if (rebindMethod == null) {
            setRebind();
        }
        return rebindMethod;
    }

    public JMethod getConstructorMethod() {
        if (constructorMethod == null) {
            setConstructor();
        }
        return constructorMethod;
    }

    private void setRebind() {

//        //Create rootView field
//        rootViewField = holder().getGeneratedClass().field(PRIVATE, getClasses().OBJECT, "rootView_");
//
//        rebindMethod = holder().getGeneratedClass().method(PUBLIC, getCodeModel().VOID, REBIND_NAME);
//        JVar context = rebindMethod.param(getClasses().CONTEXT, "context");
//        JVar rootView = rebindMethod.param(getClasses().OBJECT, "rootView");
//
//        rebindMethod.body().assign(rootViewField, rootView);
//
//        if (holder() instanceof EBeanHolder) {
//            rebindMethod.body().invoke("rebind").arg(context);
//        }

    }

    private void setConstructor() {
        //Create a zero argument constructor
        constructorMethod = holder().getGeneratedClass().constructor(PUBLIC);
    }

}
