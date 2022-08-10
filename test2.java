public class test2 {
    public static void main(String[] args) {
        String st = new String("Hello");
        char[] charsArray = st.toCharArray();
        System.out.println("Повторяющиеся символы здесь:");
        for (int i=0; i<st.length();i++){
            for(int j=i+1; j<st.length();j++)
                if (charsArray[i] == charsArray[j]) {
                    System.out.println(charsArray[i]);
                    break;
                }
        }


    }
}
