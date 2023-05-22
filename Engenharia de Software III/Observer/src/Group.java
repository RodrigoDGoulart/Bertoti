import java.util.ArrayList;
import java.util.List;

public class Group implements Observer {
  private String name;
  private List<User> participants;

  public Group(String name) {
    this.name = name;
    this.participants = new ArrayList<User>();
  }

  public void addParticipant(User user){
    if (this.participants.indexOf(user) != -1) {
      System.out.println("Usuário já participa desse grupo");
    } else {
      this.participants.add(user);
      System.out.println("Usuário "+user.getNome()+" adicionado ao grupo "+this.name);
    }
  }

  public void deleteParticipant(User user){
    if(this.participants.remove(user)){
      System.out.println("Usuário "+user.getNome()+" removido.");
    } else {
      System.out.println("Usuario removido.");
    }
  }
  
  @Override
  public void update(String message) {
    for (User participant : participants) {
      participant.update(message);
    }
  }
}
