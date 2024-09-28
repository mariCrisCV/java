package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {//constructor para iniciar el array y que no este null
		personas=new ArrayList<Persona>();
	}	
	public void agregar (Persona persona){ 
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+" "+elementoPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoPersona=null;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(nombre.equals(elementoPersona.getNombre())) {//utilizar equals cuando trabajo con Strings
				personaEncontrada=elementoPersona;
			}
		}
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores=new ArrayList<Persona>();
		Persona elementoPersona=null;
		for(int i=0; i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getEdad()>edad) {
				mayores.add(elementoPersona);
			}
		}
		return mayores;
		
	}
}	
