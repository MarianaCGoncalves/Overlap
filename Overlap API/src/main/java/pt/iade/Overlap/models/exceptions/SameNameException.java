package pt.iade.Overlap.models.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =  HttpStatus.CONFLICT)
public class SameNameException extends RuntimeException {
    private static final long serialVersionUID = 5405519103069955531L;
    public SameNameException( String element, String idname) {
        super(element+ " with " +idname+  " already exists! ");
    }
}
