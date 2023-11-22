package Manager;

import Builder.Agreement;


import java.util.ArrayList;
import java.util.List;

public class TimeManager {
    private FinancialManager financialManager = new FinancialManager();
    AgreementManager agreementManager = new AgreementManager();
    public void moveTimeForward()
    {
        System.out.println("Time has been moved forward by a year.");
        ArrayList<Agreement> agreements = agreementManager.getlistofAgreements();

        for (Agreement agreement : agreements)
        {
            int year = agreement.getYear();
            year++;
            agreement.setYear(year);
            financialManager.Income(agreement);
            checkforclaims(agreement);
        }

    }

    public static void checkforclaims(Agreement agreement)
    {
        double risk = agreement.getRisk();
        if (risk>.75)
        {
            agreement.getInsuranceAmount();
            System.out.println("Claim made for " + agreement.getClientname() + " of amount " + agreement.getInsuranceAmount());

        }
    }
}
