package live;
import music.Playable;
import music.string.*;
import music.wind.*;
public class Test {
	public static void main(String args[])
	{
		Veena v=new Veena();
		v.play();
		Saxophone s=new Saxophone();
		s.play();
		Playable a,b;
		a=new Veena();
		b=new Saxophone();
		a.play();
		b.play();
	}
}
