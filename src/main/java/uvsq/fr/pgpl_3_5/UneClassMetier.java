package uvsq.fr.pgpl_3_5;

public class UneClassMetier {

	AfficheMetier afficheMetier;

	public UneClassMetier(final AfficheMetier afficheMetier) {
		this.afficheMetier = afficheMetier;
	}
	
	
	public void uneMethodeMetier() {
		afficheMetier.afficheDebut(); // log message
		//Traitements métiers
		afficheMetier.afficheFin(); // log message
	}
}
