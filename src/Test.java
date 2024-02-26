
public class Test {

	public static void main(String[] args) {

		//山田太郎--------------------
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumbeer = "080-9999-0000";
		taro.address = "qq@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumbeer);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		//木村次郎--------------------
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumbeer = "080-9999-0000";
		jiro.address = "qq@gmail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumbeer);
		System.out.println(jiro.address);

		//鈴木花子--------------------
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumbeer = "080-9999-0000";
		hanako.address = "qq@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumbeer);
		System.out.println(hanako.address);

		//中山湧登--------------------
		Person yuto = new Person();
		yuto.name = "中山湧登";
		yuto.age = 24;
		yuto.phoneNumbeer = "080-9999-0000";
		yuto.address = "qq@gmail.com";

		System.out.println(yuto.name);
		System.out.println(yuto.age);
		System.out.println(yuto.phoneNumbeer);
		System.out.println(yuto.address);

	}

}
