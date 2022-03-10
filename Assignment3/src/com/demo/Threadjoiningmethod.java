package com.demo;
public class Threadjoiningmethod extends Thread{  
	    public void run(){  
	     for(int i=1;i<=4;i++){  
	      try{  
	       Thread.sleep(200);  
	      }catch(Exception e){System.out.println(e);}  
	     System.out.println(i);  
	     }  
	    }  
	   public static void main(String args[]){  
	       Threadjoiningmethod th1=new Threadjoiningmethod();  
	       Threadjoiningmethod th2=new Threadjoiningmethod();  
	       Threadjoiningmethod th3=new Threadjoiningmethod();  
	    th1.start();  
	    try{  
	     th1.join(1000);  
	    }
	    catch(Exception e){
	        System.out.println(e);
	        }  
	      
	    th2.start();  
	    th3.start();  
	    }  
	   }


