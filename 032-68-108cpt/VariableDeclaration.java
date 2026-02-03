/**
 * โปรแกรมแสดงการประกาศตัวแปรแบบต่างๆ ใน Java
 */
public class VariableDeclaration {

    public static void main(String[] args) {
        System.out.println("=== การประกาศตัวแปรแบบต่างๆ ใน Java ===\n");

        // ========================================
        // 1. ตัวแปรชนิด Primitive Types
        // ========================================
        System.out.println("--- 1. Primitive Types ---");

        // 1.1 Integer Types (ตัวเลขจำนวนเต็ม)
        byte myByte = 127; // 8-bit (-128 to 127)
        short myShort = 32000; // 16-bit (-32,768 to 32,767)
        int myInt = 2147483647; // 32-bit
        long myLong = 9223372036854775807L; // 64-bit (ต้องมี L ต่อท้าย)

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);

        // 1.2 Floating-Point Types (ตัวเลขทศนิยม)
        float myFloat = 3.14159f; // 32-bit (ต้องมี f ต่อท้าย)
        double myDouble = 3.141592653589793; // 64-bit

        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);

        // 1.3 Character Type (ตัวอักษร)
        char myChar = 'A';
        char myCharUnicode = '\u0E01'; // ก ในภาษาไทย

        System.out.println("char: " + myChar);
        System.out.println("char (Thai): " + myCharUnicode);

        // 1.4 Boolean Type (ค่าความจริง)
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("boolean (true): " + isJavaFun);
        System.out.println("boolean (false): " + isFishTasty);

        // ========================================
        // 2. Reference Types (Non-Primitive)
        // ========================================
        System.out.println("\n--- 2. Reference Types ---");

        // 2.1 String
        String greeting = "สวัสดีครับ";
        String name = "Java Programming";

        System.out.println("String: " + greeting);
        System.out.println("String: " + name);

        // 2.2 Array (อาเรย์)
        int[] numbers = { 1, 2, 3, 4, 5 };
        String[] fruits = { "Apple", "Banana", "Orange" };

        System.out.print("int[]: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("String[]: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // ========================================
        // 3. การประกาศแบบต่างๆ
        // ========================================
        System.out.println("\n--- 3. รูปแบบการประกาศ ---");

        // 3.1 ประกาศแล้วกำหนดค่าทีหลัง
        int laterValue;
        laterValue = 100;
        System.out.println("ประกาศก่อน กำหนดค่าทีหลัง: " + laterValue);

        // 3.2 ประกาศหลายตัวแปรพร้อมกัน
        int a = 1, b = 2, c = 3;
        System.out.println("ประกาศหลายตัว: a=" + a + ", b=" + b + ", c=" + c);

        // 3.3 ค่าคงที่ (Constant) ด้วย final
        final double PI = 3.14159;
        final String APP_NAME = "My Java App";
        System.out.println("final double: " + PI);
        System.out.println("final String: " + APP_NAME);

        // 3.4 Type Inference ด้วย var (Java 10+)
        var autoInt = 42; // จะเป็น int อัตโนมัติ
        var autoString = "Hello"; // จะเป็น String อัตโนมัติ
        var autoDouble = 3.14; // จะเป็น double อัตโนมัติ

        System.out.println("var (int): " + autoInt);
        System.out.println("var (String): " + autoString);
        System.out.println("var (double): " + autoDouble);

        // ========================================
        // 4. ค่า Default ของตัวแปร
        // ========================================
        System.out.println("\n--- 4. ตารางสรุป Primitive Types ---");
        System.out.println("+-----------+--------+------------------------+");
        System.out.println("| Type      | Size   | Range                  |");
        System.out.println("+-----------+--------+------------------------+");
        System.out.println("| byte      | 8-bit  | -128 to 127            |");
        System.out.println("| short     | 16-bit | -32,768 to 32,767      |");
        System.out.println("| int       | 32-bit | -2^31 to 2^31-1        |");
        System.out.println("| long      | 64-bit | -2^63 to 2^63-1        |");
        System.out.println("| float     | 32-bit | ~7 decimal digits      |");
        System.out.println("| double    | 64-bit | ~15 decimal digits     |");
        System.out.println("| char      | 16-bit | 0 to 65,535 (Unicode)  |");
        System.out.println("| boolean   | 1-bit  | true or false          |");
        System.out.println("+-----------+--------+------------------------+");

        System.out.println("\n=== จบโปรแกรม ===");
    }
}
