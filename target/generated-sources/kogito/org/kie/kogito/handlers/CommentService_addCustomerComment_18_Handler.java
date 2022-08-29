package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class CommentService_addCustomerComment_18_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    com.presolved.casemanagement.workflow.demo.service.CommentService service;

    public CommentService_addCustomerComment_18_Handler() {
        this(new com.presolved.casemanagement.workflow.demo.service.CommentService());
    }

    @javax.inject.Inject()
    public CommentService_addCustomerComment_18_Handler(com.presolved.casemanagement.workflow.demo.service.CommentService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.addCustomerComment((com.presolved.casemanagement.workflow.demo.model.SupportCase) workItem.getParameter("supportCase"), (java.lang.String) workItem.getParameter("comment"), (java.lang.String) workItem.getParameter("author"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("supportCase", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "com.presolved.casemanagement.workflow.demo.service.CommentService_addCustomerComment_18_Handler";
    }
}
