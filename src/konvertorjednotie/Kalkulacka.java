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
public class Kalkulacka {
    float vystup;

    public float Krat (float vstupA, float vstupB)
    {
        vystup = vstupA * vstupB;
        return vystup;
    }

    public float Delenie(float vstupA, float vstupB)
    {
        vystup = vstupA/vstupB;
        if (vstupA == 0 || vstupB== 0)
        {
            vystup = 0;
        }

        return vystup;
    }


    public float Plus (float vstupA, float vstupB)
    {
        vystup = vstupA + vstupB;
        return vystup;
    }

    public float Minus (float vstupA, float vstupB)
    {
        vystup = vstupA - vstupB;
        return vystup;
    }
    
}
