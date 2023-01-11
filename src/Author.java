import java.security.PrivateKey;

public class Author {
   private String authorFirstName;
   private String authorSecondName;

   public Author (String authorFirstName, String authorSecondName) {
      this.authorFirstName = authorFirstName;
      this.authorSecondName = authorSecondName;
   }

   public String getAuthorFirstName() {
      return authorFirstName;
   }

   public String getAuthorSecondName() {
      return authorSecondName;
   }

   public void setAuthorFirstName(String authorFirstName) {
      this.authorFirstName = authorFirstName;
   }

   public void setAuthorSecondName(String authorSecondName) {
      this.authorSecondName = authorSecondName;
   }
}
