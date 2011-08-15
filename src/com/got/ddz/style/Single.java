package com.got.ddz.style;

/**
 * µ•’≈°£
 * @author zzwu
 *
 */
public class Single implements Style {
	
	private int card;
	
	public Single(int[] cards) {
		card = cards[0];
	}

	@Override
	public Style parse(int[] cards) {
		if (null == cards || cards.length != 1) {
			return null;
		}
		return new Single(cards);
	}

	@Override
	public int[] getCards() {
		return new int[]{card};
	}
	
	@Override
	public int compare(Style s) {
		return 0;
	}

}
