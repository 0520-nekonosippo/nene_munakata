package curriculum_B;
/*【概要】for文を使用した掛け算処理
 *【詳細】縦横1ずつ9まで増えるよな式をfor文で作成する
 */
public class Qes4 {
	public class MultiplicationTable {
	    public static void main(String[] args) {
	        System.out.println("課題 4\n");

	        //縦のループを作る
	        for (int i = 1; i <= 9; i++) { 
	        	
	        	//横のループを作る
	            for (int j = 1; j <= 9; j++) {
	            	
	                // 2桁表示で九九をフォーマットする
	                System.out.print(String.format("%02d * %02d = %02d", i, j, i * j));
	                
	                //9になるまで区切り線を入れる
	                if (j < 9) {
	                    System.out.print(" || "); 
	                }
	            }
	            //改行になるようにprintlnを使用
	            System.out.println(); 
	        }
	    }
	}

}
