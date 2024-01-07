//Provis

package StepDefinations;

import org.apache.log4j.Logger;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;


import PageObjects.LoginPage;
import PageObjects.MoveInRequest_Pom_OWNER;
import PageObjects.ADDTRIP_POM_OWNER;
import PageObjects.AccessPassRequest_POM_OWNER;
import PageObjects.AddUnit_POM_OWNER;
import PageObjects.AmenityBooking_POM_OWNER;
import PageObjects.ClassesOffering_POM_OWNER;
import PageObjects.CommunityChat_POM_OWNR;
import PageObjects.DeliveryDisposalRequest_POM_OWNER;
import PageObjects.MoveOutRequest_POM_OWNER;
import PageObjects.MoveinWithinBuilding_POM_OWNER;
import PageObjects.NOC_ForUnitSale;
import PageObjects.NOC_For_UnitAlteration;
import PageObjects.NOC_For_Utilities;
import PageObjects.NOCforTrafficPoliceDamagetoProperty_POM_OWNER;
import PageObjects.PayBill_POM_Owner;
import PageObjects.ReportanIssueAgainstAnotherUnit_POM_OWNER;
import PageObjects.ReportanIssueinCommonArea_POM_OWNER;
import PageObjects.StaroftheMonthNomination_POM_OWNER;
import PageObjects.TenancyContractExtensionRequest_POM_OWNER;
import PageObjects.VisitorRegistration_POM_OWNER;


public class BaseClass
{
	public WebDriver driver;
	
	
	
	
	public LoginPage lp;
	public ClassesOffering_POM_OWNER CO_O;
	public AmenityBooking_POM_OWNER AB_O;
	public CommunityChat_POM_OWNR CC_O;
	public StaroftheMonthNomination_POM_OWNER SM_O;
	public ReportanIssueAgainstAnotherUnit_POM_OWNER RU_O;
	public ReportanIssueinCommonArea_POM_OWNER RI_O;
	public AccessPassRequest_POM_OWNER AP_O;
	public AddUnit_POM_OWNER AD_O;
	public DeliveryDisposalRequest_POM_OWNER DD_O;
	public MoveInRequest_Pom_OWNER MR_O;
	public MoveinWithinBuilding_POM_OWNER MIW_O;
	public MoveOutRequest_POM_OWNER MOR_O;
	public NOCforTrafficPoliceDamagetoProperty_POM_OWNER NOC_O;
	public TenancyContractExtensionRequest_POM_OWNER TC_O;
	public VisitorRegistration_POM_OWNER VR_O;
	public ADDTRIP_POM_OWNER ADD_O;
	public PayBill_POM_Owner PB_O;
	
	public NOC_ForUnitSale NFU;
	public NOC_For_Utilities NUTL;
	public NOC_For_UnitAlteration NALT;
	
	
	
	
	
	public static Logger logger;

}
