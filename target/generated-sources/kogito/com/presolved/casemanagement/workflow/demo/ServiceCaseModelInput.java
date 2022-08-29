/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "serviceCase", name = "ServiceCase", hidden = true)
@ProcessInput(processName = "serviceCase")
public class ServiceCaseModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<ServiceCaseModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "supportCase")
    @javax.validation.Valid()
    private com.presolved.casemanagement.workflow.demo.model.SupportCase supportCase;

    public com.presolved.casemanagement.workflow.demo.model.SupportCase getSupportCase() {
        return supportCase;
    }

    public void setSupportCase(com.presolved.casemanagement.workflow.demo.model.SupportCase supportCase) {
        this.supportCase = supportCase;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "supportGroup")
    @javax.validation.Valid()
    private java.lang.String supportGroup;

    public java.lang.String getSupportGroup() {
        return supportGroup;
    }

    public void setSupportGroup(java.lang.String supportGroup) {
        this.supportGroup = supportGroup;
    }

    @Override()
    public ServiceCaseModel toModel() {
        ServiceCaseModel result = new ServiceCaseModel();
        result.setSupportCase(getSupportCase());
        result.setSupportGroup(getSupportGroup());
        return result;
    }
}
