package uk.gov.hmcts.reform.iahomeofficemockapi.handlers;

import com.fasterxml.jackson.databind.JsonMappingException;
import javax.validation.ConstraintViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import uk.gov.hmcts.reform.iahomeofficemockapi.entities.ErrorCode;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.ErrorResponse;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchErrorResponse;

@RestControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<SearchErrorResponse> handleConstraintViolation(
            ConstraintViolationException ex) {

        ErrorCode errorCode = ErrorCode.MESSAGE_FORMAT_INVALID;
        SearchErrorResponse errorResponse = getErrorResponse(ex, errorCode);

        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(MissingRequestHeaderException.class)
    public ResponseEntity<SearchErrorResponse> handleMissingRequestHeader(
            MissingRequestHeaderException ex) {

        ErrorCode errorCode = ErrorCode.INVALID_MESSAGE_HEADERS;
        SearchErrorResponse errorResponse = getErrorResponse(ex, errorCode);
        
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<SearchErrorResponse> handleIllegalArgument(
            IllegalArgumentException ex) {

        ErrorCode errorCode = ErrorCode.INVALID_MESSAGE_HEADERS;
        SearchErrorResponse errorResponse = getErrorResponse(ex, errorCode);
        
        return ResponseEntity.badRequest().body(errorResponse);
    }

    @ExceptionHandler(JsonMappingException.class)
    public ResponseEntity<SearchErrorResponse> handleJsonMappingException(
            JsonMappingException ex) {

        ErrorCode errorCode = ErrorCode.MESSAGE_FORMAT_INVALID;
        SearchErrorResponse errorResponse = getErrorResponse(ex, errorCode);
        
        return ResponseEntity.badRequest().body(errorResponse);
    }

    private SearchErrorResponse getErrorResponse(Exception ex, ErrorCode errorCode) {
        ErrorResponse errorDetail = new ErrorResponse();
        errorDetail.setSuccess(ErrorResponse.SuccessEnum.fromValue(errorCode.getSuccess()));
        errorDetail.setMessageText(errorCode.getMessage() + ": " + ex.getMessage());
        errorDetail.setErrorCode(ErrorResponse.ErrorCodeEnum.fromValue(errorCode.getCode()));

        SearchErrorResponse errorResponse = new SearchErrorResponse();
        MessageHeader messageHeader = new MessageHeader();
        errorResponse.setMessageHeader(messageHeader);
        errorResponse.setErrorDetail(errorDetail);
        return errorResponse;
    }
}