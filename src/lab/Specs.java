package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {
    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * เช็คหาค่าที่ต้องการการหาว่าตรงกับ key มั้ย
     * @param arr arr!=null 
     * @throws IllegalArgumentException ถ้า arr == null
     * @param key ค่าที่ต้องการหา
     * @return -1 ถ้า key ตรงกับ arr ตัวนั้นๆ
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * หาพื้นที่ของวงกลม
     * @param radius รัศมีของวงกลมต้องมากกว่า 0
     * @throws IllegalArgumentException ถ้ารัศมีน้อยกว่าเท่ากับ 0
     * @return พื้นทีร่วงกลม
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    /**
     * ตัดช่องว่างหน้า-หลังข้อความ แล้วแปลงเป็นตัวพิมพ์เล็ก
     * @param s ข้อความ ต้องไม่เป็น null
     * @return ข้อความที่เป็นพิมพ์เล็กและไม่มีช่องว่างหน้าหลัง
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
