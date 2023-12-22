package com.hei.rojotiana.endpoint.rest.controller.health;

import com.hei.rojotiana.PojaGenerated;
import com.hei.rojotiana.repository.DummyRepository;
import com.hei.rojotiana.repository.DummyUuidRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {
    DummyRepository dummyRepository;
    DummyUuidRepository dummyUuidRepository;

    public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
    public static final ResponseEntity<String> KO =
            new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

    @GetMapping("/big-sum")
    public BigInteger bigSum(@RequestParam(name = "a") BigInteger operandA,
                             @RequestParam(name = "b")BigInteger operandB) {
        operandA = BigInteger.valueOf(1);
        operandB = BigInteger.valueOf(2);
        return operandA.add(operandB);
    }
}
