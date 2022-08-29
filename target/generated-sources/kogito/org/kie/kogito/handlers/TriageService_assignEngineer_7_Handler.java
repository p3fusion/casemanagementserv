package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class TriageService_assignEngineer_7_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    com.presolved.casemanagement.workflow.demo.service.TriageService service;

    public TriageService_assignEngineer_7_Handler() {
        this(new com.presolved.casemanagement.workflow.demo.service.TriageService());
    }

    @javax.inject.Inject()
    public TriageService_assignEngineer_7_Handler(com.presolved.casemanagement.workflow.demo.service.TriageService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.assignEngineer((com.presolved.casemanagement.workflow.demo.model.SupportCase) workItem.getParameter("supportCase"), (java.lang.String) workItem.getParameter("supportGroup"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("supportCase", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "com.presolved.casemanagement.workflow.demo.service.TriageService_assignEngineer_7_Handler";
    }
}
