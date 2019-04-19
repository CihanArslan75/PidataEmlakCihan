package com.cihan.emlak.models;

public enum DeedType {
	KATMULKIYETI,
	KATIRTIFAKI,
	TAPUSUZ ;
	
	 public String toString(){
	        switch(this) {
	            case KATMULKIYETI:
	                return "KAT MÜLKİYETİ";
	            case KATIRTIFAKI:
	                return "KAT İRTİFAKI";
	            case TAPUSUZ:
	                return "TAPUSUZ";
	            default: return " ";
	        }
		 }

}
