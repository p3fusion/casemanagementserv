/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.presolved.casemanagement.workflow.demo;

import java.util.Map;
import org.kie.kogito.UserTask;

@UserTask(taskName = "Questionnaire", processName = "serviceCase")
public class ServiceCase_14_TaskInput {

    public static ServiceCase_14_TaskInput fromMap(Map<String, Object> params) {
        ServiceCase_14_TaskInput item = new ServiceCase_14_TaskInput();
        return item;
    }
}
// Task input for user task 'Questionnaire' in process 'serviceCase'
