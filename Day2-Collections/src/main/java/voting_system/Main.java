package voting_system;

public class Main {
    public static void main(String[] args) {
        VoteManager manager = new VoteManager();

        manager.castVote("Alice");
        manager.castVote("Bob");
        manager.castVote("Alice");
        manager.castVote("Charlie");
        manager.castVote("Bob");
        manager.castVote("Alice");

        manager.displayVotes();
        manager.displayResults();
    }
}
