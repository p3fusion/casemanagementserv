package com.presolved.casemanagement.workflow.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.presolved.casemanagement.workflow.demo.model.State.NEW;

public class SupportCase {

    private Product product;
    private String description;
    private String engineer;
    private String customer;
    private State state = NEW;
    private List<Comment> comments;
    private Questionnaire questionnaire;

    public SupportCase() {
    }

    public SupportCase(SupportCase supportCase) {
        this.customer = supportCase.customer;
        this.product = new Product(supportCase.product);
        this.engineer = supportCase.engineer;
        this.state = supportCase.state;
        this.description = supportCase.description;
        if (supportCase.comments != null) {
            this.comments = supportCase.comments.stream().map(Comment::new).collect(Collectors.toList());
        }
        if (supportCase.questionnaire != null) {
            this.questionnaire = new Questionnaire(supportCase.questionnaire);
        }
    }

    public Product getProduct() {
        return product;
    }

    public SupportCase setProduct(Product product) {
        this.product = product;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public SupportCase setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getEngineer() {
        return engineer;
    }

    public SupportCase setEngineer(String engineer) {
        this.engineer = engineer;
        return this;
    }

    public String getCustomer() {
        return customer;
    }

    public SupportCase setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public State getState() {
        return state;
    }

    public SupportCase setState(State state) {
        this.state = state;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public SupportCase addComment(Comment comment) {
        if (comments == null) {
            comments = new ArrayList<>();
        }
        comments.add(comment);
        return this;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public SupportCase setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
        return this;
    }

    @Override
    public String toString() {
        return "SupportCase{" + "product=" + product + ", description='" + description + '\'' + ", engineer='"
                + engineer + '\'' + ", customer='" + customer + '\'' + ", state=" + state + ", comments=" + comments
                + ", questionnaire=" + questionnaire + '}';
    }
}
