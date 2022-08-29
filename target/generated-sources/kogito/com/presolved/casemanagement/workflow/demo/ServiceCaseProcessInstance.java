package com.presolved.casemanagement.workflow.demo;

public class ServiceCaseProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ServiceCaseModel> {

    public ServiceCaseProcessInstance(com.presolved.casemanagement.workflow.demo.ServiceCaseProcess process, ServiceCaseModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ServiceCaseProcessInstance(com.presolved.casemanagement.workflow.demo.ServiceCaseProcess process, ServiceCaseModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ServiceCaseProcessInstance(com.presolved.casemanagement.workflow.demo.ServiceCaseProcess process, ServiceCaseModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ServiceCaseProcessInstance(com.presolved.casemanagement.workflow.demo.ServiceCaseProcess process, ServiceCaseModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ServiceCaseProcessInstance(com.presolved.casemanagement.workflow.demo.ServiceCaseProcess process, ServiceCaseModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ServiceCaseModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ServiceCaseModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
