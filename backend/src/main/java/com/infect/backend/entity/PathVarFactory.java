package com.infect.backend.entity;

import com.infect.backend.model.ProvinceTendencyVO;

public class PathVarFactory {
    public static PathVar makePathVar(String name) {
        if (name.equals("currentConfirmed")) {
            return new CurrentConfirmedPathVar();
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
