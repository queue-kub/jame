package com.example;

import java.util.Scanner;
import java.util.Date; // เพิ่ม import เพื่อใช้แสดงเวลา

public class HelloWorld {

    // --- ส่วนที่ 1: Method main (โค้ดเดิมของคุณ) ---
    // ส่วนนี้จะทำงานเมื่อคุณสั่งรัน HelloWorld โดยตรง
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("สวัสดีครับ! ยินดีต้อนรับสู่โปรแกรม Java");
        System.out.print("กรุณาใส่ชื่อของคุณ: ");

        String name = scanner.nextLine();

        System.out.println("สวัสดีคุณ " + name + "! ขอบคุณที่ใช้โปรแกรมนี้");

        scanner.close();
    }

    // --- ส่วนที่ 2: เพิ่ม Method ใหม่ (เพื่อให้ TestDriver เรียกใช้ได้) ---

    // TestDriver จะเรียกใช้คำสั่งนี้
    public void greet() {
        System.out.println("สวัสดีครับ! (นี่คือข้อความจาก method greet)");
    }

    // TestDriver จะเรียกใช้คำสั่งนี้
    public void showCurrentTime() {
        System.out.println("ขณะนี้เวลา: " + new Date());
    }
}