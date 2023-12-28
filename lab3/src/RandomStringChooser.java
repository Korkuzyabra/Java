import java.util.ArrayList;
    public class RandomStringChooser {
        private ArrayList<String> list;

        public RandomStringChooser(String[] words) {

            list = new ArrayList<String>();

            for (String a : words) {
                list.add(a);
            }
        }

        public String getNext() {

            if (list.size() == 0) {
                return "NONE";
            }
            int i = (int) (Math.random() * list.size());
            return list.remove(i);
        }

        public static void main(String[] args) {

            String[] wordArray = {"wheels", "on", "the", "bus"};
            RandomStringChooser sChooser = new RandomStringChooser(wordArray);

            for (int k = 0; k < 6; k++) {
                System.out.print(sChooser.getNext() + " ");
            }

        }
    }