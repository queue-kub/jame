package com.example; // ต้องใส่บรรทัดนี้ เพื่อให้รู้จักกับ HelloWorld

public class TestDriver {
    public static void main(String[] args) {

        // ส่วนทดสอบตัวแปร short
        System.out.println("--- Testing Variable ---");
        short number = 500;
        System.out.println("ค่า number ครั้งแรก: " + number);

        number = 10;
        System.out.println("ค่า number หลังเปลี่ยน: " + number);
        System.out.println("------------------------");

        // ส่วนเรียกใช้ HelloWorld
        System.out.println("--- Calling HelloWorld ---");
        HelloWorld hw = new HelloWorld(); // สร้าง object จาก class HelloWorld

        hw.greet(); // เรียก method greet
        hw.showCurrentTime(); // เรียก method showCurrentTime
    }
}