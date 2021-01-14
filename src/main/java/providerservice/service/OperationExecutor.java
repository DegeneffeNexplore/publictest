package providerservice.service;

import org.springframework.stereotype.Service;

import static providerservice.businesslogic.GenericHelper.*;

import providerservice.domain.Operation;

@Service
public class OperationExecutor {
    public Operation executeOperation(Operation op, String operationType) throws Exception{
        switch (operationType) {
            case "addition":
                runAddition(op);
                break;
            case "substraction":
                runSubstraction(op);
                break;
            default:
                throw new Exception("Not supported operation");

        }
        return op;
    }
  public Operation executeOperation2(Operation op, String operationType) throws Exception{
        switch (operationType) {
            case "addition":
                runAddition(op);
                break;
            case "substraction":
                runSubstraction(op);
                break;
            default:
                throw new Exception("Not supported operation");

        }
        return op;
    }
    private void runSubstraction(Operation op) {
        op.setResult(doSubstraction(op.getNumber1(), op.getNumber2()));
    }

    private void runAddition(Operation op) {
        op.setResult(doAddition(op.getNumber1(), op.getNumber2()));
    }
}
