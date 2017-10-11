package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the EGenericType stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class EGenericType {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute upperBound.
	*/
	@SerializedName("upperBound")
	private List<String> _upperBound = new ArrayList<String>();
	

		
	/*
	Variable for the attribute lowerBound.
	*/
	@SerializedName("lowerBound")
	private List<String> _lowerBound = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("EGenericType");

	public EGenericType() {
		/*
		Variable for the attribute upperBound.
		*/
		this._upperBound = new ArrayList<String>();
		/*
		Variable for the attribute lowerBound.
		*/
		this._lowerBound = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// Auto-generated method to test the EGenericType POJO class
		
		EGenericType _stereo = new EGenericType();
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
	 * @return the upperBound
	 */
	public List<String> getUpperBound() {
		return this._upperBound;
	}
	/**
	 * @param upperBound the upperBound to add
	 */
	public void addUpperBound(String _upperBound) {
		this._upperBound.add(_upperBound.toString());
	}
	/**
	 * @return the lowerBound
	 */
	public List<String> getLowerBound() {
		return this._lowerBound;
	}
	/**
	 * @param lowerBound the lowerBound to add
	 */
	public void addLowerBound(String _lowerBound) {
		this._lowerBound.add(_lowerBound.toString());
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