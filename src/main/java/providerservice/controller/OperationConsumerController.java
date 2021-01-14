package providerservice.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import providerservice.domain.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static providerservice.businesslogic.GenericHelper.*;

@Api(value = "OperationConsumer")
@Path("/operationconsumer")
@Produces("application/json")
@RestController
public class OperationConsumerController {

    @ApiOperation(value = "Performs an addition operation", response = Operation.class)
    @ApiResponses({@ApiResponse(code = 200, message = "Operation OK", response = Operation.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})})
    @GetMapping(value = "/addition")
    public int getAddition(@RequestParam int number1, @RequestParam int number2) {
        return doAddition(number1, number2);
    }

    @ApiResponses({@ApiResponse(code = 200, message = "Operation OK", response = Operation.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})})
    @GetMapping(value = "/substraction")
    public int getSubstraction(@RequestParam int number1, @RequestParam int number2) {
        return doSubstraction(number1, number2);
    }
    
     @ApiResponses({@ApiResponse(code = 200, message = "Operation OK", response = Operation.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})})
    @GetMapping(value = "/substraction")
    public int getSubstraction(@RequestParam int number1, @RequestParam int number2) {
        return doSubstraction(number1, number2);
    }
}
