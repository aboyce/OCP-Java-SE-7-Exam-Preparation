package ocp.assertions_and_exceptions;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

public class Exceptions {

	public static void main(String[] args) {
		exceptions();
	}
	
	private static void exceptions() {
		multipleExceptionsOldWay();
		multipleExceptionsWithMultiCatch();
		
		try {
			multipleExceptionsWithMultiCatchAndRethrowing();
		} catch (SQLException | IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		autoclosableResourcesOldWay();
		autoclosableResourcesWithTryWithResources();
	}	
	
	private static void multipleExceptionsOldWay() {
		try {
			riskyMethod();	// Database and IO work	
		} catch (SQLException sqlEx) {
			sqlEx = new SQLException("This isn't real."); // This is legal.
			System.out.println("Exception: " + sqlEx.getMessage());
		} catch (IOException ioEx) {
			System.out.println("Exception: " + ioEx.getMessage());
		}
	}
	
	private static void multipleExceptionsWithMultiCatch() {
		try {
			riskyMethod();	// Database and IO work	
		} catch (SQLException | IOException e) {
			//e = new SQLException("This isn't real."); // This is NOT legal here.
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	private static void multipleExceptionsWithMultiCatchAndRethrowing() throws SQLException, IOException {
		try {
			riskyMethod();	// Database and IO work	
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			throw e;
			// This does not catch all exceptions.
			// Even though it could be an SQL or IO exception we can use shorthand.
			// Can use 'Exception' but really mean the Exceptions in 'throws'.
		}
	}
	
	private static void autoclosableResourcesOldWay() {
		Reader reader = null;
		try {
			readFromFile(reader);
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e2) {
					// Not much we can do here.
				}
			}
		}
	}
	
	private static void autoclosableResourcesWithTryWithResources() {
		try (MyAutoClosableResource resource = new MyAutoClosableResource()) {
			resource.doWork();
		}
		// No need for a finally or catch with Try-with-Resource.
		// Try-with-Resource is logically calling a 'finally' block to close the Reader.
	}
	
	private static void riskyMethod() throws SQLException, IOException{
		return;
	}
	
	private static void readFromFile(Reader reader) throws IOException{
		return;
	}
}
