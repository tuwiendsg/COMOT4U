package at.ac.tuwien.dsg.profiles.infrastructurecpsprofile.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ParameterDirectionKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@21658f0b (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class ParameterDirectionKind {


		
	/*
	Static Variable for the literal in.
	*/ 
	public String _in = new String("in");
	

		
	/*
	Static Variable for the literal inout.
	*/ 
	public String _inout = new String("inout");
	

		
	/*
	Static Variable for the literal out.
	*/ 
	public String _out = new String("out");
	

		
	/*
	Static Variable for the literal return.
	*/ 
	public String _return = new String("return");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ParameterDirectionKind");

	public ParameterDirectionKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ParameterDirectionKind POJO class
		
		ParameterDirectionKind enumeration = new ParameterDirectionKind();
		enumeration.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String elem = gson.toJson(this);
        
        System.out.println("elem = " + elem);    
        
        return elem;   
	}

	/**
	 * @return the _in
	 */
	public String getIn() {
		return _in;
	}
	/**
	 * @return the _inout
	 */
	public String getInout() {
		return _inout;
	}
	/**
	 * @return the _out
	 */
	public String getOut() {
		return _out;
	}
	/**
	 * @return the _return
	 */
	public String getReturn() {
		return _return;
	}
}