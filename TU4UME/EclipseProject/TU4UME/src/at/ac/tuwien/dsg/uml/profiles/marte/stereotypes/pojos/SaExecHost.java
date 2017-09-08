package at.ac.tuwien.dsg.uml.profiles.marte.stereotypes.pojos;

/************************************
This POJO Java class is automatically generated from the SaExecHost stereotype
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@5947c75e (name: Stereotype) (instanceClassName: null) (abstract: false, interface: false)
uml::Stereotype
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.tu4ume.epsilon.externaltools.SampleTool;

public class SaExecHost {



	/*
	Variable for the connection ends.
	*/ 
	private String __name = new String("Undefined");
	
	

		
	/*
	Variable for the attribute isSched.
	*/ 
	private List<String> _isSched = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schSlack.
	*/ 
	private List<String> _schSlack = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedUtiliz.
	*/ 
	private List<String> _schedUtiliz = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ISRswitchT.
	*/ 
	private List<String> _ISRswitchT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute ISRprioRange.
	*/ 
	private List<String> _ISRprioRange = new ArrayList<String>();
	

		
	/*
	Variable for the attribute commTxOvh.
	*/ 
	private List<String> _commTxOvh = new ArrayList<String>();
	

		
	/*
	Variable for the attribute commRcvOvh.
	*/ 
	private List<String> _commRcvOvh = new ArrayList<String>();
	

		
	/*
	Variable for the attribute cntxtSwT.
	*/ 
	private List<String> _cntxtSwT = new ArrayList<String>();
	

		
	/*
	Variable for the attribute clockOvh.
	*/ 
	private List<String> _clockOvh = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedPriRange.
	*/ 
	private List<String> _schedPriRange = new ArrayList<String>();
	

		
	/*
	Variable for the attribute memSize.
	*/ 
	private List<String> _memSize = new ArrayList<String>();
	

		
	/*
	Variable for the attribute utilization.
	*/ 
	private List<String> _utilization = new ArrayList<String>();
	

		
	/*
	Variable for the attribute throughput.
	*/ 
	private List<String> _throughput = new ArrayList<String>();
	

		
	/*
	Variable for the attribute isPreemptible.
	*/ 
	private List<String> _isPreemptible = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedPolicy.
	*/ 
	private List<String> _schedPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute otherSchedPolicy.
	*/ 
	private List<String> _otherSchedPolicy = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedule.
	*/ 
	private List<String> _schedule = new ArrayList<String>();
	

		
	/*
	Variable for the attribute processingUnits.
	*/ 
	private List<String> _processingUnits = new ArrayList<String>();
	

		
	/*
	Variable for the attribute host.
	*/ 
	private List<String> _host = new ArrayList<String>();
	

		
	/*
	Variable for the attribute protectedSharedResources.
	*/ 
	private List<String> _protectedSharedResources = new ArrayList<String>();
	

		
	/*
	Variable for the attribute schedulableResources.
	*/ 
	private List<String> _schedulableResources = new ArrayList<String>();
	

		
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
	Variable for the attribute speedFactor.
	*/ 
	private List<String> _speedFactor = new ArrayList<String>();
	

		
	/*
	Variable for the attribute mainScheduler.
	*/ 
	private List<String> _mainScheduler = new ArrayList<String>();
	
	/*
	Variable _type with the name of the stereotype
	*/ 
	public String __type = new String ("SaExecHost");

	public SaExecHost() {
		/*
		Variable for the attribute isSched.
		*/ 
		this._isSched = new ArrayList<String>();
		/*
		Variable for the attribute schSlack.
		*/ 
		this._schSlack = new ArrayList<String>();
		/*
		Variable for the attribute schedUtiliz.
		*/ 
		this._schedUtiliz = new ArrayList<String>();
		/*
		Variable for the attribute ISRswitchT.
		*/ 
		this._ISRswitchT = new ArrayList<String>();
		/*
		Variable for the attribute ISRprioRange.
		*/ 
		this._ISRprioRange = new ArrayList<String>();
		/*
		Variable for the attribute commTxOvh.
		*/ 
		this._commTxOvh = new ArrayList<String>();
		/*
		Variable for the attribute commRcvOvh.
		*/ 
		this._commRcvOvh = new ArrayList<String>();
		/*
		Variable for the attribute cntxtSwT.
		*/ 
		this._cntxtSwT = new ArrayList<String>();
		/*
		Variable for the attribute clockOvh.
		*/ 
		this._clockOvh = new ArrayList<String>();
		/*
		Variable for the attribute schedPriRange.
		*/ 
		this._schedPriRange = new ArrayList<String>();
		/*
		Variable for the attribute memSize.
		*/ 
		this._memSize = new ArrayList<String>();
		/*
		Variable for the attribute utilization.
		*/ 
		this._utilization = new ArrayList<String>();
		/*
		Variable for the attribute throughput.
		*/ 
		this._throughput = new ArrayList<String>();
		/*
		Variable for the attribute isPreemptible.
		*/ 
		this._isPreemptible = new ArrayList<String>();
		/*
		Variable for the attribute schedPolicy.
		*/ 
		this._schedPolicy = new ArrayList<String>();
		/*
		Variable for the attribute otherSchedPolicy.
		*/ 
		this._otherSchedPolicy = new ArrayList<String>();
		/*
		Variable for the attribute schedule.
		*/ 
		this._schedule = new ArrayList<String>();
		/*
		Variable for the attribute processingUnits.
		*/ 
		this._processingUnits = new ArrayList<String>();
		/*
		Variable for the attribute host.
		*/ 
		this._host = new ArrayList<String>();
		/*
		Variable for the attribute protectedSharedResources.
		*/ 
		this._protectedSharedResources = new ArrayList<String>();
		/*
		Variable for the attribute schedulableResources.
		*/ 
		this._schedulableResources = new ArrayList<String>();
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
		Variable for the attribute speedFactor.
		*/ 
		this._speedFactor = new ArrayList<String>();
		/*
		Variable for the attribute mainScheduler.
		*/ 
		this._mainScheduler = new ArrayList<String>();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the SaExecHost POJO class
		
		SaExecHost _stereo = new SaExecHost();
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
	 * @return the isSched
	 */
	public List<String> getIsSched() {
		return this._isSched;
	}
	/**
	 * @param isSched the isSched to add
	 */
	public void addIsSched(String _isSched) {
		this._isSched.add(_isSched.toString());
	}
	/**
	 * @return the schSlack
	 */
	public List<String> getSchSlack() {
		return this._schSlack;
	}
	/**
	 * @param schSlack the schSlack to add
	 */
	public void addSchSlack(String _schSlack) {
		this._schSlack.add(_schSlack.toString());
	}
	/**
	 * @return the schedUtiliz
	 */
	public List<String> getSchedUtiliz() {
		return this._schedUtiliz;
	}
	/**
	 * @param schedUtiliz the schedUtiliz to add
	 */
	public void addSchedUtiliz(String _schedUtiliz) {
		this._schedUtiliz.add(_schedUtiliz.toString());
	}
	/**
	 * @return the ISRswitchT
	 */
	public List<String> getISRswitchT() {
		return this._ISRswitchT;
	}
	/**
	 * @param ISRswitchT the ISRswitchT to add
	 */
	public void addISRswitchT(String _ISRswitchT) {
		this._ISRswitchT.add(_ISRswitchT.toString());
	}
	/**
	 * @return the ISRprioRange
	 */
	public List<String> getISRprioRange() {
		return this._ISRprioRange;
	}
	/**
	 * @param ISRprioRange the ISRprioRange to add
	 */
	public void addISRprioRange(String _ISRprioRange) {
		this._ISRprioRange.add(_ISRprioRange.toString());
	}
	/**
	 * @return the commTxOvh
	 */
	public List<String> getCommTxOvh() {
		return this._commTxOvh;
	}
	/**
	 * @param commTxOvh the commTxOvh to add
	 */
	public void addCommTxOvh(String _commTxOvh) {
		this._commTxOvh.add(_commTxOvh.toString());
	}
	/**
	 * @return the commRcvOvh
	 */
	public List<String> getCommRcvOvh() {
		return this._commRcvOvh;
	}
	/**
	 * @param commRcvOvh the commRcvOvh to add
	 */
	public void addCommRcvOvh(String _commRcvOvh) {
		this._commRcvOvh.add(_commRcvOvh.toString());
	}
	/**
	 * @return the cntxtSwT
	 */
	public List<String> getCntxtSwT() {
		return this._cntxtSwT;
	}
	/**
	 * @param cntxtSwT the cntxtSwT to add
	 */
	public void addCntxtSwT(String _cntxtSwT) {
		this._cntxtSwT.add(_cntxtSwT.toString());
	}
	/**
	 * @return the clockOvh
	 */
	public List<String> getClockOvh() {
		return this._clockOvh;
	}
	/**
	 * @param clockOvh the clockOvh to add
	 */
	public void addClockOvh(String _clockOvh) {
		this._clockOvh.add(_clockOvh.toString());
	}
	/**
	 * @return the schedPriRange
	 */
	public List<String> getSchedPriRange() {
		return this._schedPriRange;
	}
	/**
	 * @param schedPriRange the schedPriRange to add
	 */
	public void addSchedPriRange(String _schedPriRange) {
		this._schedPriRange.add(_schedPriRange.toString());
	}
	/**
	 * @return the memSize
	 */
	public List<String> getMemSize() {
		return this._memSize;
	}
	/**
	 * @param memSize the memSize to add
	 */
	public void addMemSize(String _memSize) {
		this._memSize.add(_memSize.toString());
	}
	/**
	 * @return the utilization
	 */
	public List<String> getUtilization() {
		return this._utilization;
	}
	/**
	 * @param utilization the utilization to add
	 */
	public void addUtilization(String _utilization) {
		this._utilization.add(_utilization.toString());
	}
	/**
	 * @return the throughput
	 */
	public List<String> getThroughput() {
		return this._throughput;
	}
	/**
	 * @param throughput the throughput to add
	 */
	public void addThroughput(String _throughput) {
		this._throughput.add(_throughput.toString());
	}
	/**
	 * @return the isPreemptible
	 */
	public List<String> getIsPreemptible() {
		return this._isPreemptible;
	}
	/**
	 * @param isPreemptible the isPreemptible to add
	 */
	public void addIsPreemptible(String _isPreemptible) {
		this._isPreemptible.add(_isPreemptible.toString());
	}
	/**
	 * @return the schedPolicy
	 */
	public List<String> getSchedPolicy() {
		return this._schedPolicy;
	}
	/**
	 * @param schedPolicy the schedPolicy to add
	 */
	public void addSchedPolicy(String _schedPolicy) {
		this._schedPolicy.add(_schedPolicy.toString());
	}
	/**
	 * @return the otherSchedPolicy
	 */
	public List<String> getOtherSchedPolicy() {
		return this._otherSchedPolicy;
	}
	/**
	 * @param otherSchedPolicy the otherSchedPolicy to add
	 */
	public void addOtherSchedPolicy(String _otherSchedPolicy) {
		this._otherSchedPolicy.add(_otherSchedPolicy.toString());
	}
	/**
	 * @return the schedule
	 */
	public List<String> getSchedule() {
		return this._schedule;
	}
	/**
	 * @param schedule the schedule to add
	 */
	public void addSchedule(String _schedule) {
		this._schedule.add(_schedule.toString());
	}
	/**
	 * @return the processingUnits
	 */
	public List<String> getProcessingUnits() {
		return this._processingUnits;
	}
	/**
	 * @param processingUnits the processingUnits to add
	 */
	public void addProcessingUnits(String _processingUnits) {
		this._processingUnits.add(_processingUnits.toString());
	}
	/**
	 * @return the host
	 */
	public List<String> getHost() {
		return this._host;
	}
	/**
	 * @param host the host to add
	 */
	public void addHost(String _host) {
		this._host.add(_host.toString());
	}
	/**
	 * @return the protectedSharedResources
	 */
	public List<String> getProtectedSharedResources() {
		return this._protectedSharedResources;
	}
	/**
	 * @param protectedSharedResources the protectedSharedResources to add
	 */
	public void addProtectedSharedResources(String _protectedSharedResources) {
		this._protectedSharedResources.add(_protectedSharedResources.toString());
	}
	/**
	 * @return the schedulableResources
	 */
	public List<String> getSchedulableResources() {
		return this._schedulableResources;
	}
	/**
	 * @param schedulableResources the schedulableResources to add
	 */
	public void addSchedulableResources(String _schedulableResources) {
		this._schedulableResources.add(_schedulableResources.toString());
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