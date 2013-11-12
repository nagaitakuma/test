
public class Main {
	public static void main(String args[]){
		AbstractCreator sx = new SaxphoneCreator();
		AbstractCreator tp = new TrumpetCreator();
		sx.setName("Saxphone");
		tp.setName("Trumpet");
		WindInstrumentProduct a = sx.create();
		WindInstrumentProduct b = tp.create();
		a.printPlate();
		b.printPlate();
		a.play();
		b.play();




	}
}
