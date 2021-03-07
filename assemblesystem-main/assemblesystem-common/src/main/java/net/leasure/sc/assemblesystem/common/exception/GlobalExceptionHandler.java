package net.leasure.sc.assemblesystem.common.exception;

import net.leasure.sc.assemblesystem.common.common.CommonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public CommonResponse businessExceptionHandler(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            BusinessException exception) {
        return handleErrorInfo(handlerMethod, request, exception);
    }

    @ExceptionHandler(SystemException.class)
    @ResponseBody
    public CommonResponse systemExceptionHandler(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            SystemException exception) {
        return handleErrorInfo(handlerMethod, request, exception);
    }

    @ExceptionHandler(NullOrEmptyException.class)
    @ResponseBody
    public CommonResponse nullOrEmptyExceptionHandler(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            NullOrEmptyException exception) {
        return handleErrorInfo(handlerMethod, request, exception);
    }

    @ExceptionHandler(IllegalParamOrPropException.class)
    @ResponseBody
    public CommonResponse illegalPropExceptionHandler(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            IllegalParamOrPropException exception) {
        return handleErrorInfo(handlerMethod, request, exception);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResponse exceptionHandler(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            Exception exception) {
        return handleErrorInfo(handlerMethod, request, exception);
    }

    private CommonResponse<Object> handleErrorInfo(
            HandlerMethod handlerMethod,
            HttpServletRequest request,
            Exception exception) {

        CommonResponse<Object> errorResponse = new CommonResponse();
        errorResponse.setMessage(exception.toString())
                .setCode(ExceptionResponse.ERROR_CODE)
                .setData(ExceptionInfo.builder()
                        .className(className(handlerMethod.getBean().getClass().getName()))
                        .methodName(handlerMethod.getMethod().getName())
                        .url(request.getRequestURL().toString())
                        .build());
        return errorResponse;

    }

    private String className(String beanClass) {
        return beanClass.substring(beanClass.lastIndexOf(".") + 1);
    }
}