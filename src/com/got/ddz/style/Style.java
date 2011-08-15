package com.got.ddz.style;

public interface Style {

	/**
	 * 析取出牌模式。
	 * @param cards
	 * @return
	 */
	Style parse(int[] cards);
	
	int[] getCards();
	
	int compare(Style s);
}
