package com.presolved.casemanagement.workflow.demo.service;

import javax.enterprise.context.ApplicationScoped;

import com.presolved.casemanagement.workflow.demo.model.Comment;
import com.presolved.casemanagement.workflow.demo.model.State;
import com.presolved.casemanagement.workflow.demo.model.SupportCase;

import static com.presolved.casemanagement.workflow.demo.model.State.WAITING_FOR_CUSTOMER;
import static com.presolved.casemanagement.workflow.demo.model.State.WAITING_FOR_OWNER;

@ApplicationScoped
public class CommentService {

    public SupportCase addCustomerComment(SupportCase supportCase, String comment, String author) {
        return addComment(supportCase, author, comment, WAITING_FOR_OWNER);
    }

    public SupportCase addSupportComment(SupportCase supportCase, String comment, String author) {
        return addComment(supportCase, author, comment, WAITING_FOR_CUSTOMER);
    }

    private SupportCase addComment(SupportCase supportCase, String author, String comment, State newState) {
        SupportCase sCase = new SupportCase(supportCase).addComment(new Comment().setAuthor(author).setText(comment));
        if (State.NEW.equals(supportCase.getState())) {
            return sCase;
        }
        return sCase.setState(newState);
    }

}
