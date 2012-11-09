
import java.util.*;

public class Loft {

	//Attributs
	public int hauteur;
	public int largeur;
	public static Case[][] loft;
	public static ArrayList<Neuneu> neuneus;

	//Constructeur d'initialisation (avec paramètres)
		public void Loft(int phauteur, int plargeur, ArrayList<Neuneu> pALN){
			System.out.println("Création d'un Loft avec des paramètres !");
			hauteur = phauteur;
			largeur = plargeur;
			loft = new Case[phauteur][plargeur];
			neuneus = pALN;
		}
	
	//Getters
		public ArrayList<Neuneu> getNeuneus(){
			return neuneus;
		}
		public Case[][] getLoft(){
			return loft;
		}
		
	//Méthodes	
	public void initLoft(){
		
	}
	public void afficheLoft(){
		
	}
	public void ajouterNeuneu(){
		
	}
	
	
}

