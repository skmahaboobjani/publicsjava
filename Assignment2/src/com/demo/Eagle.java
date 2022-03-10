package com.demo;



	public class Eagle {
		private String birdName;
		
		public Eagle(String birdName) {
			this.birdName=birdName;
		}
		
		
		public void canFly() {
			System.out.println(getBirdName()+" can fly very high and long distance.");
			
		}

		public void color() {
			System.out.println(getBirdName()+" . they are large, powerfully built birds of prey, ");
			
		}

		public void canSwim() {
			System.out.println(getBirdName()+" it will fly so height in sky.");
			
		}
		
		public String getBirdName() {
			return birdName;
		}
	}



