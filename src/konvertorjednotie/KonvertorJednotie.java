/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvertorjednotie;

import java.util.Scanner;

/**
 *
 * @author Patrik
 */
public class KonvertorJednotie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImperialToMetric KonvertorIdoM = new ImperialToMetric();
        Kalkulacka Kalkulacka1 = new Kalkulacka();
        Scanner input = new Scanner(System.in);
        System.out.println("Ahoj, ja som konvertor na premenu jednotiek dĺžky (1)");
        System.out.println("Ahoj, ja som kalkulačna (2)");
        int vyber = input.nextInt();
        
        if (vyber == 1)
        {   
            
            System.out.println("Chceš z imperialnych do metrických ? (1)");
            System.out.println("Chceš z metrických do imperiálnych ? (2)");
            
           
            int vyber2 = input.nextInt();
            
            if (vyber2 == 1)
                
            {
                System.out.println("Palce do centimetrov ? (1)");
                System.out.println("Stopy do metrov ? (2)");
                
                System.out.println("Míle do kilometrov ? (3)");
                int vyber3 = input.nextInt();
                
                if (vyber3 == 1)
                {
                    System.out.println("Vlož palce: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaIdoC(vstup);
                    System.out.print(vstup + "palcov je "+ KonvertorIdoM.vystup +" centimetrov");
                    
                }
                
                if (vyber3 == 3)
                {
                    System.out.println("Vlož míle: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaMdoK(vstup);
                    System.out.print(vstup + "míľ je: " +KonvertorIdoM.vystup + " kilometrov");
                }
                
                if (vyber3 == 2)
                {   
                    System.out.println("Vlož stopy: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaFdoM(vstup);
                    System.out.print(KonvertorIdoM.vystup);
                    System.out.print(vstup + " stôp je: " +KonvertorIdoM.vystup + " metrov");
                
                }
            }
                    

            
            if (vyber2 == 2)
            {
                 System.out.println("Centrimetre do palcov ? (1)");
                System.out.println("Metre do stôp ? (2)");
                
                System.out.println("Kilometre do míľ? (3)");
                int vyber3 = input.nextInt();
                
                if(vyber3 == 1)
                    
                {
                     System.out.println("Vlož centimetre: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaCdoI(vstup);
                    System.out.print(vstup + "cm je "+ KonvertorIdoM.vystup +" palcov");    
                }
                if (vyber3 == 2)
                {
                System.out.println("Vlož metre: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaMdoF(vstup);
                    System.out.print(vstup + "m je "+ KonvertorIdoM.vystup +" stôp");   
                }
                
                if (vyber3 == 3)
                    
                {
                System.out.println("Vlož kilometre: ");
                    float vstup = input.nextFloat();
                    KonvertorIdoM.PremenaCdoI(vstup);
                    System.out.print(vstup + "km je "+ KonvertorIdoM.vystup +" míľ");   
                }
                
            }
            
            }
            
          
            
            
        
        
        if (vyber == 2)
        {
            System.out.println("Chceš násobiť ? (1)");
            System.out.println("Chceš deliť ? (2)");
            System.out.println("Chceš sčítať ? (3)");
            System.out.println("Chceš odčítať (4)");
            int vyber3 = input.nextInt();
            
            if (vyber3 == 1)
            {
                System.out.println("Vlož prvé číslo : ");
                float vstupA = input.nextFloat();
                System.out.println("Vlož druhé číslo : ");
                float vstupB = input.nextFloat();
                Kalkulacka1.Krat(vstupA, vstupB);
                System.out.println(vstupA + "*" + vstupB + " = " + Kalkulacka1.vystup);
            }
            
             if (vyber3 == 2)
            {
                System.out.println("Vlož prvé číslo : ");
                float vstupA = input.nextFloat();
                System.out.println("Vlož druhé číslo : ");
                float vstupB = input.nextFloat();
                Kalkulacka1.Delenie(vstupA, vstupB);
                System.out.println(vstupA + "/" + vstupB + " = " + Kalkulacka1.vystup);
            
            }
             
              if (vyber3 == 3)
            {
                    System.out.println("Vlož prvé číslo : ");
                float vstupA = input.nextFloat();
                System.out.println("Vlož druhé číslo : ");
                float vstupB = input.nextFloat();
                Kalkulacka1.Plus(vstupA, vstupB);
                System.out.println(vstupA + "+" + vstupB + " = " + Kalkulacka1.vystup);
            }
              
               if (vyber3 == 4)
            {
                
                 System.out.println("Vlož prvé číslo : ");
                float vstupA = input.nextFloat();
                System.out.println("Vlož druhé číslo : ");
                float vstupB = input.nextFloat();
                Kalkulacka1.Minus(vstupA, vstupB);
                System.out.println(vstupA + "-" + vstupB + " = " + Kalkulacka1.vystup);
            }
    }
    }
    }

