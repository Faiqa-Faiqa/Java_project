package Manager;

import Builder.CarAgreementBuilder;
import Builder.Agreement;
import Builder.Engineer;
import Utility.UtilityClass;
import java.util.ArrayList;
import java.util.Scanner;

public class AgreementManager {
    private ArrayList<Agreement> list_of_agreements = new ArrayList<>();
    private ArrayList<Agreement> newAgreements = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Agreement agreement=new Agreement();

    public AgreementManager()
    {
        for (int i = 0; i < 20; i++)
        {
            CarAgreementBuilder carAgreementBuilder = new CarAgreementBuilder();
            Engineer engineer = new Engineer(carAgreementBuilder);
            engineer.createAgreement();
            list_of_agreements.add(engineer.getAgreement());
        }
    }

    public void addagreements()
    {
        CarAgreementBuilder carAgreementBuilder = new CarAgreementBuilder();
        Engineer engineer = new Engineer(carAgreementBuilder);
        engineer.createAgreement();
        newAgreements.add(engineer.getAgreement());
    }
    public void displayNewApplicationsMenu()
    {
        System.out.println("New Insurance Applications:");
        for (int i = 0; i < 7; i++)
        {
            addagreements();
            System.out.println("Application " + (i + 1) + ": " + newAgreements.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an application to accept (enter the index):");
        int index = scanner.nextInt();
        if (index >= 0 && index < newAgreements.size())
        {
            Agreement acceptedApplication = newAgreements.get(index);
            System.out.println("Application accepted and removed from the menu.");
            newAgreements.remove(index);
            list_of_agreements.add(acceptedApplication);
        }
        else
        {
            System.out.println("Invalid index. Please try again.");
        }
    }


    public void breakAgreement()
    {
        displayAllAgreementsSubMenu();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an agreement to break by entering the index:");
        int index = input.nextInt();
        Agreement agreement=searchAgreement(index);
        agreement.changeState();
        agreement.displayAgreement(index);
    }


    public void displayAllAgreementsSubMenu()
    {
        System.out.println("Displaying all agreements:");
        for (int i = 0; i < list_of_agreements.size(); i++)
        {
            System.out.println("Agreement " + i + ";");
            list_of_agreements.get(i).displayAgreement(i);
        }
    }



    public ArrayList<Agreement> getAgreements() {
        return list_of_agreements;
    }

    public Agreement searchAgreement(int index)
        {

            for (int i = 0; i < list_of_agreements.size(); i++)
            {
                if (index == i)
                {
                    list_of_agreements.get(i).displayAgreement(i);
                    return list_of_agreements.get(i);
                }
            }
            System.out.println("Invalid index. Please try again.");
            return null;
        }

        public ArrayList<Agreement> getlistofAgreements()
        {
            return this.list_of_agreements;
        }

}


