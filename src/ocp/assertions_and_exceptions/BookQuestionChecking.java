package ocp.assertions_and_exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class BookQuestionChecking {

	public static void main(String[] args) {
		BookQuestionChecking bqc = new BookQuestionChecking();
		try {
			bqc.fileBlowUp();
			bqc.databaseBlowUp();
		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}
	
	void fileBlowUp() throws IOException {
		throw new IOException();
	}	
}