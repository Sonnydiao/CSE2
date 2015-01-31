//This program aims to display the items you
//bought and total cost plus tax
//Shuotao Diao, shd314@lehigh.edu
public class Arithmetic {
    public static void main(String[] args) {
        //Number of pairs of socks 
        int nSocks = 3;
        //Cost per pair of socks
        double sockCost$ = 2.58;
        //Number of drinking glasses
        int nGlasses = 6;
        //Cost per glasses
        double glassCost$ = 2.29;
        //Number of boxes of envelopes
        int nEnvelopes = 1;
        //Cose per box of envelopes
        double envelopeCost$ = 3.25;
        double taxPercent = 0.06;
        double totalCostSockNoTax,totalCostGlassNoTax,
        totalCostEnvelopeNoTax;
        double taxSock,taxGlass,taxEnvelope;
        double totalCostNoTax,totalTax,totalCost;
        //Computing total cost of socks without tax
        totalCostSockNoTax = nSocks * sockCost$;
        totalCostSockNoTax = (int) (totalCostSockNoTax * 100);
        totalCostSockNoTax /= 100.0;
        taxSock = totalCostSockNoTax * taxPercent;
        taxSock = (int) (taxSock * 100);
        taxSock /= 100.0;
        //Computing total cost of drinking glasses without tax
        totalCostGlassNoTax = nGlasses * glassCost$;
        totalCostGlassNoTax = (int) (totalCostGlassNoTax * 100);
        totalCostGlassNoTax /= 100.0;
        taxGlass = totalCostGlassNoTax * taxPercent;
        taxGlass = (int) (taxGlass * 100);
        taxGlass /= 100.0;
        //computing total cost of envelopes without tax
        totalCostEnvelopeNoTax = nEnvelopes * envelopeCost$;
        totalCostEnvelopeNoTax = (int) (totalCostEnvelopeNoTax *
        100);
        totalCostEnvelopeNoTax /= 100.0;
        taxEnvelope = totalCostEnvelopeNoTax * taxPercent;
        taxEnvelope = (int) (taxEnvelope * 100);
        taxEnvelope /= 100.0;
        //computing total cost of purchases and total tax
        totalCostNoTax = totalCostGlassNoTax 
        + totalCostGlassNoTax + totalCostEnvelopeNoTax;
        totalTax = taxSock + taxGlass + taxEnvelope;
        totalCost = totalCostNoTax + totalTax;
        //display the number of pairs of socks,  
        //price for each pair and total cost of them without tax
        System.out.println("Number of pairs of socks: " +
        nSocks);
        System.out.println("Price per pair: $" + sockCost$);
        System.out.println("Total cost of socks " + 
        "without tax: $" + totalCostSockNoTax);
        System.out.println("Tax on socks: $" + taxSock);
        System.out.println("----------------------------");
        //display the number of drinking glasses,
        //price for each and total cost of them without tax
        System.out.println("Number of drinking glasses: " +
        nGlasses);
        System.out.println("Price per item: $" + glassCost$);
        System.out.println("Total cost of drinking glasses " + 
        "without tax: $" + totalCostGlassNoTax);
        System.out.println("Tax on drinking glasses: $" + 
        taxGlass); 
        System.out.println("----------------------------");
        //display the number of envelopes,
        //price for each and total cost of them without tax
        System.out.println("Number of envelopes: " + 
        nEnvelopes);
        System.out.println("Price per envelope: $" + 
        envelopeCost$);
        System.out.println("Total cost of envelopes: $" +
        totalCostEnvelopeNoTax);
        System.out.println("Tax on envelopes: $" + 
        taxEnvelope); 
        System.out.println("----------------------------");
        //display total cost of purchases and total tax
        System.out.println("Total cost of purchases " + 
        "without tax: $" + totalCostNoTax );
        System.out.println("Total sales tax: $" + totalTax);
        System.out.println("Total cost of transaction: $" +
        totalCost);
    }
}