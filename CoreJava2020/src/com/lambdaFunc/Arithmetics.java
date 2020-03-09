package com.lambdaFunc;

interface BiFunction<T,U,R>// OR import java.util.function.*;

{
	R apply(T t, U u);
}

public class Arithmetics {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer> add = (x,y)->x+y;
		BiFunction<Integer, Integer,Integer> sub = (x,y)->x-y;
		BiFunction<Integer, Integer,Integer> mul = (x,y)->x*y;
		BiFunction<Integer, Integer,Integer> div = (x,y)->x/y;
		System.out.println("Result Add = "+add.apply(12, 10));
		System.out.println("Result Subtract = "+sub.apply(12, 10));
		System.out.println("Result Multiply = "+mul.apply(12, 10));
		System.out.println("Result Divide = "+div.apply(12, 10));
				
	}

}
