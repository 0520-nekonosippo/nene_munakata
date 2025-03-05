package curriculum_B;

/*【概要】ログイン時の入力チェックシステム作成
 *【詳細】コンソールに名前が入力できるようにする。
 *　　　　文字数が10文字以上だった場合→名前を10文字以内にしてください
 *　　　　文字数が0文字以下もしくはnullの場合→名前を入力してください
 *　　　　ユーザー名が正常だった場合→ユーザー名（入力したユーザー名）を登録しました
 *     半角英数字以外の場合→半角英数字のみで名前を入力してください
 */
// コンソールに名前が入力できるようにする
import java.util.Scanner;
import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String username = scanner.nextLine();

		// エラーチェック
		if (username == null || username.isEmpty()) {
			System.out.print("「名前を入力してください」");
		} else if (username.length() > 10) {
			System.out.print("「名前を10文字以内にしてください」");
		} else if (!username.matches("^[a-zA-Z0-9]+$")) {
			System.out.print("「半角英数字のみで名前を入力してください」");
		} else {
			System.out.print("ユーザー名「" + username + "」を登録しました");

			/*
			 * 【概要】じゃんけんシステムの作成 【詳細】ユーザー名が入力出来たらじゃんけんができるシステムを作成する
			 */
			// じゃんけんの手がランダムになるように設定
			Random random = new Random();

			// じゃんけんを行った回数をカウントする変数
			int count = 0;

			// 勝つまでループするよう設定
			while (true) {

				// じゃんけんの回数をカウント
				count++;

				// ユーザーの手の表示
				System.out.println("\n0: グー, 1: チョキ, 2: パー を選んでください");
				System.out.print(username + "の手: ");

				// ユーザーの手が入力されたかチェックする
				int userHand;

				while (true) {
					if (scanner.hasNextInt()) {
						userHand = scanner.nextInt();
						if (userHand >= 0 && userHand <= 2) {
							break;
						}
					} else {
						scanner.next();
					}
					System.out.print("0, 1, 2 のいずれかを入力してください: ");
				}
				// コンピュータ側の手を決める
				int cpuHand = random.nextInt(3);

				// じゃんけんの手を表示
				String[] hands = { "グー", "チョキ", "パー" };
				System.out.println(username + "の手は『" + hands[userHand] + "』");
				System.out.println("相手の手は『" + hands[cpuHand] + "』");

				// あいこの時の処理
				if (userHand == cpuHand) {
					System.out.println("DRAW あいこ もう一回しましょう！");

					// userが勝った時の処理
				} else if ((userHand == 0 && cpuHand == 1) || (userHand == 1 && cpuHand == 2)
						|| (userHand == 2 && cpuHand == 0)) {
					System.out.println("やるやん。\n次は俺にリベンジさせて");
					System.out.println("勝つまでにかかった合計回数は " + count + " 回です");
					break;

					// userが負けたときの処理
				} else {
					System.out.println("俺の勝ち！");
					if (cpuHand == 0) {
						System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
					} else if (cpuHand == 1) {
						System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
					} else {
						System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
					}
				}
			}

		}

	}
}