package clases;

public class Fuego extends Pokemon implements Atacable{
	private final int vida;
		
	public Fuego(String nom) {
		vida = Math.round(Math.round(250 + Math.random() * 400));
		setVida(vida);
		setDanyBase(20);
		setEnergia(100);
		setDefensa(15);
		setPrecisio(72);
	}
	public void resetStats() {
		setEnergia(100);
		setVida(vida);
	}
	public int getAtac() {
		int i = Math.round(Math.round(1 + Math.random() * 2));
		if (getDanyBase() < getEnergia()) {
			switch(i) {
			case 1:
				setSkill("Asques");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 12;
			case 2:
				setSkill("Llanzallames");
				return getDanyBase() + Math.round(Math.round(30 + Math.random()) * 61) + 4;
			default:
				return 0;
			}
		}
		else {
			return 0;
		}
	}
}
