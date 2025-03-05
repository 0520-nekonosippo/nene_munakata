package curriculum_B;
/*【概要】for文を使用した掛け算処理
 *【詳細】縦横ともに20になるまで１ずつ増える掛け算の式を作成する、
 */

public class Qes5 {
	public class MultiplicationTable {
		public static void main(String[] args) {
			System.out.println("課題 5\n");

			// 横のループを作る
			for (int i = 1; i <= 9; i++) {
				// 縦のループを作る
				for (int j = 1; j <= 20; j++) {

					// フォーマットを作成
					System.out.print(String.format("%02d * %02d = %03d", j, i, j * i));
					if (j < 20) {

						// 区切り線を入れる
						System.out.print(" || ");
					}
				}
				// 改行になるようにprintlnを使用
				System.out.println();
			}
		}
	}

}
