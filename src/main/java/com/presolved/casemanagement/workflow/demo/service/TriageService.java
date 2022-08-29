package com.presolved.casemanagement.workflow.demo.service;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

import com.presolved.casemanagement.workflow.demo.model.State;
import com.presolved.casemanagement.workflow.demo.model.SupportCase;

@ApplicationScoped
public class TriageService {

    public static final String[] MIDDLEWARE_ENGINEERS = new String[] { "martin", "manuel" };
    public static final String[] STORAGE_ENGINEERS = new String[] { "samantha", "sarah" };
    public static final String[] CLOUD_ENGINEERS = new String[] { "candy", "chris" };
    public static final String[] KOGITO_ENGINEERS = new String[] { "ken", "kelly" };
    public static final String[] CEPH_ENGINEERS = new String[] { "connor", "candy" };

    private final Random random = new Random();

    public SupportCase assignEngineer(SupportCase supportCase, String supportGroup) {
        SupportCase result = new SupportCase(supportCase);
        if (supportCase.getEngineer() == null) {
            if (supportGroup == null) {
                return supportCase;
            }
            String[] engineers = getEngineers(supportGroup);
            if (engineers == null) {
                return supportCase;
            }
            String engineer = engineers[random.nextInt(engineers.length)];
            result.setEngineer(engineer);
        }
        if (State.NEW.equals(supportCase.getState())) {
            result.setState(State.WAITING_FOR_OWNER);
        }
        return result;
    }

    private String[] getEngineers(String family) {
        switch (family) {
            case "Middleware":
                return MIDDLEWARE_ENGINEERS;
            case "Storage":
                return STORAGE_ENGINEERS;
            case "Cloud":
                return CLOUD_ENGINEERS;
            case "Kogito":
                return KOGITO_ENGINEERS;
            case "Ceph":
                return CEPH_ENGINEERS;
            default:
                return null;
        }
    }
}
