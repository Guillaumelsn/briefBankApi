/**
 * 
 */
package com.briefBankApi.api.model;

/**
 * @author marvin
 *
 */
public enum CompteStatut {
    ACTIF(false), 
    CLOTURE(true);
    
    // declaring private variable for getting values
    private boolean statut;
    
    // getter method
    public boolean getStatut()
    {
        return this.statut;
    }
    
    // enum constructor - cannot be public or protected
    private CompteStatut(boolean statut)
    {
        this.statut= statut;
    }
}
