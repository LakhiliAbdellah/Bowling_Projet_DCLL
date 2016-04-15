package dcll.alak;

import java.util.ArrayList;

/**
 * Created by PC SALON on 15/04/2016.
 */
public class ScoreTotal {

    /**
     * Algorithme de calcul du score total.
     *
     * @param jeux
     * @return le score total
     */
    public final int calculerScore(final ArrayList<Frame> jeux) {
        int scoreTotal = 0;
        final int maxFrame = 10;
        final int strik = 2;
        final int spare = 1;

        for (int i = 0; i < maxFrame; i++) {
            // Cas "Strike"
            if (jeux.get(i).getStatus() == strik) {
                // Total score = Score courant + les deux prochaines scores
                scoreTotal += jeux.get(i).getTotalScore() + jeux.get(i + 1).getTotalScore();
                /** Cas le prochain Frame est Strike
                 * on doit ajouter encore d'autre Score
                 */
                if (jeux.get(i + 1).getStatus() == strik) {
                    scoreTotal += jeux.get(i + 2).getPremierEssai();
                }
            } else if (jeux.get(i).getStatus() == spare) {
                // cas de spare
                scoreTotal += jeux.get(i).getTotalScore() + jeux.get(i + 1).getPremierEssai();
            } else {
                //cas normal
                scoreTotal += jeux.get(i).getTotalScore();
            }
        }
        return scoreTotal;
    }
}
