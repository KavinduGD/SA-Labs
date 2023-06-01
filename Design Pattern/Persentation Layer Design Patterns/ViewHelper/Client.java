package ViewHelper;

public class Client {
    public static void main(String[] args) {
        // Simulating a request from the client
        String requestData = "Some user input";

        // Creating a view and invoking the helper to generate the response
        View view = new View();
        String response = view.generateResponse(requestData);

        // Displaying the response to the user
        System.out.println(response);
    }
}