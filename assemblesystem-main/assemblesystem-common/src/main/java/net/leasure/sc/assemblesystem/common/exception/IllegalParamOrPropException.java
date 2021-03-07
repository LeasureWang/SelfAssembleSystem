package net.leasure.sc.assemblesystem.common.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class IllegalParamOrPropException extends Exception implements Serializable {

    private static final long serialVersionUID = 4014698495919980865L;

    private String message;

    public IllegalParamOrPropException() {
        setMessage("Prop or param is illegal!");
    }

    public IllegalParamOrPropException(String message) {
        this.message = message;
        setMessage(String.format("Prop or param: %s is illegal!", message));
    }
}
