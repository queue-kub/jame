import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloTime {

    /**
     * Method สำหรับทักทาย
     */
    public void greet() {
        System.out.println("สวัสดีครับ! 👋");
        System.out.println("ยินดีต้อนรับสู่โปรแกรม Java");
    }

    /**
     * Method สำหรับแสดงวันที่และเวลาปัจจุบัน
     */
    public void showCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("วันที่และเวลาปัจจุบัน: " + formattedDateTime);
    }
}
