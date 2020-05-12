package design_patterns.course._07_iterator.source;

/**
 * Test sinifi
 *
 */
public class Client {

	public static void main(final String[] args) {
		final Nothing nothing = new Nothing(GameObjectType.NOTHING);
		Iterator it = nothing.getIterator();

		while (it.hasNext()) {
			final int px = (int) it.next();
			System.out.println(px);
		}
	}
}