package com.oppo.pogatewayclientweb.handler.exception;

import com.oppo.pogatewayclientcommon.Result;
import com.oppo.pogatewayclientcommon.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Andy on 2021/6/5 14:03
 */
@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e){
        e.printStackTrace();
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }

    @ExceptionHandler(MyRuntimeException.class)
    @ResponseBody
    public Result myRuntimeException(MyRuntimeException e){
        e.printStackTrace();
        return Result.error().codeAndMessage(e.getCode(),e.getMessage());
    }
}
