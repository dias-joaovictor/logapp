package com.dias.logapp.invoke;

import com.amazonaws.services.lambda.runtime.Context;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.function.adapter.aws.FunctionInvoker;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Slf4j
public class CustomFunctionInvoker extends FunctionInvoker {

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
        log.info("Starting routine");
        try{
            super.handleRequest(input, output, context);
        } catch (Throwable e) {
          log.error(e.getMessage(), e);
          throw e;
        }

        log.info("Ending routine");
    }
}
