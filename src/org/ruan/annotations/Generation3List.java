package org.ruan.annotations;

@ClassPreamble(author = "John Doe", date = "3/17/2002", currentRevision = 6, lastModified = "4/12/2004", lastModifiedBy = "Jane Doe", reviewers = {
		"Alice", "Bob", "Cindy" })
public class Generation3List {

	/**
	 * @deprecated
	 * explanation of why it was deprecated
	 */
	@Deprecated
	public void deprecatedMethod() {}
	
	
	public void methodThatCallsAnother() {
	
		deprecatedMethod();
		
	}
	
	
	
	
	
}

