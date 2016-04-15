package dcll.alak;

/**
 * Created by PC SALON on 15/04/2016.
 */

public class Frame {

    /**
     * score du preimier essai.
     */
    private int premierEssai = 0;
    /**
     * score du deuxième essai.
     */
    private int deuxiemEssai = 0;
    /**
     * score maximum.
     */
    static final int MAX_SCORE = 10;

    /**
     * constructeur des essais.
     *
     * @param ess1 Le premier essai
     * @param ess2 Le second essai
     */
    public Frame(final int ess1, final int ess2) {
        this.premierEssai = ess1;
        this.deuxiemEssai = ess2;
    }

    /**
     * Le score total de chaque jeu(Frame).
     *
     * @return la somme des deux essais
     */
    final int getTotalScore() {
        return premierEssai + deuxiemEssai;
    }

    /**
     * Décrit le status du jeu(Frame).
     *
     * @return un status(Srike,Spare,Normal)
     */
    final int getStatus() {
        if (getPremierEssai() == MAX_SCORE) {
            return 2; // strike
        }
        if (getTotalScore() == MAX_SCORE) {
            return 1; // spare
        }
        return 0; // normal
    }

    /**
     * Retourne le score du premier essai.
     *
     * @return score du premier essai
     */
    final int getPremierEssai() {
        return premierEssai;
    }


    /**
     * Modifie le score du premier essai.
     *
     * @param preE premier essai
     */
    final void setPremierEssai(final int preE) {
        this.premierEssai = preE;
    }

    /**
     * Retourne le score du deuxième jeu.
     *
     * @return le score du deuxième essai
     */
    final int getDeuxiemEssai() {
        return deuxiemEssai;
    }

    /**
     * Modifie le scoredu deuxième essai.
     *
     * @param deuxE deuxième essai
     */
    final void setDeuxiemEssai(final int deuxE) {
        this.deuxiemEssai = deuxE;
    }
}
