package ViewHelper;

public class View {
    private Helper helper;

    public View() {
        this.helper = new Helper();
    }

    public String generateResponse(String requestData) {
        // Process the request data, format it, or perform any necessary operations
        String formattedData = helper.formatData(requestData);

        // Generate the response by incorporating the formatted data
        String response = "<html><body>Response: " + formattedData + "</body></html>";

        return response;
    }
}