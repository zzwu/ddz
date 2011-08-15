package com.got.ddz.style;

import java.util.Arrays;

/**
 * Áú¡£
 * @author zzwu
 *
 */
public class SingleSuccess implements Style {
	
	public static int MIN_LENGTH = 5;
	public static int[] cards;
	
	private SingleSuccess(int[] cards) {
		this.cards = cards;
	}

	@Override
	public Style parse(int[] cards) {
		if (null == cards || cards.length < MIN_LENGTH) {
			return null;
		}
		Arrays.sort(cards);
		for (int i = 0; i < cards.length; i++) {
			if (cards[i + 1] != (cards[i] + i + 1)) {
				return null;
			}
		}
		return new SingleSuccess(cards);
	}

	@Override
	public int[] getCards() {
		return cards;
	}

	@Override
	public int compare(Style s) {
		if (null == s || null == s.getCards() || s.getCards().length != cards.length) {
			throw new StyleCompareException();
		}
		return new Integer(cards[0]).compareTo(s.getCards()[0]);
	}

}
