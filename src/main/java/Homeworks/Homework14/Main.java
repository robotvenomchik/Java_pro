package Homeworks.Homework14;


public class Main {
    public static void main(String[] args) {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        // Виведення нумерованого списку імен
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        // Виведення імені за індексом
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));

        // Пошук за частковим співпадінням
        uiOperator.getOutput(handler.searchByPartialName(repository.getData(), "Bo"));
    }
}

