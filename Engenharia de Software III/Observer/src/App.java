public class App {
  public static void main(String[] args) throws Exception {
    Publisher publisher = new Publisher();
    
    User joao = new User("João");
    User maria = new User("Maria");
    User claudio = new User("Cláudio");
    
    Group vips = new Group("Clientes VIPs");
    Publisher publishervips = new Publisher();
    publishervips.subscribe(vips);
    vips.addParticipant(maria);
    vips.addParticipant(maria);
    vips.addParticipant(claudio);

    publisher.subscribe(joao);
    publisher.subscribe(vips);

    publisher.publish("Novo artigo publicado!");

    publisher.unsubscribe(joao);

    publisher.publish("Promoção especial!");

    publishervips.publish("Artigo VIP publicado!");
  }
}
