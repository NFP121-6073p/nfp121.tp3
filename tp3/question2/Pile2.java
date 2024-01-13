package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;
import java.util.ListIterator;

public class Pile2 implements PileI {
    /** par delegation : utilisation de la class Stack */
    private Stack<Object> stk;

    /** la capacite de la pile */
    private int capacite;

    /**
     * Creation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit etre > 0
     */
    public Pile2(int taille) {
      if(taille <= 0)
         taille = PileI.CAPACITE_PAR_DEFAUT;
         
         capacite = taille;

         
         stk = new Stack<Object>();
        }
// prevoir le cas <=0
        // a completer
   

    // constructeur fourni
    public Pile2() {
        this(0);
    }

    public void empiler(Object o) throws PilePleineException {
       
        if(stk.size()>=this.capacite) throw new PilePleineException();
        
        stk.push(o);
         
    // a completer
    }

    public Object depiler() throws PileVideException {
     if(stk.empty()) throw new PileVideException();
        
 // a completer
        return stk.pop();
    }

    public Object sommet() throws PileVideException {
     if(stk.empty()) throw new PileVideException();
        return stk.peek();
    }


    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        // a completer
        return stk.empty();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        return stk.size() == capacite;
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
     
        ListIterator<Object> stkIterator = stk.listIterator(this.taille());  
        String res = "[";
        while(stkIterator.hasPrevious())
       {
           res+= stkIterator.previous();
           if (stkIterator.hasPrevious())
           {
               res+=", ";
            }
        }
        
        res += "]";
        return res;

    }

    public boolean equals(Object o) {
        // a completer
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

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        // a completer
     return stk.size();
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
   return this.capacite;
    }

} // Pile2.java
