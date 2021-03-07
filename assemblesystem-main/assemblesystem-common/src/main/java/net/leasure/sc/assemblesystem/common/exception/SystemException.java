package net.leasure.sc.assemblesystem.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SystemException extends Exception implements Serializable {

    private static final long serialVersionUID = 8203104847535112078L;

    private String message;

    public SystemException() {
        setMessage("Backend system exception!");
    }

    public SystemException(String message) {
        this.message = message;
    }
}
