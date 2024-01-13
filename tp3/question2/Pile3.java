package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int capacite;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // à compléter
         if(taille <=0) taille = PileI.CAPACITE_PAR_DEFAUT;
        
        capacite =  taille;
        
        v = new Vector();
        
    }

    public void empiler(Object o) throws PilePleineException {
        // à compléter
        if(v.size() >= this.capacite) throw new PilePleineException();
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        // à compléter
         if(v.isEmpty()) throw new PileVideException();
        Object o = v.get(v.size()-1);
        v.remove(v.size()-1);
        return o;
    }

    public Object sommet() throws PileVideException {
        // à compléter
         if(v.isEmpty()) throw new PileVideException();
        return v.get(v.size()-1);
    }

    public int taille() {
        // à compléter
        return v.size();
    }

    public int capacite() {
        // à compléter
         return this.capacite;
    }

    public boolean estVide() {
        // à compléter
        return v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
        return v.size() >= this.capacite;
    }

    public String toString() {
        // à compléter
        String res = "[";
       for(int i = v.size()-1; i>=0; i--)
       {
           res+= v.get(i);
           
           if(i>0) res+=", ";
       }
        
        res += "]";
        
        return res;
    }

    public boolean equals(Object o) {
        // à compléter
        if(! (o instanceof PileI) ) return false;
        PileI op = (PileI)o;
        if(op.taille() != this.taille()) return false;
        if(op.capacite() != this.capacite()) return false;
        
        return op.toString().equals(this.toString());
        
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
