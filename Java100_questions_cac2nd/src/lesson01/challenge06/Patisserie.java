/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("\n本日のおすすめ商品です。\n");

		int citStock = 30;
		int choStock = 30;
		int pisStock = 30;

		System.out.println("シトロン      \\250・・・残り" + citStock + "個");
		System.out.println("ショコラ      \\280・・・残り" + choStock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisStock + "個");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン      >");
		String citronBuyCountStr = br.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		int chocolatBuyCount = Integer.parseInt(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		int totalcount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		int totalprice = 250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount;

		System.out.println("合計個数" + totalcount + "個");
		System.out.println("合計金額" + totalprice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citStock = citStock - citronBuyCount;
		choStock = choStock - chocolatBuyCount;
		pisStock = pisStock - pistacheBuyCount;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + citStock);
		System.out.println("ショコラ      \\280・・・残り" + choStock);
		System.out.println("ピスターシュ  \\320・・・残り" + pisStock);
	}
}
