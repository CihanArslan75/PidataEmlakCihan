package com.cihan.emlak.models;

public enum EstateState {
	SATILIK,
	KIRALIK;
	
	 public String toString(){
	        switch(this) {
	            case SATILIK:
	                return "SATILIK";
	            case KIRALIK:
	                return "KİRALIK";
	          default: return " ";
	        }
		 }

}
