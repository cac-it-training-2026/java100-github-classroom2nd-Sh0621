/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		double citronBuyCount = Double.parseDouble(citronBuyCountStr);

		System.out.print("ショコラ      >");
		String chocolatBuyCountStr = br.readLine();
		double chocolatBuyCount = Double.parseDouble(chocolatBuyCountStr);

		System.out.print("ピスターシュ  >");
		String pistacheBuyCountStr = br.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCountStr);

		System.out.println("\nシトロン     " + citronBuyCount + "個");
		System.out.println("ショコラ     " + chocolatBuyCount + "個");
		System.out.println("ピスターシュ " + pistacheBuyCount + "個");

		double totalcount = citronBuyCount + chocolatBuyCount + pistacheBuyCount;
		double totalprice = 250 * citronBuyCount + 280 * chocolatBuyCount + 320 * pistacheBuyCount;

		System.out.println("合計個数" + totalcount + "個");
		System.out.println("合計金額" + totalprice + "円");
		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		citStock = (int) (citStock - citronBuyCount);
		choStock = (int) (choStock - chocolatBuyCount);
		pisStock = (int) (pisStock - pistacheBuyCount);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + citStock);
		System.out.println("ショコラ      \\280・・・残り" + choStock);
		System.out.println("ピスターシュ  \\320・・・残り" + pisStock);

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。\n");
		System.out.println("売上の割合");
		System.out.println("売上の合計      \\" + totalprice);
		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * citronBuyCount) + "・・・ "
				+ (int) ((250 * citronBuyCount) / totalprice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocolatBuyCount) + "・・・ "
				+ (int) ((280 * chocolatBuyCount) / totalprice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pistacheBuyCount) + "・・・ "
				+ (int) ((320 * pistacheBuyCount) / totalprice * 100) + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味    ・・・" + (int) ((250 * citronBuyCount) / totalprice * 100) + "%");
		System.out.println("ショコラの味    ・・・" + (int) ((280 * chocolatBuyCount) / totalprice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) ((320 * pistacheBuyCount) / totalprice * 100) + "%");

		System.out.println("\nが楽しめます！");

		System.out.println("\n値段は\\" + (((int) totalprice / (int) totalcount) / 10 * 10) + "です。");

	}
}
