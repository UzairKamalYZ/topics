package be.techfix.chainOfResponsibility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ValidatorChain<String> validatorChain = getValidationChaine();

        try {
            validatorChain.validate("Validate My data");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    private static ValidatorChain<String> getValidationChaine() {
        ValidatorChain<String> Level1Validation = new Level1Validation<>();
        Level2Validation<String> Level2Validation = new Level2Validation<>();
        Level3Validation<String> Level3Validation = new Level3Validation<>();
        FinalValidation<String> FinalValidation = new FinalValidation<>();
        Level1Validation.setNextChain(Level2Validation);
        Level2Validation.setNextChain(Level3Validation);
        Level3Validation.setNextChain(FinalValidation);
        return Level1Validation;
    }
}
