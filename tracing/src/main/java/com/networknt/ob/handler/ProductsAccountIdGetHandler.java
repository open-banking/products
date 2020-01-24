package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class ProductsAccountIdGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        logger.debug("userId = " + userId);
        String accountId = exchange.getQueryParameters().get("AccountId").getFirst();
        logger.debug("accountId = " + accountId);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            switch(accountId) {
                case "22289":
                    responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"22289\",\"ProductId\":\"HSBC12234BAS\",\"ProductType\":\"BusinessCurrentAccount\",\"ProductName\":\"Business Current Account £12.50 Monthly Fee\",\"BCA\":{\"OtherFeesCharges\":{\"FeeChargeDetail\":[{\"FeeCategory\":\"Servicing\",\"FeeType\":\"ServiceCAccountFeeMonthly\",\"FeeAmount\":\"12.500\",\"ApplicationFrequency\":\"Monthly\",\"CalculationFrequency\":\"Daily\",\"Notes\":[\"Our tariff includes:\\n* depositing and sending cheques\\n* cash deposits up to the limit your tariff allows\\n* withdrawals\\n* Direct Debits, standing orders, bill payments\\n* Bas credits\\n* debit card payments\"]}]}}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/22289/product\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "31820":
                    responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"31820\",\"ProductType\":\"BusinessCurrentAccount\",\"ProductName\":\"Lloyds Business Current Account\",\"BCA\":{\"ProductDetails\":{\"Segment\":\"General\",\"FeeFreeLength\":\"18\",\"FeeFreeLengthPeriod\":\"Month\",\"Notes\":[\"The customer is no longer in the fee free period.\"]}}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/31820/product\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        } else if("ericbroda".equals(userId)) {
            switch(accountId) {
                case "42281":
                    responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"42281\",\"ProductId\":\"SNTNDR1234BSCA\",\"ProductType\":\"PersonalCurrentAccount\",\"ProductName\":\"Select Current Account\",\"PCA\":{\"OtherFeesCharges\":{\"FeeChargeDetail\":{\"FeeCategory\":\"Servicing\",\"FeeType\":\"ServiceCAccountFeeMonthly\",\"FeeAmount\":\"5.0\",\"CalculationFrequency\":\"Yearly\",\"ApplicationFrequency\":\"Monthly\",\"Notes\":[\"Personal support from a Relationship Manager.\",\"24 hour priority service at home and abroad\",\"Preferential products\",\"Access to Santander Select globally\"]}}}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/42281/product\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "41221":
                    responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"41221\",\"ProductType\":\"PersonalCurrentAccount\",\"ProductName\":\"Barclays Current Account\",\"MarketingStateId\":\"EAR2\",\"PCA\":{\"ProductDetails\":{\"Segment\":\"General\",\"MonthlyMaximumCharge\":\"32\",\"Notes\":[\"We'll only charge you a single fee - whichever is highest. So, for example, if your've exceeded your overdraft limit, exceeded your Emergency Borrowing Limit and had a transaction returned as unpaid, all on the same day, we'll only charge your the £8 Unpaid Transaction Fee\"]}}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/41221/product\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
