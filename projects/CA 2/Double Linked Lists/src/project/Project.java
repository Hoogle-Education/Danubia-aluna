package project;

import project.enums.Status;

/**
 *
 * @author Danubia
 */

//attributes
public class Project {
    private String code;
    private String manager;
    private String description;
    private int duration;
    private  Status status;

   //Constructor
    public Project(String code, String manager, String description, int duration, Status status) {
        /* we decide what we want to do when the object is created */

        this.code = code;
        this.manager = manager;
        this.description = description;
        this.duration = duration;
        this.status = status;
    }

    
    //we want java to print the project details in the following format
    //Project Details


    //Project Code: "X123"
    //Managers Name: "Enda Stafford"
    //Project Description: "Widget Development"
    //Project Duration: "1500"
    //Project Status: "On track"


    
    // Setter and Getters

     public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getManager() {
		return manager;
	}


	public void setManager(String manager) {
		this.manager = manager;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
    public String toString() {
        String output = "";
        output += "Project Code            :" + this.code + "\n";
        output += "Manager Name            : " + this.manager + "\n";
        output += "Project Description     : " + this.description + "\n";
        output += "Project Duration        : " + this.status + "\n";
        String sStatus = "";
        if(this.status==Status.ONTRACK) {
            sStatus = "On track";
        } else  {
            sStatus = "Off track";
        }

        output += "Project Status             : " + sStatus;
        return output;
     }
}

      


