package dao;

import entities.*;
import java.util.*;

public class ApprenticeModel {
	
	 public List<Apprentice> findAll(){
		
		 try{
			 
			List<Apprentice> result = new ArrayList<Apprentice>();
			result.add(new Apprentice("Abdallah", "Al-Maskari","FISI", 1));
			return result;
			
		}catch(Exception e){
			
			 System.err.println("an error has occurred creating the apprentice list");
		
		}
		
		return null;
		 
	 }
	
}
