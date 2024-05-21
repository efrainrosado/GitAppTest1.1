package com.coderscampus.domain;

/**
 * Branches --> always start with the Main/Master Branch
 * Main/Master --> represents the code that's actually live on the internet (ie coderscampus.com)
 * UAT (User Acceptance Testing) - Code gets delivered to customers first. (Not Typical)
 * QA (Quality Assurance)- Its verified before being pushed to the main/master branch
 * DEV (Development) - Cutting edge of the app hasn't been tested yet. Hasn;t been through QA.
 * 
 * Environments
 * Production --> environment that points to main/master branch.
 * 
 * Branch off meaning makes a copy of main/master and creates brand new file that user can makes chnages on without being seen on live file (Main/Master)
 * 
 */




public class Profile {
	private Integer id;
	private String name;
	private String url;	
}
