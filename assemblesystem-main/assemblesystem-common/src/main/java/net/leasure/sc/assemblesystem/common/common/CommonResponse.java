package net.leasure.sc.assemblesystem.common.common;

import lombok.*;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;

import static net.leasure.sc.assemblesystem.common.common.CommonResultStatus.ERR_INTERNAL_SERVER;
import static net.leasure.sc.assemblesystem.common.common.CommonResultStatus.SUCCESS;

@NoArgsConstructor
@Accessors(chain = true)
@Data
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 8632545455055835005L;

    private int code;
    private String message;
    private T data;

    private CommonResponse(CommonResultStatus resultStatus, T data) {
        this.code = resultStatus.getCode();
        this.message = resultStatus.getMessage();
        this.data = data;
    }

    // void success
    public static CommonResponse<Void> SUCCESS() {
        return new CommonResponse<>(SUCCESS, null);
    }

    // T success
    public static <T> CommonResponse<T> SUCCESS(T data) {
        return new CommonResponse<T>(SUCCESS, data);
    }

    // T success
    public static <T> CommonResponse<T> SUCCESS(CommonResultStatus resultStatus, T data) {
        if (ObjectUtils.isEmpty(resultStatus)) {
            return SUCCESS(data);
        }
        return new CommonResponse<T>(resultStatus, data);
    }

    // void error
    public static CommonResponse<Void> ERROR() {
        return new CommonResponse<>(ERR_INTERNAL_SERVER, null);
    }

    // T error
    public static <T> CommonResponse<T> ERROR(T data) {
        return new CommonResponse<T>(ERR_INTERNAL_SERVER, data);
    }

    // T error
    public static <T> CommonResponse<T> ERROR(CommonResultStatus resultStatus) {
        return ERROR(resultStatus, null);
    }

    // T error
    public static <T> CommonResponse<T> ERROR(CommonResultStatus resultStatus, T data) {
        if (ObjectUtils.isEmpty(resultStatus)) {
            return ERROR(data);
        }
        return new CommonResponse<T>(resultStatus, data);
    }
}
