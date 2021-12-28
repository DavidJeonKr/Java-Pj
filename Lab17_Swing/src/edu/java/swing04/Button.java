package edu.java.swing04;

public class Button {
	private OnclickListener listener;
	
	public static interface OnclickListener {
		void onClick();
	}
	
	public void setOnclickListener(OnclickListener listener) {
		this.listener = listener;
	}
}
