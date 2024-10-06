package be.techfix.chainOfResponsibility;

public interface ValidatorChain<T> {
    void setNextChain(ValidatorChain<T> nextChain);

    Boolean validate(T request) throws Exception;
}
