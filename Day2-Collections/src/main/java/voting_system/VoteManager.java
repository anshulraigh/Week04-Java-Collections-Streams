package voting_system;

import java.util.*;

class VoteManager {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVoteMap = new TreeMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayVotes() {
        System.out.println("\nVotes (Unordered): " + voteMap);
        System.out.println("Votes (Order of Voting): " + voteOrderMap);
        System.out.println("Votes (Sorted by Candidate Name): " + sortedVoteMap);
    }

    public void displayResults() {
        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(voteMap.entrySet());
        resultList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nFinal Results (Descending Order of Votes):");
        for (Map.Entry<String, Integer> entry : resultList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
