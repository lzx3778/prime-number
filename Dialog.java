import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class Dialog{
	public static void main(String[] args){
		System.out.print("2,"+"3,");
		int numbers = 10000000;
		int line = 10;
		int count = 0;
		int C = 0;
		int num[] = new int[(numbers/100)+1];
		for (int i = 1;i < numbers;i += 2){
			boolean b = false;
			for (int j = 2;j <= Math.sqrt(i);j++){
				if (i % j == 0){
					b = false;
					break;
				}else{
					b = true;
				}
			}
			if (b == true){
				count ++;
				if (i > (line*10)){
					System.out.print("\n");
					line += 10;
					num[line/10] = C;
					C = 0;
				}
				System.out.print(i+",");
				C += 1;
			}
		}
		System.out.println("\n"+"prime numbers:");
		for (int i = 0;i < num.length;i++){
			if (num[i] != 0){
				System.out.print(num[i]+",");
			}
		}
		System.out.print("\n"+count);
	}
}
