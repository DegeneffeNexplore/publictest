package providerservice.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ResponseHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import providerservice.domain.MagicString;
import providerservice.domain.Operation;
import providerservice.service.MagicStringService;

@RestController
public class MagicStringController {

    @Autowired
    MagicStringService magicStringService;

    @ApiOperation(value = "Returns a magic text", response = MagicString.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Operation OK", response = MagicString.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})
    })
    @GetMapping(value = "/magicstring")
    public MagicString getMagicString() {
        return magicStringService.returnMagicString();
    }

    @ApiOperation(value = "Returns a magic text", response = MagicString.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Operation OK", response = MagicString.class, responseHeaders = {@ResponseHeader(name = "x-myheader", description = "test header", response = String.class)})
    })
    @PostMapping(value = "/magicstring")
    public ResponseEntity<MagicString> postMagicString(@RequestBody MagicString magicString){
        return ResponseEntity.status(200)
                .body(magicString);
    }
}
