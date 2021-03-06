package br.com.jkavdev.hibicode.beerstore.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

//dando precedencia a este handler quando for exception.class
//mas podemos rever este caso, pois o erro que estava rolando era erro especifico
//de conversao do valor para o enum
@Order
@RestControllerAdvice
public class GeneralExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GeneralExceptionHandler.class);

    @Autowired
    private ApiExceptionHandler apiExceptionHandler;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleInternalException(Exception exception,
                                                                 Locale locale) {
        LOG.error("Error not expected", exception);
        final String errorCode = "error-1";
        final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        final ErrorResponse errorResponse = ErrorResponse.of(status, apiExceptionHandler.toApiError(errorCode, locale));
        return ResponseEntity.status(status).body(errorResponse);
    }

}
