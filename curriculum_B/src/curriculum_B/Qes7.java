package curriculum_B;
/*【概要】成績表作成処理
 *【詳細】N人の生徒の成績を管理するプログラムを下記条件で作成
 *     N人の生徒の成績を入力できるようにする
 *     入力値は上から英語・数学・理科・社会の点数とする
 *     各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力
 *     このプログラムの実行は必ず1回以上行われるようにする
 */

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 科目リスト
		String[] subjects = { "英語", "数学", "理科", "社会" };
		int numSubjects = subjects.length;

		// 生徒の人数を入力
		int numStudents;
		while (true) {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			if (scanner.hasNextInt()) {
				numStudents = scanner.nextInt();
				if (numStudents >= 2)
					break;
			} else {
				scanner.next();
			}
			System.out.println("⚠ 2以上の数字を入力してください！");
		}

		// 成績を保存する配列
		double[][] scores = new double[numStudents][numSubjects];

		// 各科目の合計点
		double[] subjectSums = new double[numSubjects];

		// 各生徒の成績を入力
		for (int i = 0; i < numStudents; i++) {
			System.out.println("\n" + (i + 1) + "人目の成績を入力してください");
			for (int j = 0; j < numSubjects; j++) {
				while (true) {
					System.out.printf("%d人目の『%s』の点数を入力してください: ", (i + 1), subjects[j]);
					if (scanner.hasNextDouble()) {
						scores[i][j] = scanner.nextDouble();
						subjectSums[j] += scores[i][j];
						break;
					} else {
						scanner.next();
						System.out.println("⚠ 数値を入力してください！");
					}
				}
			}
		}

		// 各生徒の平均点を計算＆出力
		System.out.println();
		double totalSum = 0;
		int totalCount = numStudents * numSubjects;

		for (int i = 0; i < numStudents; i++) {
			double studentSum = 0;
			for (int j = 0; j < numSubjects; j++) {
				studentSum += scores[i][j];
			}
			double studentAverage = studentSum / numSubjects;
			totalSum += studentSum;
			System.out.printf("%d人目の平均点は %.2f 点です。\n", (i + 1), studentAverage);
		}

		// 各科目の平均点を計算＆出力
		System.out.println();
		for (int j = 0; j < numSubjects; j++) {
			double subjectAverage = subjectSums[j] / numStudents;
			System.out.printf("%sの平均点は %.2f 点です。\n", subjects[j], subjectAverage);
		}

		// 全体の平均点を計算＆出力
		double totalAverage = totalSum / totalCount;
		System.out.printf("\n全体の平均点は %.2f 点です。\n", totalAverage);

		scanner.close();
	}
}
