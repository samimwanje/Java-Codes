
public class Program {

	public static void main(String[] args) {
			model.Dealer d = new model.Dealer();
			model.Player p = new model.Player();
			view.Console v = new view.Console();
			controller.Player c = new controller.Player();
			while(c.playGame(v,d,p));
	}
	
}	