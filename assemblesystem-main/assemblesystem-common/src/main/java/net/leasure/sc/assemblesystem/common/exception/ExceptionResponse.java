package net.leasure.sc.assemblesystem.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class ExceptionResponse implements Serializable {

    private static final long serialVersionUID = 5214622470425600273L;

    public static final int ERROR_CODE = -1;

    private int code;
    private String message;
    private String url;
    private ExceptionInfo exceptionInfo;
}