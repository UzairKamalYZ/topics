package be.techfix.chainOfResponsibility;

import lombok.extern.java.Log;

@Log
public class FinalValidation<T> implements ValidatorChain<T> {
        ValidatorChain<T> chain;

    @Override
    public void setNextChain(ValidatorChain<T> nextChain) {
        this.chain = nextChain;
    }

    @Override
    public Boolean validate(T request) throws Exception {
        log.info("\n  Final Level :: Validating request: " + request);
        if(request == null) {
            throw new Exception("Request is null");
        }
        return this.chain.validate(request);
    }

}
