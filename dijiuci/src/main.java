public class main {

	public static void main(String[] args) {
		Che che=(Che)new Bus();
		Road road=(Road)new Shui();
		che.setRoad(road);
		che.run();
	}

}