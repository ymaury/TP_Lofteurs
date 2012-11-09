

public abstract class Aliment {

	protected String nom;
	protected int type;
	protected int position_x;
	protected int position_y;
	protected int quantite;
	protected int gainEnergetiqueUnitaire;
	
	public Aliment(String a, int b, int c,int d,int e,int f){
		this.nom=a;
		this.type=b;
		this.position_x=c;
		this.position_y=d;
		this.quantite=e;
		this.gainEnergetiqueUnitaire=f;
	}
	public int getType(){
		return this.type;
	}

	public int getPosition_x(){
		return this.position_x;
	}
	
	public void setPosition_x (int a){
		this.position_x=a;
	}
	
	public int getPosition_y(){
		return this.position_y;
	}
	
	public void setPosition_y(int b){
		this.position_y=b;
	}
	
	public int getQuantite(){
		return this.quantite;
	}
	
	public void setQuantite(int c){
		this.quantite=c;
	}
	
	public int getGainEnergetiqueUnitaire(){
		return this.gainEnergetiqueUnitaire;
	}
}
