package uvsq.fr.pgpl_3_5;


import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfficheMetier implements AffichageMetier {
	 private static final Logger logger = LoggerFactory.getLogger(AfficheMetier.class);
	
	public void afficheDebut() {
	   logger.info(LocalDateTime.now()+ " : Début de UneMethodeMetier");
	}
	
	public void afficheFin() {
	    logger.info(LocalDateTime.now()+ " : Fin de UneMethodeMetier");
	}
}
