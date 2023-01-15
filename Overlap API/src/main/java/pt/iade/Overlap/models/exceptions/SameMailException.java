package pt.iade.Overlap.models.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =  HttpStatus.CONFLICT)
public class SameMailException extends RuntimeException {
    private static final long serialVersionUID = 5405519103069955532L;
    public SameMailException( String element, String idmail) {
        super(element+ " with " +idmail+  " already exists!");
    }
}

