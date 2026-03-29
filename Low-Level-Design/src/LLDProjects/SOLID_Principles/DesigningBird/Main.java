package LLDProjects.SOLID_Principles.DesigningBird;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Eagle());
        game.render();
        Hen hen = new Hen();
        hen.color = "White";
        hen.name = "Tandoori Murgi";
        Game game1 = new Game(hen);
        game1.render();
        //Game game2 = new Game(new Penguin());   -> Penguin does not have fly method.
        Duck duck = new Duck();
        duck.color = "Yellow";
        duck.name = "Donald Duck";
        duck.swim();
        Game game3 = new Game(duck);
        game3.render();

        MySQLBirdRepository repo = new MySQLBirdRepository(null);
        repo.save(new Eagle());
        repo.save(hen);
        repo.save(new Penguin());
        repo.save(duck);

        BirdReportService reportService = new BirdReportService(repo);
        reportService.generateReport();
    }
}
