package uk.gov.hmcts.reform.iahomeofficemockapi.entities;

import org.springframework.http.HttpStatus;

// This is a copy of the ErrorCode.java file in the Home Office's code repository
// from which the error codes are generated.

/**
 * Business Error Codes use to report Error messages back to client.
 * <p>
 *     References:
  *         https://confluence.ipttools.info/display/AD/HMCTS+Integration+Target+3.1+Validation+API
 *         Section Business Error Codes
 * </p>
 *
 * Business Error Codes
 *         HTTP
 *  Code   Code    Success Response Message                                    Description
 * -----------------------------------------------------------------------------------------------------------------------------------------------------
 *  2010    500    false   Unable to retrieve results from a downstream system Downstream system is unavailable (AWS-SQS)
 *  2000    500    false   Unable to retrieve results from a downstream system Downstream system is unavailable (CSDP)
 *  1030    200    true    No item found for given DOCUMENT_REFERENCE          UAN/Case Reference does not refer to an application or reconsideration
 *  1010    200    true    No item found for given DOCUMENT_REFERENCE          UAN/Case Reference has a Service Delivery with no event history
 *  1040    400    false   Incorrect DOCUMENT_REFERENCE format                 UAN/Case Reference is submitted in the incorrect format
 *  1020    200    true    No item found for given DOCUMENT_REFERENCE          UAN/Case Reference returned no results
 *  1060    400    false   Invalid message format                              UAN/Case Reference has failed validation
 *  1070    400    false   Internal system error                               An internal system error has occurred
 *
 * A UAN/Case Reference returns multiple Service Deliveries    It's believed that multiple SD's is a valid business state TBC
 */

public enum ErrorCode {
    AWS_SQS_UNAVAILABLE("2010", HttpStatus.INTERNAL_SERVER_ERROR,"false","Unable to communicate with a downstream system", "A Downstream system is unavailable (AWS-SQS)"),
    CSDP_UNAVAILABLE("2000", HttpStatus.INTERNAL_SERVER_ERROR,"false","Unable to communicate with a downstream system", "A Downstream system is unavailable (CSDP)"),
    NO_VALID_SERVICE_DELIVERY_DETAILS("1030", HttpStatus.OK,"true","No valid item found for given DOCUMENT_REFERENCE", "A UAN/Case Reference does not refer to a valid application or reconsideration"),
    NO_EVENT_HISTORY_DETAILS("1010", HttpStatus.OK,"true","No outcome found for given DOCUMENT_REFERENCE","A UAN/Case Reference has a Service Delivery with no DECIDE_APPLICATION_OUTCOME event history"),
    METHOD_ARGUMENT_NOT_VALID("1040", HttpStatus.BAD_REQUEST,"false","Incorrect API format","Add the invalid message text if it is available."), // Input message fails validation
    NO_SERVICE_DELIVERY_DETAILS("1020", HttpStatus.OK,"true","No item found for given DOCUMENT_REFERENCE","Cannot build Search Response - no service delivery details found for UAN: "),
    MESSAGE_FORMAT_INVALID("1060", HttpStatus.BAD_REQUEST,"false","Invalid message format","A UAN/Case Reference is submitted in the incorrect format."), // Input message fails validation
    INTERNAL_SYSTEM_ERROR("1070", HttpStatus.BAD_REQUEST,"false","Internal system error","Add the Error text if it is available"), // Input message fails validation
    UNAUTHORISED_CONSUMER_ERROR("1080", HttpStatus.BAD_REQUEST,"false", "Unauthorised consumer", "This Consumer is not authorised to access this endpoint"),
    INVALID_MESSAGE_HEADERS("1090",HttpStatus.BAD_REQUEST,"false", "Invalid header", "The header value is incorrect");

    public static String INVALID_SEARCH_TEXT = "Messages with a search parameter of type DOCUMENT_REFERENCE";

    private final String code;
    private final HttpStatus http_code;
    private final String success;
    private final String message;
    private final String description;

    public String getCode() {
        return code;
    }

    public HttpStatus getHttp_code() {
        return http_code;
    }

    public String getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
    public String getDescription() {
        return description;
    }

    ErrorCode(String code, HttpStatus http_code, String success, String message, String description) {
        this.code = code;
        this.http_code = http_code;
        this.success = success;
        this.message = message;
        this.description = description;
    }
}
