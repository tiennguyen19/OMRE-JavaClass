import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class lesson7 {
    public static void main(String[] args) {
        int num;
        int dien , nuoc;
       int[] array ={22, 25, 4, 10, 6,11 , 21, 8,9};
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng phần tử của mảng:");
//        num = input.nextInt();
//        int array[] = new int[num];
//        System.out.println("Nhập vào các phần tử trong mảng:");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = input.nextInt();
        //Bai 255
        System.out.println("\nBai 255");
        Sort_Ascending(array);

        //Bai 169
        System.out.println("\n\nBai 169");
        if(warning(array)%2!=0)
            System.out.println("Warning: Số nhỏ nhất của mảng là một số lẻ nên không thể tìm đc số chẵn thỏa mãn điều kiện của đầu bài, vui long nhap lại gia tri cho mang");
        else
            System.out.println("Số chẵn lớn nhất nhỏ hơn mọi giá trị lẻ có trong mảng là: " +So_Chan_Lon_Nhat(array));

        //Bai 240
        System.out.println("\nBai 240");
        System.out.println("Mảng có chứa số 0 thì trả về kêt quả 1 còn không thì trả về 0, giá trị trả về la: " +So_Sanh(array));

        //Bai mở rộng: tính chi phí hàng tháng
        System.out.println("\nBai Mở Rộng");
        System.out.println("Nhập vào số điện dùng trong tháng: ");
        dien = input.nextInt();
        System.out.println("Nhập vào số khối nước dùng trong tháng: ");
        nuoc = input.nextInt();
        Locale locale = new Locale("VI", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Số tiền Nam phải trả hàng tháng là: " +currencyFormatter.format(Monthly_Fee(dien, nuoc)));
//        System.out.printf("Số tiền Nam phải trả hàng tháng là: %.0fVND", Monthly_Fee(dien, nuoc));
    }

    public static int So_Chan_Lon_Nhat(int[] array){
        int i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
            for (i = 0; i < array.length; i++) {
                if(array[i]%2!=0) {
                    break;
                }
            }
            return(array[i-1]);
    }

    public static int So_Sanh(int[] array){
        int a = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] == 0) a = 1;
        }
        return(a);
    }
    public static int warning(int[] array){
        int min = array[0];
        for(int i = 0; i< array.length; i++){
            if(min > array[i])
                min = array[i];
        }
        return(min);
    }
    public static void Sort_Ascending(int[] array) {
        int i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static double Monthly_Fee(int dien, int nuoc){
        double sum_dien, sum_nuoc, sum, sum_vnd;
        if(dien<=50)
            sum_dien = dien*1.678;
        else if(dien>50 && dien <=100)
            sum_dien=(50*1.678 + (dien-50)*1.734);
        else if(dien>100 && dien<=200)
            sum_dien=(50*1.678 + 50*1.734 + (dien-100)*2.014);
        else if(dien>200 && dien<=300)
            sum_dien=(50*1.678 + 50*1.734 + 100*2.014 + (dien-200)*2.536);
        else if(dien>300 && dien<=400)
            sum_dien=(50*1.678 + 50*1.734 + 100*2.014 + 100*2.536 + (dien-300)*2.834);
        else
            sum_dien=(50*1.678 + 50*1.734 + 100*2.014 + 100*2.536 + 100*2.834 + (dien-400)*2.927);
        sum_nuoc = nuoc*5;
        sum = 2500 + sum_nuoc + sum_dien;
        return(sum*1000);
    }
}

