package net.leasure.sc.assemblesystem.common.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public enum CommonResultStatus {

    SUCCESS(2000, "SUCCESS"),

    // client error
    ERR_BAD_REQUEST(4000, "Bad Request"),
    ERR_INVALID_PARAMS(4001, "request params invalid"),
    ERR_INVALID_ACCESS_TOKEN(4002, "Access token invalid"),
    ERR_FORBIDDEN(4003, "Forbidden"),
    ERR_UNAUTHORIZED(4004, "Unauthorized"),

    // server error
    ERR_INTERNAL_SERVER(5000, "System internal error"),
    ERR_MYSQL_ERROR(5001, "Mysql exception"),
    ERR_REDIS_ERROR(5002, "Redis exception"),
    ERR_KAFKA_ERROR(5003, "Kafka exception"),
    ERR_CALL_PROXY_SERVICE_FAILED(5004, "Call proxyService failed");

    private int code;
    private String message;
}
