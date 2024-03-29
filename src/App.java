public class App {
    public static void main(String[] args) {
        FileProcessing fp = new FileProcessing();
        СountingMethods count = new СountingMethods(fp.getFileText());

        System.out.println("Количество слов в файле `input.txt`: " + count.getCountWords());
        System.out.println("Самое длинное слово в файле `input.txt`: " + count.getLongestWord());
        System.out.println("Количество повторений слов в файле `input.txt` :");
        count.numberOfRepetitionsPrint();
    }
}
