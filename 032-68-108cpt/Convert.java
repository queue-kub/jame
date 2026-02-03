public class Convert {
    public static void main(String[] args) {

        Long thaiD = 1234567890231L;
        System.out.println(thaiD);

        String newID = thaiD.toString();
        System.out.println(newID);

        System.out.println("ID has " + newID.length() + " characters");
        System.out.println("ID contains 88: " + newID.contains("88"));
        System.out.println("ID starts with 37: " + newID.startsWith("37"));
        System.out.println("ID ends with 81: " + newID.endsWith("81"));
        System.out.println("First two characters: " + newID.substring(0, 2));
    }
}
