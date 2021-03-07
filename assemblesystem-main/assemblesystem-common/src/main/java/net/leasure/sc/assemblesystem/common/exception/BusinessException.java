package net.leasure.sc.assemblesystem.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BusinessException extends Exception implements Serializable {

    private static final long serialVersionUID = -8005020570032052179L;

    private String message;

    public BusinessException() {
        setMessage("Business logic exception!");
    }

    public BusinessException(String message) {
        this.message = message;
    }
}
