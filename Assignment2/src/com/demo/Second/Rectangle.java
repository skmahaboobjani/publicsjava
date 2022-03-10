package com.demo.Second;



	public class Rectangle extends Figure {
		private int length;
		private int breadth;
		
		public Rectangle(int length, int breadth) {
			super(length,breadth);
		}

		public double area() {
			return getBreadth()*getLength();
		}

		public int getLength() {
			return super.dim1;
		}

		public int getBreadth() {
			return super.dim2;
		}
		
	}



