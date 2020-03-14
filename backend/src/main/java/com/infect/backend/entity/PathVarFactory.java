package com.infect.backend.entity;

public class PathVarFactory {
    public static PathVar makePathVar(String name) {
        if (name.equals("confirmedincr")) {
            return new ConfirmedIncrPathVar();
        }
        else if (name.equals("confirmed")) {
            return new ConfirmedPathVar();
        }
        else if (name.equals("cureddead")) {
            return new DeadCuredPathVar();
        }
        return null;
    }
}
