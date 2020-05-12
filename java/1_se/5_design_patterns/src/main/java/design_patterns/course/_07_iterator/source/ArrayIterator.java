package design_patterns.course._07_iterator.source;

/**
 * ArrayIterator sinifi
 *
 */
public class ArrayIterator implements Iterator {

	private int[] pixel;
	private int pozisyon;

	public int getPozisyon() {
		return pozisyon;
	}

	public void setPozisyon(final int pozisyon) {
		this.pozisyon = pozisyon;
	}

	public ArrayIterator(final int[] pixel) {
		setPixel(pixel);
	}

	@Override
	public boolean hasNext() {
		if (pozisyon >= getPixel().length || 
			getPixel()[pozisyon] == -1) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		final int oyuncu = getPixel()[pozisyon];
		pozisyon++;
		return oyuncu;
	}

	public int[] getPixel() {
		return pixel;
	}

	public void setPixel(final int[] pixel) {
		this.pixel = pixel;
	}
}