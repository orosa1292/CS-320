/*************************
 * Name: 	Oscar Rosa 
 * Course: 	CS-320 
 * Date: 	April 13, 2024
 * Description: This is the test case for the Task class. 
 *************************/


package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Task.Task;

class TaskTest {

	/**
	 * Good constructor
	 */
	@DisplayName("Good constructor")
	@Test
	void goodContsructor() {
		
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is a good description";

		
        Task tempTask = new Task(id, fullName, description);
        
		assertEquals(1, tempTask.getUniqueID());
		assertEquals(fullName, tempTask.getName());
		assertEquals(description, tempTask.getDescription());		
	}
	
	/**
	 * Invalid constructor with description too long
	 */
	@DisplayName("Invalid constructor")
	@Test
	void invalidContsructor() {
		
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is an invalid description because the text is way toooooooooo long to be a real string and should not allow this to work";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });		
	}
	
	/**
	 * Invalid constructor with long IDs
	 */
	@DisplayName("Invalid constructor with long ID")
	@Test
	void invalidIDConstruct() {
		
        String id = "12345678910111213";
      	String fullName = "Alex Button";
        String description = "description";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });       
	}
	/**
	 * Invalid constructor with null IDs
	 */
	@DisplayName("Invalid constructor with long ID")
	@Test
	void invalidNullConstruct() {
		
        String id = null;
      	String fullName = "Alex Button";
        String description = "description";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });       
	}
	
	/**
	 * Test the setFullName with good input 
	 */
	@DisplayName("Test a valid setName")
	@Test
	public void testGoodName() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);  
        tempTask.setName("Test Name");        
        assertEquals("Test Name", tempTask.getName());
	}
	
	/**
	 * Test the setFullName with null input 
	 */
	@DisplayName("Test an invalid null setName")
	@Test
	public void testNullName() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName(null); 
        });	
	}
	
	/**
	 * Test the setFullName with long input 
	 */
	@DisplayName("Test an invalid long setName")
	@Test
	public void testLongName() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName("This name is incredibly long and why is this a name, anyway"); 
        });	
	}
	
	/**
	 * Test the setFullName with empty string 
	 */
	@DisplayName("Test an invalid empty setName")
	@Test
	public void testEmptyName() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName(""); 
        });	
	}
	
	/**
	 * Test the setDescription with empty string 
	 */
	@DisplayName("Test an invalid empty description")
	@Test
	public void testEmptyDescription() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = "";                 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);; 
        });	
	}
	
	/**
	 * Test the setDescription with null string 
	 */
	@DisplayName("Test an invalid empty description")
	@Test
	public void testNullDescription() {
        String id = "1";
      	String fullName = "Alex Button";
        String description = null;                 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);; 
        });	
	}
	

}
