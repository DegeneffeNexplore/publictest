package providerservice.service;

import org.springframework.stereotype.Service;
import providerservice.businesslogic.GenericHelper;
import providerservice.domain.MagicString;

import java.util.Date;

@Service
public class MagicStringService {
    public MagicString returnMagicString() {
        return new MagicString(new Date(), String.valueOf(GenericHelper.returnRandomNumber()));
    }
}
