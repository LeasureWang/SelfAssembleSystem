package net.leasure.sc.assemblesystem.common.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@NoArgsConstructor
@Accessors(chain = true)
@Data
@Builder
@AllArgsConstructor
public class CommonRequest<T> implements Serializable {

    private static final long serialVersionUID = -8696070158624513964L;

    private String version;
    private String caller;
    private T body;
}
