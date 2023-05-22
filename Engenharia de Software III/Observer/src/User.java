class User implements Observer {
  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getNome () {
    return this.name;
  }

  @Override
  public void update(String message) {
    System.out.println(name + " recebeu a mensagem: " + message);
  }
}