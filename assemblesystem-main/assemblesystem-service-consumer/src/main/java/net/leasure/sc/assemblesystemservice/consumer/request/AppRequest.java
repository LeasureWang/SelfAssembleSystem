package net.leasure.sc.assemblesystemservice.consumer.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class AppRequest implements Serializable {

    private static final long serialVersionUID = -2830611343423623578L;

    private long refNumber;
    private boolean status;
}
