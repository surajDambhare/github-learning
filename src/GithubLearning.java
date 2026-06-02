public class GithubLearning {

    public static void main(String[] args) {
        /*
            git init - Start Tracking a Folder
            This command turns a normal folder into a Git repository. Run it once inside the folder you want to track.

            # Navigate to your project folder
            cd school-project

            # Initialize Git
            git init

            Initialized empty Git repository in /school-project/.git/
            Git creates a hidden .git folder inside. This is Git's database - do not delete or edit it manually.

            git status - Check What Changed
            This is the command you will use most often. It shows you which files have been changed,
            which are staged, and which are not being tracked yet.

            git status
            git add - Stage Your Changes
            Move files from Working Directory to Staging Area.

            # Stage one specific file
            git add filename.txt

            # Stage multiple files
            git add file1.txt file2.txt

            # Stage all changed files
            git add .
            git commit - Save a Snapshot
            Save all staged files permanently with a message describing what changed.

            git commit -m "Your message here"
            Write your commit messages in present tense. Good examples:

            "Add login page"
            "Fix score calculation bug"
            "Update homepage design"
            git log - View History
            See a list of all commits (snapshots) you have made.

            # Full detailed history
            git log

            # Compact one-line version (easier to read)
            git log --oneline

            a1b2c3d Add login page
            9e8f7g6 Fix score bug
            5h4i3j2 Initial commit
            Press Q to quit the log view.

            git diff - See What Changed
            Shows you the actual lines that were added or removed in your files.

            git diff
            Complete Example: Gian's First Day
            # Day 1: Create project folder
            mkdir school-project
            cd school-project

            # Initialize Git
            git init

            # Create a file (using text editor, save as readme.txt)
            # Content: "School Project Tracker Project"

            # Check status
            git status
            Untracked files:
              readme.txt

            # Stage the file
            git add readme.txt

            # Commit
            git commit -m "Add readme file"

            # View history
            git log --oneline
            a1b2c3d Add readme file


        */
    }
}
