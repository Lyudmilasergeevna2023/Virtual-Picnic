import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class СountingMethods {
    private List<String> foodstuff;
    private Map<String, Integer> counter;

     /**
     * Конструктор
     * @param list список продуктов
     */
    public СountingMethods(List<String> list) {
        foodstuff = new ArrayList<String>(list);
    }


    /**
     * Подсчет количества слов  в списке
     * @return количество слов
     */
    public int getCountWords() {
        return foodstuff.size();
    }


    /**
     * Поиск самого длинного слова в списке
     * @return самое длинное слово
     */
    public String getLongestWord() {
        String word = foodstuff.get(0);
        for (String item : foodstuff) {
            if (item.length() > word.length()) {
                word = item;
            }
        }
        return word;
    }


    /**
     * Подсчет количества повторений слов в списке
     */
    private void numberOfRepetitions() {
        counter = new HashMap<String,Integer>();
        for (String item : foodstuff) {
            if (item.length() > 1) {
                counter.putIfAbsent(item, 0);
                counter.put(item, counter.get(item) + 1);
            }                     
        }        
    }



     /**
     * Вывод счётчика слов в консоль 
     */
    public void numberOfRepetitionsPrint() {
        numberOfRepetitions();
        for(var item:counter.entrySet()){
            System.out.println(item.getKey() + " : " +item.getValue());
        }  
    }    
}
