package supportRequestHandler;

import supportRequestHandler.logger.Logger;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Processed the request: " + issue);
        } else if (next != null) {
            Logger.log("FAQBot passes the request on...");
            next.handle(issue);
        } else {
            System.out.println("[FAQBot] Can't process: " + issue);
        }
    }
}
