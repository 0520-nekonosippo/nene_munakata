package curriculum_B;
/*【概要】在庫管理表作成
 *【詳細】パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品の在庫は表示されるシステムを作成する
 */

// ランダムに数が表示されるようにし、コンソール入力もできるようにする
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 入力をさせる
        System.out.println("商品名カンマ区切りで入力してください: ");
        
        // 入力を受け取り、コンマで区切った配列にする
        String input = scanner.nextLine();
        String[] products = input.split(",");
        
        // 拡張for文を使用し要素を一つずつ取り出す
        for (String product : products) {
            product = product.trim();
            
            // 0~11までのランダムな数を出すようにする
            int stock = random.nextInt(12); 
            
            // switchを使用し、各分岐ごとの処理を指定する
            switch (product) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.printf("%sの残り台数は%d台です%n", product, stock);
                    System.out.println(); 
                    break;
                //テレビとディスプレイは同じものとし、ディスプレイが出た場合は11からランダムで引いた数を表示する    
                case "テレビ":
                case "ディスプレイ":
                    int tvStock = 11 - random.nextInt(12);
                    System.out.printf("%sの残り台数は%d台です%n", product, tvStock);
                    
                    System.out.println();
                    break;
                    
                //対象外のものが入力された際の処理を作成    
                default:
                    System.out.printf("『%s』は指定の商品ではありません%n", product);
                    System.out.println();
            }
        }
        scanner.close();
    }
}