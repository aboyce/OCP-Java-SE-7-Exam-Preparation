package ocp.assertions_and_exceptions;

public class MyAutoClosableResource implements AutoCloseable {

	@Override
	public void close(){
		closeLocalResources();
	}
	
	public void doWork() {
		
	}
	
	private void closeLocalResources() {
		// Code to clean everything up.
	}
}
