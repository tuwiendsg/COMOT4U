package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the IndeterminacySource stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@65a2200c (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class IndeterminacySource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute nature.
	*/ 
	private List<String> _nature = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute indeterminacyDegree.
	*/ 
	private List<String> _indeterminacyDegree = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("IndeterminacySource");

	public IndeterminacySource() {
		/*
		Variable for the attribute nature.
		*/ 
		this._nature = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute indeterminacyDegree.
		*/ 
		this._indeterminacyDegree = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the IndeterminacySource POJO class
		
		IndeterminacySource _stereo = new IndeterminacySource();
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
	 * @return the nature
	 */
	public List<String> getNature() {
		return this._nature;
	}
	/**
	 * @param nature the nature to add
	 */
	public void addNature(String _nature) {
		this._nature.add(_nature.toString());
	}
	/**
	 * @return the description
	 */
	public List<String> getDescription() {
		return this._description;
	}
	/**
	 * @param description the description to add
	 */
	public void addDescription(String _description) {
		this._description.add(_description.toString());
	}
	/**
	 * @return the indeterminacyDegree
	 */
	public List<String> getIndeterminacyDegree() {
		return this._indeterminacyDegree;
	}
	/**
	 * @param indeterminacyDegree the indeterminacyDegree to add
	 */
	public void addIndeterminacyDegree(String _indeterminacyDegree) {
		this._indeterminacyDegree.add(_indeterminacyDegree.toString());
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