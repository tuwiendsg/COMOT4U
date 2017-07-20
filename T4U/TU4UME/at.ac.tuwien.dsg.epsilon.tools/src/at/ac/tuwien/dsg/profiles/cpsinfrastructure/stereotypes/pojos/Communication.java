package at.ac.tuwien.dsg.profiles.cpsinfrastructure.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the Communication stereotype
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

public class Communication {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	/*
	Variable for the connection ends.
	*/ 
	private List<String> _connection_ends = new ArrayList<String>();
	
	

		
	/*
	Variable for the attribute communicationConfigs.
	*/ 
	private List<String> _communicationConfigs = new ArrayList<String>();
	

		
	/*
	Variable for the attribute virtualComponents.
	*/ 
	private List<String> _virtualComponents = new ArrayList<String>();
	

		
	/*
	Variable for the attribute virtualUnits.
	*/ 
	private List<String> _virtualUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute virtualActuators.
	*/ 
	private List<String> _virtualActuators = new ArrayList<String>();
	

		
	/*
	Variable for the attribute virtualSensors.
	*/ 
	private List<String> _virtualSensors = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedVirtualUnits.
	*/ 
	private List<String> _ownedVirtualUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute deployedOn.
	*/ 
	private List<String> _deployedOn = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/ 
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute location.
	*/ 
	private List<String> _location = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedUnits.
	*/ 
	private List<String> _ownedUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute hasTimestampMechanism.
	*/ 
	private List<String> _hasTimestampMechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timestampMaxLatency.
	*/ 
	private List<String> _timestampMaxLatency = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isSafetyCritical.
	*/ 
	private List<String> _isSafetyCritical = new ArrayList<String>();
	

		
	/*
	Variable for the attribute infrastructureInterface.
	*/ 
	private List<String> _infrastructureInterface = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("Communication");

	public Communication() {
		/*
		Variable for the attribute communicationConfigs.
		*/ 
		this._communicationConfigs = new ArrayList<String>();
		/*
		Variable for the attribute virtualComponents.
		*/ 
		this._virtualComponents = new ArrayList<String>();
		/*
		Variable for the attribute virtualUnits.
		*/ 
		this._virtualUnits = new ArrayList<String>();
		/*
		Variable for the attribute virtualActuators.
		*/ 
		this._virtualActuators = new ArrayList<String>();
		/*
		Variable for the attribute virtualSensors.
		*/ 
		this._virtualSensors = new ArrayList<String>();
		/*
		Variable for the attribute ownedVirtualUnits.
		*/ 
		this._ownedVirtualUnits = new ArrayList<String>();
		/*
		Variable for the attribute deployedOn.
		*/ 
		this._deployedOn = new ArrayList<String>();
		/*
		Variable for the attribute id.
		*/ 
		this._id = new ArrayList<String>();
		/*
		Variable for the attribute location.
		*/ 
		this._location = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute ownedUnits.
		*/ 
		this._ownedUnits = new ArrayList<String>();
		/*
		Variable for the attribute hasTimestampMechanism.
		*/ 
		this._hasTimestampMechanism = new ArrayList<String>();
		/*
		Variable for the attribute timestampMaxLatency.
		*/ 
		this._timestampMaxLatency = new ArrayList<String>();
		/*
		Variable for the attribute isSafetyCritical.
		*/ 
		this._isSafetyCritical = new ArrayList<String>();
		/*
		Variable for the attribute infrastructureInterface.
		*/ 
		this._infrastructureInterface = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the Communication POJO class
		
		Communication _stereo = new Communication();
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
	 * @return the communicationConfigs
	 */
	public List<String> getCommunicationConfigs() {
		return this._communicationConfigs;
	}
	/**
	 * @param communicationConfigs the communicationConfigs to add
	 */
	public void addCommunicationConfigs(String _communicationConfigs) {
		this._communicationConfigs.add(_communicationConfigs.toString());
	}
	/**
	 * @return the virtualComponents
	 */
	public List<String> getVirtualComponents() {
		return this._virtualComponents;
	}
	/**
	 * @param virtualComponents the virtualComponents to add
	 */
	public void addVirtualComponents(String _virtualComponents) {
		this._virtualComponents.add(_virtualComponents.toString());
	}
	/**
	 * @return the virtualUnits
	 */
	public List<String> getVirtualUnits() {
		return this._virtualUnits;
	}
	/**
	 * @param virtualUnits the virtualUnits to add
	 */
	public void addVirtualUnits(String _virtualUnits) {
		this._virtualUnits.add(_virtualUnits.toString());
	}
	/**
	 * @return the virtualActuators
	 */
	public List<String> getVirtualActuators() {
		return this._virtualActuators;
	}
	/**
	 * @param virtualActuators the virtualActuators to add
	 */
	public void addVirtualActuators(String _virtualActuators) {
		this._virtualActuators.add(_virtualActuators.toString());
	}
	/**
	 * @return the virtualSensors
	 */
	public List<String> getVirtualSensors() {
		return this._virtualSensors;
	}
	/**
	 * @param virtualSensors the virtualSensors to add
	 */
	public void addVirtualSensors(String _virtualSensors) {
		this._virtualSensors.add(_virtualSensors.toString());
	}
	/**
	 * @return the ownedVirtualUnits
	 */
	public List<String> getOwnedVirtualUnits() {
		return this._ownedVirtualUnits;
	}
	/**
	 * @param ownedVirtualUnits the ownedVirtualUnits to add
	 */
	public void addOwnedVirtualUnits(String _ownedVirtualUnits) {
		this._ownedVirtualUnits.add(_ownedVirtualUnits.toString());
	}
	/**
	 * @return the deployedOn
	 */
	public List<String> getDeployedOn() {
		return this._deployedOn;
	}
	/**
	 * @param deployedOn the deployedOn to add
	 */
	public void addDeployedOn(String _deployedOn) {
		this._deployedOn.add(_deployedOn.toString());
	}
	/**
	 * @return the id
	 */
	public List<String> getId() {
		return this._id;
	}
	/**
	 * @param id the id to add
	 */
	public void addId(String _id) {
		this._id.add(_id.toString());
	}
	/**
	 * @return the location
	 */
	public List<String> getLocation() {
		return this._location;
	}
	/**
	 * @param location the location to add
	 */
	public void addLocation(String _location) {
		this._location.add(_location.toString());
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
	 * @return the ownedUnits
	 */
	public List<String> getOwnedUnits() {
		return this._ownedUnits;
	}
	/**
	 * @param ownedUnits the ownedUnits to add
	 */
	public void addOwnedUnits(String _ownedUnits) {
		this._ownedUnits.add(_ownedUnits.toString());
	}
	/**
	 * @return the hasTimestampMechanism
	 */
	public List<String> getHasTimestampMechanism() {
		return this._hasTimestampMechanism;
	}
	/**
	 * @param hasTimestampMechanism the hasTimestampMechanism to add
	 */
	public void addHasTimestampMechanism(String _hasTimestampMechanism) {
		this._hasTimestampMechanism.add(_hasTimestampMechanism.toString());
	}
	/**
	 * @return the timestampMaxLatency
	 */
	public List<String> getTimestampMaxLatency() {
		return this._timestampMaxLatency;
	}
	/**
	 * @param timestampMaxLatency the timestampMaxLatency to add
	 */
	public void addTimestampMaxLatency(String _timestampMaxLatency) {
		this._timestampMaxLatency.add(_timestampMaxLatency.toString());
	}
	/**
	 * @return the isSafetyCritical
	 */
	public List<String> getIsSafetyCritical() {
		return this._isSafetyCritical;
	}
	/**
	 * @param isSafetyCritical the isSafetyCritical to add
	 */
	public void addIsSafetyCritical(String _isSafetyCritical) {
		this._isSafetyCritical.add(_isSafetyCritical.toString());
	}
	/**
	 * @return the infrastructureInterface
	 */
	public List<String> getInfrastructureInterface() {
		return this._infrastructureInterface;
	}
	/**
	 * @param infrastructureInterface the infrastructureInterface to add
	 */
	public void addInfrastructureInterface(String _infrastructureInterface) {
		this._infrastructureInterface.add(_infrastructureInterface.toString());
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
	/**
	 * @return the connection ends
	 */
	public List<String> getConnectionEnds() {
		return this._connection_ends;
	}
	/**
	 * @param end the Communication to add
	 */
	public void addConnectionEnds(String _end) {
		this._connection_ends.add(_end.toString());
	}
	
}