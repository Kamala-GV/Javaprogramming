package muhtarsTasks;

public class CatndDogs {
    public static void main(String[] args) {
        String sentence = "cat Dog " +
                " dog cat doG";
        int cat = 0;
        int dog = 0;
        sentence = sentence.toLowerCase();
        for (int i = 0; i <= sentence.length(); i++) {
            if (sentence.contains("cat")) {
                sentence=sentence.replaceFirst("cat"," ");
                cat++;
            } else if (sentence.contains("dog")) {
                sentence=sentence.replaceFirst("dog",";");
                dog++;
            }


        }
        boolean result=cat==dog;
        System.out.println(result);
    }
}

