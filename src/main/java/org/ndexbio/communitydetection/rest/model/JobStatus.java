package org.ndexbio.communitydetection.rest.model;

/**
 *
 * @author churas
 */
public class JobStatus {
    
    public static final String SUBMITTED_STATUS = "submitted";
    public static final String PROCESSING_STATUS = "processing";
    public static final String COMPLETE_STATUS = "complete";
    public static final String FAILED_STATUS = "failed";

    public static final String COMMA_DELIM_STATUS = SUBMITTED_STATUS + "," +
                                                    PROCESSING_STATUS + "," +
                                                    COMPLETE_STATUS + "," +
                                                    FAILED_STATUS;
}
