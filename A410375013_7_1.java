import java.util.Scanner;

public class A410375013_7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String first = sc.nextLine();			//輸入兩次
			String second = sc.nextLine();
			
			int max ;
			if(first.length()>second.length()){		//找出最多可能相同字元數
				max = first.length();
			}
			else{
				max = second.length();
			}

			int matchnum = 0;						//計算真正相同字元數
			char[] secondinch = second.toCharArray();	//將字串二轉為自元陣列
			
			char [] output = new char[max];			//宣告自元陣列用以存放結果
			
			for(int i =0;i<first.length();i++){		//  比較是否有相同字元
				for(int j = 0;j<second.length();j++ ){
					
					if( first.charAt(i)== second.charAt(j)){	//若成立則
						output[matchnum] = first.charAt(i);		//存入結果
						secondinch[j] = ' ';					//將該字元從自元陣列中刪除再繼續比較
						matchnum++;								//符合條件字數+1
						break;
						
					}
				}
			}
			
			
			
			char tmp =' ';							//排序英文字母順序
			for(int i =0;i<matchnum;i++){
				for(int j =i+1;j<matchnum;j++){
					if(output[i]>output[j]){
						tmp = output[i];
						output[i] = output[j];
						output[j] = tmp;
						
					}
				}
			}

			
			
			for(int i = 0;i<matchnum;i++){			//輸出結果
				System.out.print(output[i]);
			}
			System.out.println();
			
		}
		
		
	}

}
