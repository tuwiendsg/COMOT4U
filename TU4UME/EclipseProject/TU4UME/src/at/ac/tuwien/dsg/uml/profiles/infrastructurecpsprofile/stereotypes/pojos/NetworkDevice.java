package at.ac.tuwien.dsg.uml.profiles.infrastructurecpsprofile.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the NetworkDevice stereotype
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

public class NetworkDevice {



	/*
	Variable for the connection ends.
	*/
	@SerializedName("name") 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute type.
	*/
	@SerializedName("type")
	private List<String> _type = new ArrayList<String>();
	

		
	/*
	Variable for the attribute sensors.
	*/
	@SerializedName("sensors")
	private List<String> _sensors = new ArrayList<String>();
	

		
	/*
	Variable for the attribute actuators.
	*/
	@SerializedName("actuators")
	private List<String> _actuators = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedPhysicalUnits.
	*/
	@SerializedName("ownedPhysicalUnits")
	private List<String> _ownedPhysicalUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ioDevices.
	*/
	@SerializedName("ioDevices")
	private List<String> _ioDevices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute id.
	*/
	@SerializedName("id")
	private List<String> _id = new ArrayList<String>();
	

		
	/*
	Variable for the attribute location.
	*/
	@SerializedName("location")
	private List<String> _location = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/
	@SerializedName("description")
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedUnits.
	*/
	@SerializedName("ownedUnits")
	private List<String> _ownedUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute hasTimestampMechanism.
	*/
	@SerializedName("hasTimestampMechanism")
	private List<String> _hasTimestampMechanism = new ArrayList<String>();
	

		
	/*
	Variable for the attribute timestampMaxLatency.
	*/
	@SerializedName("timestampMaxLatency")
	private List<String> _timestampMaxLatency = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isSafetyCritical.
	*/
	@SerializedName("isSafetyCritical")
	private List<String> _isSafetyCritical = new ArrayList<String>();
	

		
	/*
	Variable for the attribute infrastructureInterface.
	*/
	@SerializedName("infrastructureInterface")
	private List<String> _infrastructureInterface = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/
	@SerializedName("type")
	public String __type = new String ("NetworkDevice");

	public NetworkDevice() {
		/*
		Variable for the attribute type.
		*/
		this._type = new ArrayList<String>();
		/*
		Variable for the attribute sensors.
		*/
		this._sensors = new ArrayList<String>();
		/*
		Variable for the attribute actuators.
		*/
		this._actuators = new ArrayList<String>();
		/*
		Variable for the attribute ownedPhysicalUnits.
		*/
		this._ownedPhysicalUnits = new ArrayList<String>();
		/*
		Variable for the attribute ioDevices.
		*/
		this._ioDevices = new ArrayList<String>();
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
		// Auto-generated method to test the NetworkDevice POJO class
		
		NetworkDevice _stereo = new NetworkDevice();
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
	 * @return the type
	 */
	public List<String> getType() {
		return this._type;
	}
	/**
	 * @param type the type to add
	 */
	public void addType(String _type) {
		this._type.add(_type.toString());
	}
	/**
	 * @return the sensors
	 */
	public List<String> getSensors() {
		return this._sensors;
	}
	/**
	 * @param sensors the sensors to add
	 */
	public void addSensors(String _sensors) {
		this._sensors.add(_sensors.toString());
	}
	/**
	 * @return the actuators
	 */
	public List<String> getActuators() {
		return this._actuators;
	}
	/**
	 * @param actuators the actuators to add
	 */
	public void addActuators(String _actuators) {
		this._actuators.add(_actuators.toString());
	}
	/**
	 * @return the ownedPhysicalUnits
	 */
	public List<String> getOwnedPhysicalUnits() {
		return this._ownedPhysicalUnits;
	}
	/**
	 * @param ownedPhysicalUnits the ownedPhysicalUnits to add
	 */
	public void addOwnedPhysicalUnits(String _ownedPhysicalUnits) {
		this._ownedPhysicalUnits.add(_ownedPhysicalUnits.toString());
	}
	/**
	 * @return the ioDevices
	 */
	public List<String> getIoDevices() {
		return this._ioDevices;
	}
	/**
	 * @param ioDevices the ioDevices to add
	 */
	public void addIoDevices(String _ioDevices) {
		this._ioDevices.add(_ioDevices.toString());
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
	
}