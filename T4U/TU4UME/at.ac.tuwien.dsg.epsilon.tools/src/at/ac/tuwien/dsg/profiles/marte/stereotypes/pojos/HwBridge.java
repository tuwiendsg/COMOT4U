package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the HwBridge stereotype
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

public class HwBridge {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute sides.
	*/ 
	private List<String> _sides = new ArrayList<String>();
	

		
	/*
	Variable for the attribute bandWidth.
	*/ 
	private List<String> _bandWidth = new ArrayList<String>();
	

		
	/*
	Variable for the attribute arbiters.
	*/ 
	private List<String> _arbiters = new ArrayList<String>();
	

		
	/*
	Variable for the attribute elementSize.
	*/ 
	private List<String> _elementSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute transmMode.
	*/ 
	private List<String> _transmMode = new ArrayList<String>();
	

		
	/*
	Variable for the attribute blockT.
	*/ 
	private List<String> _blockT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute packetT.
	*/ 
	private List<String> _packetT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute capacity.
	*/ 
	private List<String> _capacity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute speedFactor.
	*/ 
	private List<String> _speedFactor = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mainScheduler.
	*/ 
	private List<String> _mainScheduler = new ArrayList<String>();
	

		
	/*
	Variable for the attribute resMult.
	*/ 
	private List<String> _resMult = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isProtected.
	*/ 
	private List<String> _isProtected = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isActive.
	*/ 
	private List<String> _isActive = new ArrayList<String>();
	

		
	/*
	Variable for the attribute description.
	*/ 
	private List<String> _description = new ArrayList<String>();
	

		
	/*
	Variable for the attribute frequency.
	*/ 
	private List<String> _frequency = new ArrayList<String>();
	

		
	/*
	Variable for the attribute endPoints.
	*/ 
	private List<String> _endPoints = new ArrayList<String>();
	

		
	/*
	Variable for the attribute p_HW_Services.
	*/ 
	private List<String> _p_HW_Services = new ArrayList<String>();
	

		
	/*
	Variable for the attribute r_HW_Services.
	*/ 
	private List<String> _r_HW_Services = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ownedHW.
	*/ 
	private List<String> _ownedHW = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("HwBridge");

	public HwBridge() {
		/*
		Variable for the attribute sides.
		*/ 
		this._sides = new ArrayList<String>();
		/*
		Variable for the attribute bandWidth.
		*/ 
		this._bandWidth = new ArrayList<String>();
		/*
		Variable for the attribute arbiters.
		*/ 
		this._arbiters = new ArrayList<String>();
		/*
		Variable for the attribute elementSize.
		*/ 
		this._elementSize = new ArrayList<String>();
		/*
		Variable for the attribute transmMode.
		*/ 
		this._transmMode = new ArrayList<String>();
		/*
		Variable for the attribute blockT.
		*/ 
		this._blockT = new ArrayList<String>();
		/*
		Variable for the attribute packetT.
		*/ 
		this._packetT = new ArrayList<String>();
		/*
		Variable for the attribute capacity.
		*/ 
		this._capacity = new ArrayList<String>();
		/*
		Variable for the attribute speedFactor.
		*/ 
		this._speedFactor = new ArrayList<String>();
		/*
		Variable for the attribute mainScheduler.
		*/ 
		this._mainScheduler = new ArrayList<String>();
		/*
		Variable for the attribute resMult.
		*/ 
		this._resMult = new ArrayList<String>();
		/*
		Variable for the attribute isProtected.
		*/ 
		this._isProtected = new ArrayList<String>();
		/*
		Variable for the attribute isActive.
		*/ 
		this._isActive = new ArrayList<String>();
		/*
		Variable for the attribute description.
		*/ 
		this._description = new ArrayList<String>();
		/*
		Variable for the attribute frequency.
		*/ 
		this._frequency = new ArrayList<String>();
		/*
		Variable for the attribute endPoints.
		*/ 
		this._endPoints = new ArrayList<String>();
		/*
		Variable for the attribute p_HW_Services.
		*/ 
		this._p_HW_Services = new ArrayList<String>();
		/*
		Variable for the attribute r_HW_Services.
		*/ 
		this._r_HW_Services = new ArrayList<String>();
		/*
		Variable for the attribute ownedHW.
		*/ 
		this._ownedHW = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the HwBridge POJO class
		
		HwBridge _stereo = new HwBridge();
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
	 * @return the sides
	 */
	public List<String> getSides() {
		return this._sides;
	}
	/**
	 * @param sides the sides to add
	 */
	public void addSides(String _sides) {
		this._sides.add(_sides.toString());
	}
	/**
	 * @return the bandWidth
	 */
	public List<String> getBandWidth() {
		return this._bandWidth;
	}
	/**
	 * @param bandWidth the bandWidth to add
	 */
	public void addBandWidth(String _bandWidth) {
		this._bandWidth.add(_bandWidth.toString());
	}
	/**
	 * @return the arbiters
	 */
	public List<String> getArbiters() {
		return this._arbiters;
	}
	/**
	 * @param arbiters the arbiters to add
	 */
	public void addArbiters(String _arbiters) {
		this._arbiters.add(_arbiters.toString());
	}
	/**
	 * @return the elementSize
	 */
	public List<String> getElementSize() {
		return this._elementSize;
	}
	/**
	 * @param elementSize the elementSize to add
	 */
	public void addElementSize(String _elementSize) {
		this._elementSize.add(_elementSize.toString());
	}
	/**
	 * @return the transmMode
	 */
	public List<String> getTransmMode() {
		return this._transmMode;
	}
	/**
	 * @param transmMode the transmMode to add
	 */
	public void addTransmMode(String _transmMode) {
		this._transmMode.add(_transmMode.toString());
	}
	/**
	 * @return the blockT
	 */
	public List<String> getBlockT() {
		return this._blockT;
	}
	/**
	 * @param blockT the blockT to add
	 */
	public void addBlockT(String _blockT) {
		this._blockT.add(_blockT.toString());
	}
	/**
	 * @return the packetT
	 */
	public List<String> getPacketT() {
		return this._packetT;
	}
	/**
	 * @param packetT the packetT to add
	 */
	public void addPacketT(String _packetT) {
		this._packetT.add(_packetT.toString());
	}
	/**
	 * @return the capacity
	 */
	public List<String> getCapacity() {
		return this._capacity;
	}
	/**
	 * @param capacity the capacity to add
	 */
	public void addCapacity(String _capacity) {
		this._capacity.add(_capacity.toString());
	}
	/**
	 * @return the speedFactor
	 */
	public List<String> getSpeedFactor() {
		return this._speedFactor;
	}
	/**
	 * @param speedFactor the speedFactor to add
	 */
	public void addSpeedFactor(String _speedFactor) {
		this._speedFactor.add(_speedFactor.toString());
	}
	/**
	 * @return the mainScheduler
	 */
	public List<String> getMainScheduler() {
		return this._mainScheduler;
	}
	/**
	 * @param mainScheduler the mainScheduler to add
	 */
	public void addMainScheduler(String _mainScheduler) {
		this._mainScheduler.add(_mainScheduler.toString());
	}
	/**
	 * @return the resMult
	 */
	public List<String> getResMult() {
		return this._resMult;
	}
	/**
	 * @param resMult the resMult to add
	 */
	public void addResMult(String _resMult) {
		this._resMult.add(_resMult.toString());
	}
	/**
	 * @return the isProtected
	 */
	public List<String> getIsProtected() {
		return this._isProtected;
	}
	/**
	 * @param isProtected the isProtected to add
	 */
	public void addIsProtected(String _isProtected) {
		this._isProtected.add(_isProtected.toString());
	}
	/**
	 * @return the isActive
	 */
	public List<String> getIsActive() {
		return this._isActive;
	}
	/**
	 * @param isActive the isActive to add
	 */
	public void addIsActive(String _isActive) {
		this._isActive.add(_isActive.toString());
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
	 * @return the frequency
	 */
	public List<String> getFrequency() {
		return this._frequency;
	}
	/**
	 * @param frequency the frequency to add
	 */
	public void addFrequency(String _frequency) {
		this._frequency.add(_frequency.toString());
	}
	/**
	 * @return the endPoints
	 */
	public List<String> getEndPoints() {
		return this._endPoints;
	}
	/**
	 * @param endPoints the endPoints to add
	 */
	public void addEndPoints(String _endPoints) {
		this._endPoints.add(_endPoints.toString());
	}
	/**
	 * @return the p_HW_Services
	 */
	public List<String> getP_HW_Services() {
		return this._p_HW_Services;
	}
	/**
	 * @param p_HW_Services the p_HW_Services to add
	 */
	public void addP_HW_Services(String _p_HW_Services) {
		this._p_HW_Services.add(_p_HW_Services.toString());
	}
	/**
	 * @return the r_HW_Services
	 */
	public List<String> getR_HW_Services() {
		return this._r_HW_Services;
	}
	/**
	 * @param r_HW_Services the r_HW_Services to add
	 */
	public void addR_HW_Services(String _r_HW_Services) {
		this._r_HW_Services.add(_r_HW_Services.toString());
	}
	/**
	 * @return the ownedHW
	 */
	public List<String> getOwnedHW() {
		return this._ownedHW;
	}
	/**
	 * @param ownedHW the ownedHW to add
	 */
	public void addOwnedHW(String _ownedHW) {
		this._ownedHW.add(_ownedHW.toString());
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