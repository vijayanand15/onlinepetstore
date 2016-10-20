/**
 * 
 */
package com.cloud.dbservice;

/**
 * @author mvijayan
 *
 */
public class DBServiceClient {

	/**
	 * @param args
	 */
	
	private static DBServiceClient DBServiceclient ;//= new DBServiceClient( );
	private static String port1Name ;
	 private DBServiceClient(){ }
	 
	 private static boolean state=false;
	 /* Static 'instance' method */
	   public static String getInstance( ) {
		   if (!state){
			   state=true;
			   
			   System.out.println("******new *****************");
		        System.out.println("Create Web Service Client...");
		        DataBaseServiceService service1 = new DataBaseServiceService();
		        System.out.println("Create Web Service...");
		        DataBaseService port1 = service1.getDataBaseServicePort();
		        System.out.println("Call Web Service Operation...");
		        System.out.println("Server said: " + port1.getEntityManager());
		        System.out.println("***********************");
		        System.out.println("Call Over!");
		        port1Name=port1.getEntityManager();
	      
		   } else{
			   System.out.println(" sending one we have");
			 
		   }
		   return port1Name;
	   }
	public String getDBServiceName(){
        System.out.println("***********************");
        System.out.println("Create Web Service Client...");
        DataBaseServiceService service1 = new DataBaseServiceService();
        System.out.println("Create Web Service...");
        DataBaseService port1 = service1.getDataBaseServicePort();
        System.out.println("Call Web Service Operation...");
        System.out.println("Server said: " + port1.getEntityManager());
        System.out.println("***********************");
        System.out.println("Call Over!");
        return port1.getEntityManager();
}

}
