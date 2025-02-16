package annotations.practiceproblems.advanced.jsonfield;

public class JsonSerializationDemo {
    public static void main(String[] args) {
        User user = new User("Anshul", 25, "This will be ignored");
        String jsonString = JsonSerializer.serialize(user);
        System.out.println("Serialized JSON: " + jsonString);
    }
}
