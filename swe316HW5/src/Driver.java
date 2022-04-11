import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pool pl = new pool(10);

		ServiceObject x1;

		x1 = pl.getInstance();
		x1.doSomething();

		pl.releaseInstance(x1);
		x1.doSomething();

	}

}
