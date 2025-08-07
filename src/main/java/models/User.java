import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table("...")
public class User {

    @id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String userID;
    private String name;
    private String email;
    private String savedProgramsKey;

    // Constructor:
    User(String id, String name, String email, String programKey) {
        this.userID = id;
        this.name = name;
        this.email = email; 
        this.savedProgramsKey = programKey;
    }

    // Getter and Setter for userID
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    // Getter and Setter for savedProgramsKey
    public String getSavedProgramsKey() {
        return savedProgramsKey;
    }

    public void setSavedProgramsKey(String savedProgramsKey) {
        this.savedProgramsKey = savedProgramsKey;
    }
}
