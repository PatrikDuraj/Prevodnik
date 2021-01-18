/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvertorjednotie;

/**
 *
 * @author Patrik
 */
public class ImperialToMetric {
    float vystup;


    public float PremenaIdoC(float vstup)
    {
       vystup = vstup * 2.54f;

       return vystup;

    }

    public float PremenaFdoM (float vstup)
    {
        vystup = vstup * 0.3048f;

        return vystup;
    }

    public float PremenaMdoK(float vstup)
    {
        vystup = vstup *1.6f;

        return vystup;
    }

     public float PremenaCdoI (float vstup)
    {
        vystup = vstup / 2.54f;
        return vystup;
    }

    public float PremenaMdoF (float vstup)
    {
        vystup = vstup /0.3048f;
        return  vystup;
    }

    public float PremenaKdoM (float vstup)
    {
        vystup = vstup / 1.6f;
        return vystup;
    }
}
