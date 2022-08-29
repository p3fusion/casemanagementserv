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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "ReceiveSupportComment", processName = "serviceCase")
public class ServiceCase_17_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("comment", this.comment);
        return params;
    }

    public static ServiceCase_17_TaskOutput fromMap(Map<String, Object> params) {
        com.presolved.casemanagement.workflow.demo.ServiceCase_17_TaskOutput result = new ServiceCase_17_TaskOutput();
        result.comment = (java.lang.String) params.get("comment");
        return result;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private java.lang.String comment;

    public java.lang.String getComment() {
        return comment;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }
}
// Task output for user task 'Receive support comment' in process 'serviceCase'
