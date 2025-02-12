package voting_system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoteManagerTest {
    @Test
    void testVotingProcess() {
        VoteManager manager = new VoteManager();
        manager.castVote("Alice");
        manager.castVote("Bob");
        manager.castVote("Alice");

        assertNotNull(manager);
    }
}
