public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = new Model();
    }

    public void add() {
        System.out.printf("Ваша заметка: ");
        model.add(view.getInput());
    }
    public String getNotes() {
        return model.getNotes();
    }

}
