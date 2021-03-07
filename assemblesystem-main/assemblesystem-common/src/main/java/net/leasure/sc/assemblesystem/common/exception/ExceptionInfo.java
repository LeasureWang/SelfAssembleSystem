package net.leasure.sc.assemblesystem.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Accessors(chain = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExceptionInfo implements Serializable {

    private static final long serialVersionUID = 552227000681192382L;

    private String url;
    private String className;
    private String methodName;
}
