package com.passwordstrength.solution;

public interface Rule {
    boolean check(String password);
    boolean isMandatory();
}
