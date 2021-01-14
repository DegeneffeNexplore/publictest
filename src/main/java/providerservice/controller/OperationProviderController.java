package providerservice.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import providerservice.domain.Operation;
import providerservice.service.OperationExecutor;

import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class OperationProviderController {
    @Autowired
    OperationExecutor executor;

    @ApiOperation(value = "Performs an operation", response = Operation.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Operation OK",response = Operation.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)}),
            @ApiResponse(code = 201, message = "Operation OK",response = Operation.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})
    })
    @PostMapping(value = "/operation/{operation}")
    public ResponseEntity<Operation> executeOperation(@RequestBody Operation operationModel, @PathVariable String operation) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("x-myheader", "test header");
        return ResponseEntity.status(201)
                .headers(responseHeaders)
                .body(executor.executeOperation(operationModel, operation));
    }
}
