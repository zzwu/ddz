package com.got.ddz.style;

public interface Style {

	/**
	 * ��ȡ����ģʽ��
	 * @param cards
	 * @return
	 */
	Style parse(int[] cards);
	
	int[] getCards();
	
	int compare(Style s);
}
