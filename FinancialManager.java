package Manager;

import Builder.Agreement;
import State.NotActive;
import State.State;
import Utility.UtilityClass;

import java.util.ArrayList;

public class FinancialManager
{
     double totalpayoutfromCanceled=0;
     double totalInsuranceAmount=0;
    double totalIncome=0;
    double TotalNetProfit=0;

    AgreementManager agreementManager = new AgreementManager();
    Agreement agreement = new Agreement();
    ArrayList<Agreement> agreements = agreementManager.getlistofAgreements();
    private State NotActive;

    public double Income(Agreement agreement)
    {
        return agreement.getYearlyfee()+agreement.getPenalty();
    }

    public void TotalIncome()
    {
        for (Agreement agreement : agreements)
        {
            totalIncome+=Income(agreement);
        }
        System.out.println("Total Income :" + totalIncome);
    }
    public double totalpenaltyfromCanceled()
    {
        for (Agreement agreement : agreements)
        {
            if (agreement.getCurrentstate().equals(NotActive))
            {
                totalpayoutfromCanceled += agreement.getPenalty();
            }
        }
        //System.out.println("Total Penalty paid: " + totalpayoutfromCanceled);
        return totalpayoutfromCanceled;
    }

    public double calculateTotalPayouts()
    {
        for(Agreement agreement : agreements)
        {
            totalInsuranceAmount+= agreement.getInsuranceAmount();
        }
        //System.out.println("The Total Insurance amount paid is: " + totalInsuranceAmount);
        return totalInsuranceAmount;
    }
    public double NetProfit()
    {
         double TotalNetProfit =0;
        for (Agreement agreement : agreements)
        {
            TotalNetProfit += agreement.getNetprofit();
        }
        //System.out.println("The Total Net Profit is " + TotalNetProfit);
        return UtilityClass.helperDoubleRound(TotalNetProfit);
    }

     public  double NetProfitPerYear(int year)
     {
         for (Agreement agreement : agreements)
         {
             if (agreement.getYear() == year)
             {
                 TotalNetProfit += agreement.getNetprofit();
             }
         }
         return TotalNetProfit;
     }

         public void breakdownOfNetProfitPerYear()
     {
         for (int year = 2015; year <= 2023; year++) {
             double netProfit = NetProfitPerYear(year);
             System.out.println("Total Net Profit for year " + year + " : " + UtilityClass.helperDoubleRound(netProfit));
         }
     }

    public double AverageNetProfit()
    {

        int numberOfYears = 0;

        for (Agreement agreement : agreements) {
            TotalNetProfit += agreement.getNetprofit();
            numberOfYears++;
        }

        if (numberOfYears == 0) {
            System.out.println("No agreements found.");
            return 0;
        }

        double averageNetProfit = TotalNetProfit / numberOfYears;
        System.out.println("Average Net Profit: " + UtilityClass.helperDoubleRound(averageNetProfit));
        return averageNetProfit;
    }





    public void FinancialSubMenu()
    {
        System.out.println("Total Insurance Amount paid: " + calculateTotalPayouts());
        System.out.println("Total penalty paid: " + totalpenaltyfromCanceled());
        TotalIncome();
        System.out.println("Total Net Profit: " + NetProfit());
        breakdownOfNetProfitPerYear();
        AverageNetProfit();
    }
}
