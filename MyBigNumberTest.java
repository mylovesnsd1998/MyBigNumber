import org.junit.Test;
import static org.junit.Assert.*;


public class MyBigNumberTest {

    @Test
    public void testSum() {
        MyBigNumber a = new MyBigNumber();
        String sum = a.cong2so("123", "123");
        assertEquals("Correct", "246", sum);
    }

    @Test
    public void testSum2() {
        MyBigNumber a = new MyBigNumber();
        String sum = a.sum("123", "abc");
        assertEquals("Correct", "Vui lòng không nhập chữ hoặc ký tự đặt biệt !", sum);
    }

    @Test
    public void testSum3() {
        MyBigNumber a = new MyBigNumber();
        String sum = a.sum("-123", "123");
        assertEquals("Correct", "Phần mềm chưa hỗ trợ số âm !", sum);
    }

    
}