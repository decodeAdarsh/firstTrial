package com.Generics;

class GWrapper<T>
{
	private T t;
	public GWrapper(T t)
	{
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
public class GenericWrapper {

	public static void main(String[] args) {
		GWrapper<Integer> gwrap=new GWrapper<Integer>(150);
		int x=gwrap.getT();
		System.out.println(x);
	}

}
