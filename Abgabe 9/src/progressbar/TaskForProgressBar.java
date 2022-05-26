package progressbar;

public class TaskForProgressBar {
    public static void main(String[] args) {
        TaskForProgressBar taskForProgressBar = new TaskForProgressBar();
        taskForProgressBar.doSomething();
    }

    private void doSomething() {
        ProgressBar progressBar = new ProgressBar(30, "Fortschritt");
        GameView gameView = new GameView();
        for (int i = 0; i <= 100; i++) {
            progressBar.setPercentage(i);
            gameView.print(progressBar.toString(), 4);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) { }
        }
    }
}
