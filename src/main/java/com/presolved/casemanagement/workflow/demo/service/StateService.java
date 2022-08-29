package com.presolved.casemanagement.workflow.demo.service;

import javax.enterprise.context.ApplicationScoped;

import com.presolved.casemanagement.workflow.demo.model.Questionnaire;
import com.presolved.casemanagement.workflow.demo.model.State;
import com.presolved.casemanagement.workflow.demo.model.SupportCase;

@ApplicationScoped
public class StateService {

    public void resolve() {
    }

    public SupportCase resolve(SupportCase supportCase) {
        return new SupportCase(supportCase).setState(State.RESOLVED);
    }

    public SupportCase close(SupportCase supportCase, Integer evaluation, String comment) {
        return new SupportCase(supportCase)
                .setQuestionnaire(new Questionnaire().setComment(comment).setEvaluation(evaluation))
                .setState(State.CLOSED);
    }

}
