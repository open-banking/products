package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class ProductsGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"22289\",\"ProductId\":\"51B\",\"ProductType\":\"PersonalCurrentAccount\",\"ProductName\":\"321 Product\",\"PCA\":{}},{\"AccountId\":\"31820\",\"ProductId\":\"001\",\"ProductType\":\"BusinessCurrentAccount\",\"ProductName\":\"123 Product\",\"BCA\":{}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/products/\"},\"Meta\":{\"TotalPages\":1}}";
        } else if ("ericbroda".equals(userId)) {
            responseBody = "{\"Data\":{\"Product\":[{\"AccountId\":\"42281\",\"ProductId\":\"51B\",\"ProductType\":\"PersonalCurrentAccount\",\"ProductName\":\"321 Product\",\"PCA\":{}},{\"AccountId\":\"41221\",\"ProductId\":\"001\",\"ProductType\":\"BusinessCurrentAccount\",\"ProductName\":\"123 Product\",\"BCA\":{}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/products/\"},\"Meta\":{\"TotalPages\":1}}";
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
