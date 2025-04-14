package supportRequestHandler;

import supportRequestHandler.logger.Logger;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Processed the request: " + issue);
        } else if (next != null) {
            Logger.log("FAQBot passes the request on...");
            next.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Can't process: " + issue);
        }
    }
}
