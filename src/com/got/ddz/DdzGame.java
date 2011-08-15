package com.got.ddz;

import java.util.ArrayList;
import java.util.List;

/**
 * 一局斗地主游戏。
 * @author zzwu
 *
 */
public class DdzGame {
	
	/**
	 * 游戏玩家。
	 */
	private Player[] players = new Player[3];
	
	/**
	 * 剩余的牌。
	 */
	private String[][] leftCards = new String[3][];
	
	/**
	 * 已经出的牌。
	 */
	private List<APlay> plays = new ArrayList<APlay>();
	
	/**
	 * 出牌总次数。
	 */
	private int playCount;
	
	/**
	 * 开始Index。
	 */
	private int beginIndex;

}
