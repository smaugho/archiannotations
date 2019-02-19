/**
 * Copyright (C) 2018-2019 DSpot Sp. z o.o
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
package pl.com.dspot.archiannotations.viewmodel;

import android.arch.lifecycle.ViewModel;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;

import pl.com.dspot.archiannotations.annotation.EViewModel;

@EViewModel
public class SomeViewModel extends ViewModel {

    @Bean
    SomeBean someBean;

    @AfterInject
    void afterInject() {

    }

}
