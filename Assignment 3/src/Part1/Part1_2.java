import java.util.Scanner;

public class Part1_2 {
    // Multiple Inheritance

    public static void main(String[] args) {
        TechManager techManager = new TechManager();
        techManager.addDetails();
        techManager.displayDetails();
    }

    /// java doesn't support multiple inheritance via subclassing so i implemented interfaces
    /// which means `class TechManager extends Engineer, Manager` -> will not work.
    /// (protocols defining the functions that Engineer/Manager Class would have had and behaves similar to how multiple inheritance works in cpp.)
    interface Engineer {
        void setEngField(String Field);
        String getEngField();
    }

    interface Manager {
        void setTeamSize(int size);
        int getTeamSize();
    }

    static class TechManager implements Engineer, Manager {
        Scanner scanner = new Scanner(System.in);

        String engField;
        int teamSize;

        public void setEngField(String engField) {
            this.engField = engField;
        }

        public String getEngField() {
            return engField;
        }

        public void setTeamSize(int teamSize) {
            this.teamSize = teamSize;
        }

        public int getTeamSize() {
            return teamSize;
        }

        void addDetails() {
            System.out.println("Enter Engineering Field: ");
            setEngField(scanner.nextLine());

            System.out.println("Enter Team Size: ");
            setTeamSize(scanner.nextInt());
        }

        void displayDetails() {
            System.out.println("Field: " + getEngField());
            System.out.println("Team Size: " + getTeamSize());
        }
    }
}