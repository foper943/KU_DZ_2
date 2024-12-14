package example;


import java.util.List;

public class CommitNode {
    private final String commitHash;
    private final String commitMessage;
    private final List<String> modifiedFiles;
    private final List<String> parentHashes;

    public CommitNode(String commitHash, String commitMessage, List<String> modifiedFiles, List<String> parentHashes) {
        this.commitHash = commitHash;
        this.commitMessage = commitMessage;
        this.modifiedFiles = modifiedFiles;
        this.parentHashes = parentHashes;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public List<String> getModifiedFiles() {
        return modifiedFiles;
    }

    public List<String> getParentHashes() {
        return parentHashes;
    }
}

