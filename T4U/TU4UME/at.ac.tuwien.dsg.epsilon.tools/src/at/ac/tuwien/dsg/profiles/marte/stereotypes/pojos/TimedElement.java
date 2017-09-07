package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the TimedElement stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@4c06bbf9 (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class TimedElement {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute on.
	*/ 
	private List<String> _on = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("TimedElement");

	public TimedElement() {
		/*
		Variable for the attribute on.
		*/ 
		this._on = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the TimedElement POJO class
		
		TimedElement _stereo = new TimedElement();
		_stereo.toJson();
		
	}
	
	public String toJson(){
	

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // Convert numbers array into JSON string.
        String _element = gson.toJson(this);
        
        System.out.println("element = " + _element);    
        
        return _element;   
	}

	/**
	 * @return the on
	 */
	public List<String> getOn() {
		return this._on;
	}
	/**
	 * @param on the on to add
	 */
	public void addOn(String _on) {
		this._on.add(_on.toString());
	}
	/**
	 * @return the _name
	 */
	public String getName() {
		return this.__name;
	}
	/**
	 * @param end the Communication to add
	 */
	public void setName(String __name) {
		this.__name = __name;
	}
	
}