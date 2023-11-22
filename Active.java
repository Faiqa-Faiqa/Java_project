package State;

import Builder.Agreement;
import Utility.UtilityClass;

public class Active extends State {
    @Override
    public void changeState(Agreement agreement) {
        agreement.setCurrentState(new NotActive());
        //we have to apply changes to some properties of agreement
        //there is a 10% penalty to pay
        agreement.setPenalty(
                UtilityClass.helperDoubleRound(agreement.getYearlyfee() * 0.1));
        //but the yearly fee becomes zero.
        agreement.setYearlyfee(0);

        agreement.setNetprofit(
                UtilityClass.helperDoubleRound(agreement.getPenalty() -
                        agreement.getInsuranceAmount()));
    }
}
