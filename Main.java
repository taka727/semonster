public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER!!");
    Monster monster1 = new Monster();
    System.out.println(monster1.toString());
    System.out.println("Monster Deck");
    Player monster2 = new Player();
    monster2.drawMonsters();
    monster2.showDeck();

  }
}
