package com.meirapentermann.jets;

public class JetMenu {
	private int numOptions;
	private String[] optionsList;
	
	
	/* Two Constructors
	 * no-args constructor plus a constructor that takes String array only
	 * protects from someone entering more options than exist in array
	 */
	public JetMenu() {
	}

	public JetMenu(String[] arr) {
//		int temp = arr.length;
//		String[] tempArr;
		setNumOptions(arr.length);
		setOptionsList(arr);
	}

	public int getNumOptions() {
		return numOptions;
	}

	public void setNumOptions(int numOptions) {
		this.numOptions = numOptions;
	}

	public String[] getOptionsList() {
		return optionsList;
	}

	public void setOptionsList(String[] options) {
		this.optionsList = options;
	}

}
