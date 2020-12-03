public class Factory {

	public Qi getq(String a){
		if(a.equals("白棋")){

			return new White();
		}
		else if(a.equals("黑棋")){

			return new Black();
		}
		else {
			return null;
		}
	}
}