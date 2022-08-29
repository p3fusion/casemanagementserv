package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class StateService_resolve_3_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    com.presolved.casemanagement.workflow.demo.service.StateService service;

    public StateService_resolve_3_Handler() {
        this(new com.presolved.casemanagement.workflow.demo.service.StateService());
    }

    @javax.inject.Inject()
    public StateService_resolve_3_Handler(com.presolved.casemanagement.workflow.demo.service.StateService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.resolve((com.presolved.casemanagement.workflow.demo.model.SupportCase) workItem.getParameter("supportCase"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("supportCase", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "com.presolved.casemanagement.workflow.demo.service.StateService_resolve_3_Handler";
    }
}
