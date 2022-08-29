package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class StateService_close_13_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    com.presolved.casemanagement.workflow.demo.service.StateService service;

    public StateService_close_13_Handler() {
        this(new com.presolved.casemanagement.workflow.demo.service.StateService());
    }

    @javax.inject.Inject()
    public StateService_close_13_Handler(com.presolved.casemanagement.workflow.demo.service.StateService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.close((com.presolved.casemanagement.workflow.demo.model.SupportCase) workItem.getParameter("supportCase"), (java.lang.Integer) workItem.getParameter("evaluation"), (java.lang.String) workItem.getParameter("comment"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("supportCase", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "com.presolved.casemanagement.workflow.demo.service.StateService_close_13_Handler";
    }
}
