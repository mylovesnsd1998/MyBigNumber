package javaapplication1;

/**
 * 
 *
 * Author: NhatMinh
 * Trong class có một hàm là hàm cong2so.
 * 
 */

public class MyBigNumber {

    /** 
     * 
     * Cộng các số từ hai chuôi. 
     * Không giới hạn độ dài hai chuỗi.
     * 
     */
    
    public String cong2so(final String number1, final String number2) {
        // Xử lý hai hàm chuỗi 
        // Tạo biến final
        
        int so1;        // Số của char1 ở vị trí index1
        int so2;        // Số của char2 ở trị ví index2        
        int tongtam;    // Tổng tạm của số thứ nhất và số thứ hai;
        
        int cong;       // Biến nhớ nếu tổng tạm < 10                
        int nho = 0;    // Biến nhớ nếu tongtam >= 10   
        
        int index1;     // Vị trí đang chạy của số thứ 1
        int index2;     // Vị trí đang chạy của số thứ 2
        
        char char1;     // kí tự vị trí 1 của chuỗi số thứ nhất
        char char2;     // kí tự vị trí 2 của chuỗi số thứ hai
        
        int len1 = number1.length();// Độ dài của số thứ 1
        int len2 = number2.length();// Độ dài của số thứ 2
        
        int maxLen = (len1 > len2) ? len1 : len2; // Tìm độ dài của 2 số
        String dapancuoi = ""; // Hiển thị chuỗi đáp án của cộng 2 số        
        
        //        
        // Lặp số lần của chuỗi dài nhất
        //
        for (int i = 0; i < maxLen; i++) {
            index1 = len1 - i - 1; //index1 của chuỗi 1
            index2 = len2 - i - 1; //index2 của chuỗi 2

            char1 = (index1 >= 0) ? number1.charAt(index1) : '0'; //Ký tự char1 ở vị trí i
            char2 = (index2 >= 0) ? number2.charAt(index2) : '0'; //Ký tự char2 ở vị trí i

            so1 = char1 - '0'; //Bảng mã ASCII chữ thứ nhất vị trí số char1
            so2 = char2 - '0'; //Bảng mã ASCII chữ thứ hai vị trí số char2

            tongtam = so1 + so2 + nho; // Tổng cộng 2 số thứ nhất và số thứ 2 
            cong = so1 + so2; // Cộng tổng hai số

            dapancuoi = (tongtam % 10) + dapancuoi; // Lấy số vừa tính gán vào biến dapancuoi
            nho = tongtam / 10; //Biến nhớ
            
        }
        
        //  
        //Nếu có biến nhớ ghép thêm biến nhớ vào phía trước đáp án
        //
        if (nho > 0) {
            dapancuoi = nho + dapancuoi; // Cộng số nhớ ở vị trí index = 1 
        }
        
        return dapancuoi;
    } 
}