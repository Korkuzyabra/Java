public class RandomLetterChooser extends RandomStringChooser {

    RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str){
        return str.split("");
    }
    public static void main(String[] args) {
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }
}
