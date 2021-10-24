package example.micronaut;

public interface Criterion {
    boolean check(String password);
    boolean isMandatory();
}
