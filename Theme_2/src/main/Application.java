package main;
/*下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
動物名：ライオン
体長：2.1m
速度：80km/h
*/

import logic.animal;

public class Application {
public static void main(String[] args) {
	animal lion = new animal("ライオン",2.1,80);
	lion.displayInfo();
}
}
