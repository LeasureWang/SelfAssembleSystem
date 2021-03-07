package net.leasure.sc.assemblesystem.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class NullOrEmptyException extends Exception implements Serializable {

    private static final long serialVersionUID = -1029337393943195146L;

    private String message;

    public NullOrEmptyException() {
        setMessage("Parameter is null or empty!");
    }

    public NullOrEmptyException(String message) {
        this.message = message;
    }
}
