package supportRequestHandler;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("account_ban") || issue.equals("data_loss")) {
            System.out.println("[SeniorSupport] Processed the request: " + issue);
        } else {
            System.out.println("[SeniorSupport] Can't process: " + issue + " — escalate manually.");
        }
    }
}
