
import java.util.*;

public abstract class Neuneu {
	
	//Attributs
	protected int sexe;
	protected float energie;
	protected int maxEnergie;
	protected int position_x;
	protected int position_y;
	protected String typeAliment;
	protected int depenseEnergetiqueDeplacement;
	protected int depenseEnergetiqueReproduction;
	protected boolean exclu;
	protected Loft loft;
	
	//Constructeur de base (sans paramètres)
		public Neuneu(){
			System.out.println("Création d'un neuneu !");
			sexe = 0;
			energie = 100;
			maxEnergie = 100;
			position_x = 0;
			position_y = 0;
			typeAliment = "inconnu";
			depenseEnergetiqueDeplacement = 0;
			depenseEnergetiqueReproduction = 0;
			exclu = false;
			loft = loft;
		}
		
	//Constructeur d'initialisation (avec paramètres)
		public void neuneu(int psexe, float penergie, int pmaxEnergie, int pposition_x, int pposition_y, 
				String ttypeAliment, int pdepenseEnergetiqueDeplacement, int pdependeEnergetiqueReproduction, 
				boolean pexclu, Loft ploft){
			System.out.println("Création d'un neuneu avec des paramètres !");
			sexe = psexe;
			energie = penergie;
			maxEnergie = pmaxEnergie;
			position_x = pposition_x;
			position_y = pposition_y;
			typeAliment = ttypeAliment;
			depenseEnergetiqueDeplacement = pdepenseEnergetiqueDeplacement;
			depenseEnergetiqueReproduction = pdependeEnergetiqueReproduction;
			exclu = pexclu;
			loft = ploft;
		}
		
		
	//Getters
		public int getsexe(){
			return this.sexe;
		}
		public float getenergie(){
			return this.energie;
		}
		public int getmaxEnergie(){
			return this.maxEnergie;
		}
		public int getposition_x(){
			return this.position_x;
		}
		public int getposition_y(){
			return this.position_y;
		}
		public String gettypeAliment(){
			return this.typeAliment;
		}
		public int getdepenseEnergetiqueDeplacement(){
			return this.depenseEnergetiqueDeplacement;
		}
		public int getdepenseEnergetiqueReproduction(){
			return this.depenseEnergetiqueReproduction;
		}
		public boolean getexclu(){
			return this.exclu;
		}
		
	//Setters 
		public void setsexe(int psexe){
			this.sexe = psexe;
		}
		public void setenergie(float penergie){
			this.energie = penergie;
		}
		public void setposition_x(int pposition_x){
			this.position_x = pposition_x;
		}
		public void setposition_y(int pposition_y){
			this.position_y = pposition_y;
		}
		public void settypeAliment(String ptypeAliment){
			this.typeAliment = ptypeAliment;
		}
		public void setdepenseEnergetiqueDeplacement(int pdepenseEnergetiqueDeplacement){
			this.depenseEnergetiqueDeplacement = pdepenseEnergetiqueDeplacement;
		}
		public void setdepenseEnergetiqueReproduction(int pdepenseEnergetiqueReproduction){
			this.depenseEnergetiqueReproduction = pdepenseEnergetiqueReproduction;
		}
		public void setexclu(boolean pexclu){
			this.exclu = pexclu;
		}
		
	//Méthodes	
	public void exclusion(){
		if(this.energie<0){
			this.exclu=true;
		}
		else{
			this.exclu=false;
		}
	}
	
	public void seReproduire(){
		
	}
	
}