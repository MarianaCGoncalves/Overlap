package pt.iade.Overlap.models.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class AlreadyExistsException extends RuntimeException {
    private static final long serialVersionUID = -5584588059752755463L;

    public AlreadyExistsException() {
        super("Already exists.");
    }
}