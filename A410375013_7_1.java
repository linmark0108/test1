import java.util.Scanner;

public class A410375013_7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String first = sc.nextLine();			//��J�⦸
			String second = sc.nextLine();
			
			int max ;
			if(first.length()>second.length()){		//��X�̦h�i��ۦP�r����
				max = first.length();
			}
			else{
				max = second.length();
			}

			int matchnum = 0;						//�p��u���ۦP�r����
			char[] secondinch = second.toCharArray();	//�N�r��G�ର�ۤ��}�C
			
			char [] output = new char[max];			//�ŧi�ۤ��}�C�ΥH�s�񵲪G
			
			for(int i =0;i<first.length();i++){		//  ����O�_���ۦP�r��
				for(int j = 0;j<second.length();j++ ){
					
					if( first.charAt(i)== second.charAt(j)){	//�Y���߫h
						output[matchnum] = first.charAt(i);		//�s�J���G
						secondinch[j] = ' ';					//�N�Ӧr���q�ۤ��}�C���R���A�~����
						matchnum++;								//�ŦX����r��+1
						break;
						
					}
				}
			}
			
			
			
			char tmp =' ';							//�Ƨǭ^��r������
			for(int i =0;i<matchnum;i++){
				for(int j =i+1;j<matchnum;j++){
					if(output[i]>output[j]){
						tmp = output[i];
						output[i] = output[j];
						output[j] = tmp;
						
					}
				}
			}

			
			
			for(int i = 0;i<matchnum;i++){			//��X���G
				System.out.print(output[i]);
			}
			System.out.println();
			
		}
		
		
	}

}
