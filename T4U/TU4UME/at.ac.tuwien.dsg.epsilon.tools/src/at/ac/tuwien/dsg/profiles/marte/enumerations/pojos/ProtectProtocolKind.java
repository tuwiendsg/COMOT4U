package at.ac.tuwien.dsg.profiles.marte.enumerations.pojos;

/************************************
This POJO Java class is automatically generated from the ProtectProtocolKind enumeration
using EPSILON framework.
The corresponding EPSILON type is
org.eclipse.emf.ecore.impl.EClassImpl@113b5546 (name: Enumeration) (instanceClassName: null) (abstract: false, interface: false)
uml::Enumeration
This class provide a toJson method that serialize objects of this class in JSON using the GSON Library
************************************/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import at.ac.tuwien.dsg.epsilon.tools.SampleTool;

public class ProtectProtocolKind {


		
	/*
	Static Variable for the literal FIFO.
	*/ 
	public String _FIFO = new String("FIFO");
	

		
	/*
	Static Variable for the literal NoPreemption.
	*/ 
	public String _NoPreemption = new String("NoPreemption");
	

		
	/*
	Static Variable for the literal PriorityCeiling.
	*/ 
	public String _PriorityCeiling = new String("PriorityCeiling");
	

		
	/*
	Static Variable for the literal PriorityInheritance.
	*/ 
	public String _PriorityInheritance = new String("PriorityInheritance");
	

		
	/*
	Static Variable for the literal StackBased.
	*/ 
	public String _StackBased = new String("StackBased");
	

		
	/*
	Static Variable for the literal Undef.
	*/ 
	public String _Undef = new String("Undef");
	

		
	/*
	Static Variable for the literal Other.
	*/ 
	public String _Other = new String("Other");
	
	/*
	Variable __type with the name of the stereotype
	*/ 
	private final String __type = new String ("ProtectProtocolKind");

	public ProtectProtocolKind() {
	}


	public static void main(String[] args) {
		// TODO Auto-generated method to test the ProtectProtocolKind POJO class
		
		ProtectProtocolKind enumeration = new ProtectProtocolKind();
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
	 * @return the _FIFO
	 */
	public String getFIFO() {
		return _FIFO;
	}
	/**
	 * @return the _NoPreemption
	 */
	public String getNoPreemption() {
		return _NoPreemption;
	}
	/**
	 * @return the _PriorityCeiling
	 */
	public String getPriorityCeiling() {
		return _PriorityCeiling;
	}
	/**
	 * @return the _PriorityInheritance
	 */
	public String getPriorityInheritance() {
		return _PriorityInheritance;
	}
	/**
	 * @return the _StackBased
	 */
	public String getStackBased() {
		return _StackBased;
	}
	/**
	 * @return the _Undef
	 */
	public String getUndef() {
		return _Undef;
	}
	/**
	 * @return the _Other
	 */
	public String getOther() {
		return _Other;
	}
}