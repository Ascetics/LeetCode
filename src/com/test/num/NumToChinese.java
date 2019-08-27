package com.test.num;

public class NumToChinese {

	private static String[] DIGIT = new String[] {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "扒", "玖"};
	private static String[] UNIT = new String[] {"拾", "佰", "仟", "万", "亿", ""};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		String value = "13666735519";
		if(value.matches("\\d+")) {
			int parseInt = Integer.parseInt(value);
			if(parseInt == 0) {
				System.out.println("empty");
			}
		}
	}

	public static String numToChinese(int num) {
		
		return null;
	}
}
