package at.ac.tuwien.dsg.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SwSynchronizationResource stereotype
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

public class SwSynchronizationResource {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isIntraMemoryPartitionInteraction.
	*/ 
	private List<String> _isIntraMemoryPartitionInteraction = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingQueuePolicy.
	*/ 
	private List<String> _waitingQueuePolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingQueueCapacity.
	*/ 
	private List<String> _waitingQueueCapacity = new ArrayList<String>();
	

		
	/*
	Variable for the attribute waitingPolicyElements.
	*/ 
	private List<String> _waitingPolicyElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute identifierElements.
	*/ 
	private List<String> _identifierElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute stateElements.
	*/ 
	private List<String> _stateElements = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memorySizeFootprint.
	*/ 
	private List<String> _memorySizeFootprint = new ArrayList<String>();
	

		
	/*
	Variable for the attribute createServices.
	*/ 
	private List<String> _createServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute deleteServices.
	*/ 
	private List<String> _deleteServices = new ArrayList<String>();
	

		
	/*
	Variable for the attribute initializeServices.
	*/ 
	private List<String> _initializeServices = new ArrayList<String>();
	

		
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
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("SwSynchronizationResource");

	public SwSynchronizationResource() {
		/*
		Variable for the attribute isIntraMemoryPartitionInteraction.
		*/ 
		this._isIntraMemoryPartitionInteraction = new ArrayList<String>();
		/*
		Variable for the attribute waitingQueuePolicy.
		*/ 
		this._waitingQueuePolicy = new ArrayList<String>();
		/*
		Variable for the attribute waitingQueueCapacity.
		*/ 
		this._waitingQueueCapacity = new ArrayList<String>();
		/*
		Variable for the attribute waitingPolicyElements.
		*/ 
		this._waitingPolicyElements = new ArrayList<String>();
		/*
		Variable for the attribute identifierElements.
		*/ 
		this._identifierElements = new ArrayList<String>();
		/*
		Variable for the attribute stateElements.
		*/ 
		this._stateElements = new ArrayList<String>();
		/*
		Variable for the attribute memorySizeFootprint.
		*/ 
		this._memorySizeFootprint = new ArrayList<String>();
		/*
		Variable for the attribute createServices.
		*/ 
		this._createServices = new ArrayList<String>();
		/*
		Variable for the attribute deleteServices.
		*/ 
		this._deleteServices = new ArrayList<String>();
		/*
		Variable for the attribute initializeServices.
		*/ 
		this._initializeServices = new ArrayList<String>();
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
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SwSynchronizationResource POJO class
		
		SwSynchronizationResource _stereo = new SwSynchronizationResource();
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
	 * @return the isIntraMemoryPartitionInteraction
	 */
	public List<String> getIsIntraMemoryPartitionInteraction() {
		return this._isIntraMemoryPartitionInteraction;
	}
	/**
	 * @param isIntraMemoryPartitionInteraction the isIntraMemoryPartitionInteraction to add
	 */
	public void addIsIntraMemoryPartitionInteraction(String _isIntraMemoryPartitionInteraction) {
		this._isIntraMemoryPartitionInteraction.add(_isIntraMemoryPartitionInteraction.toString());
	}
	/**
	 * @return the waitingQueuePolicy
	 */
	public List<String> getWaitingQueuePolicy() {
		return this._waitingQueuePolicy;
	}
	/**
	 * @param waitingQueuePolicy the waitingQueuePolicy to add
	 */
	public void addWaitingQueuePolicy(String _waitingQueuePolicy) {
		this._waitingQueuePolicy.add(_waitingQueuePolicy.toString());
	}
	/**
	 * @return the waitingQueueCapacity
	 */
	public List<String> getWaitingQueueCapacity() {
		return this._waitingQueueCapacity;
	}
	/**
	 * @param waitingQueueCapacity the waitingQueueCapacity to add
	 */
	public void addWaitingQueueCapacity(String _waitingQueueCapacity) {
		this._waitingQueueCapacity.add(_waitingQueueCapacity.toString());
	}
	/**
	 * @return the waitingPolicyElements
	 */
	public List<String> getWaitingPolicyElements() {
		return this._waitingPolicyElements;
	}
	/**
	 * @param waitingPolicyElements the waitingPolicyElements to add
	 */
	public void addWaitingPolicyElements(String _waitingPolicyElements) {
		this._waitingPolicyElements.add(_waitingPolicyElements.toString());
	}
	/**
	 * @return the identifierElements
	 */
	public List<String> getIdentifierElements() {
		return this._identifierElements;
	}
	/**
	 * @param identifierElements the identifierElements to add
	 */
	public void addIdentifierElements(String _identifierElements) {
		this._identifierElements.add(_identifierElements.toString());
	}
	/**
	 * @return the stateElements
	 */
	public List<String> getStateElements() {
		return this._stateElements;
	}
	/**
	 * @param stateElements the stateElements to add
	 */
	public void addStateElements(String _stateElements) {
		this._stateElements.add(_stateElements.toString());
	}
	/**
	 * @return the memorySizeFootprint
	 */
	public List<String> getMemorySizeFootprint() {
		return this._memorySizeFootprint;
	}
	/**
	 * @param memorySizeFootprint the memorySizeFootprint to add
	 */
	public void addMemorySizeFootprint(String _memorySizeFootprint) {
		this._memorySizeFootprint.add(_memorySizeFootprint.toString());
	}
	/**
	 * @return the createServices
	 */
	public List<String> getCreateServices() {
		return this._createServices;
	}
	/**
	 * @param createServices the createServices to add
	 */
	public void addCreateServices(String _createServices) {
		this._createServices.add(_createServices.toString());
	}
	/**
	 * @return the deleteServices
	 */
	public List<String> getDeleteServices() {
		return this._deleteServices;
	}
	/**
	 * @param deleteServices the deleteServices to add
	 */
	public void addDeleteServices(String _deleteServices) {
		this._deleteServices.add(_deleteServices.toString());
	}
	/**
	 * @return the initializeServices
	 */
	public List<String> getInitializeServices() {
		return this._initializeServices;
	}
	/**
	 * @param initializeServices the initializeServices to add
	 */
	public void addInitializeServices(String _initializeServices) {
		this._initializeServices.add(_initializeServices.toString());
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