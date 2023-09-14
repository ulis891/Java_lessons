package S12.ISP;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<PhonePayable> paymentsServises = new ArrayList<>();
        paymentsServises.add(new InternetPaymentService());
//        paymentsServises.add(new CustomPaymentServise());

        for (PhonePayable pay: paymentsServises) {
            pay.payPhoneNumber(3000);
            break;
        }
    }
}
