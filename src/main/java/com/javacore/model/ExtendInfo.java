package com.javacore.model;

public class ExtendInfo extends info{
	private int tuoi;
	
	public ExtendInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	@Override
	public String toString() {
		return "ExtendInfo [tuoi=" + tuoi + ", getName()=" + getName() + "]";
	}

	public static void main(String[] args) {
		ExtendInfo e = new ExtendInfo();
		e.setTuoi(10);
		e.setName("Phong");
		System.out.println(e.toString());
	}
}
