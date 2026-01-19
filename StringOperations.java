public class StringOperations {
    public static void main(String[] args) {
        // Name stuff
        String myName = "Anvita";
        System.out.println(myName);
        String newName = "A" + myName.substring(1);
        newName = newName.substring(0, newName.length() - 1) + "Z";
        System.out.println(newName);
        
        // URL stuff
        String webURL = "www.harvard.edu";
        System.out.println(webURL);
        int start = 4;
        int end = webURL.indexOf('.', start);
        String name = webURL.substring(start, end);
        String result = name + "1331";
        System.out.println(result);
    }
}
