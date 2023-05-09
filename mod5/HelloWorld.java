public class HelloWorld {
    public static void main(String[] args) {

        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase ("DEV")) {
            System.out.println ("executando em dev");

        } else if (ambiente.equalsIgnoreCase ("TEST")) {
            System.out.println ("executando em test");

        } else {
            System.out.println ("executando em " + ambiente);
        }

        
    }
}