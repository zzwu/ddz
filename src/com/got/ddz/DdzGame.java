package com.got.ddz;

import java.util.ArrayList;
import java.util.List;

/**
 * һ�ֶ�������Ϸ��
 * @author zzwu
 *
 */
public class DdzGame {
	
	/**
	 * ��Ϸ��ҡ�
	 */
	private Player[] players = new Player[3];
	
	/**
	 * ʣ����ơ�
	 */
	private String[][] leftCards = new String[3][];
	
	/**
	 * �Ѿ������ơ�
	 */
	private List<APlay> plays = new ArrayList<APlay>();
	
	/**
	 * �����ܴ�����
	 */
	private int playCount;
	
	/**
	 * ��ʼIndex��
	 */
	private int beginIndex;

}
